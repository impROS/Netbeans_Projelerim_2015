
//**************************************
// Name: File transfer application
// Description:transfer files on a network
// By: Ali Ezad Abbas (from psc cd)
//
//
// Inputs:None
//
// Returns:None
//
//Assumes:None
//
//Side Effects:None
//**************************************

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


    public class Ftps extends Frame {
    public static String hostAddress = "";
    public static int portNumber = 0, maxClients = 0;
    public static Vector sockets = null;
    public static Ftps tp;
    public static String fileName = "",path = "";
    public static int check = 0;
    public static Socket connection = null;
    public static ObjectOutputStream out = null;
    public static ObjectInputStream in = null;


        public static void main (String [] args) throws IOException {
        BufferedReader stdin = new BufferedReader
        (new InputStreamReader (System.in));
        System.out.println("1. Connect to host");
        System.out.println("2. Wait for connections");
        System.out.println();
        System.out.print("Please make a choice: ");
        System.out.flush();
        int choice = Integer.parseInt(stdin.readLine());


            if (choice == 1) {
            System.out.print("Please type in the host address: ");
            System.out.flush();
            hostAddress = stdin.readLine();
            System.out.print("Please type in the host port number: ");
            System.out.flush();
            portNumber = Integer.parseInt(stdin.readLine());
        }


            if (choice == 2) {
            System.out.print("Give the port number to listen for requests: ");
            System.out.flush();
            portNumber = Integer.parseInt(stdin.readLine());
            System.out.print("Give the maximum number of clients for this server: ");
            System.out.flush();
            maxClients = Integer.parseInt(stdin.readLine());
        }
        tp = new Ftps(choice);
    }
    public Label l;
    public TextField tf;
    public Button browse;
    public Button send;
    public Button reset;


        public Ftps (int c) {
        setTitle("Ezad's File Transfer Protocol");
        setSize(300 , 350);
        setLayout(null);
        addWindowListener(new WindowAdapter () { public void windowClosing (WindowEvent e) { System.exit(0); } } );
        l = new Label("File:");
        add(l);
        l.setBounds(15,87,50,20);
        tf = new TextField("");
        add(tf);
        tf.setBounds(13,114,200,20);
        browse = new Button("Browse");
        browse.addActionListener(new buttonListener());
        add(browse);
        browse.setBounds(223,113,50,20);
        send = new Button("Send");
        send.addActionListener(new buttonListener());
        add(send);
        send.setBounds(64,168,50,20);
        reset = new Button("Reset");
        reset.addActionListener(new buttonListener());
        add(reset);
        reset.setBounds(120,168,50,20);
        show();


            if (c == 1) {
            check = 10;


                try {
                connection = new Socket (hostAddress,portNumber);
                out = new ObjectOutputStream(connection.getOutputStream());
                out.flush();
                in = new ObjectInputStream(connection.getInputStream());
                int flag = 0;


                    while (true) {
                    Object recieved = in.readObject();


                        switch (flag) {
                        case 0:


                            if (recieved.equals("sot")) {
                            flag++;
                        }
                        break;
                        case 1:
                        fileName = (String) recieved;
                        int option = JOptionPane.showConfirmDialog(this,connection.getInetAddress().getHostName()+" is sending you "+fileName+"!\nDo you want to recieve it?","Recieve Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);


                            if (option == JOptionPane.YES_OPTION) {
                            flag++;


                            } else {
                            flag = 0;
                        }
                        break;
                        case 2:
                        byte[] b = (byte[])recieved;
                        FileOutputStream ff = new FileOutputStream(fileName);
                        //ObjectOutputStream o = new ObjectOutputStream(ff);
                        //o.writeObject(b);
                        //o.flush();
                        //o.close();
                        ff.write(b);
                        flag = 0;
                        //out.writeObject("rcn");
                        JOptionPane.showMessageDialog(this,"File Recieved!","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                    Thread.yield();
                }
            } catch (Exception e) {System.out.println(e);}
        }


            if (c == 2) {
            sockets = new Vector();
            check = 5;


                try {
                ServerSocket connect = new ServerSocket(portNumber,maxClients);


                    while (true) {
                    sockets.addElement(new ThreadedSocket(connect.accept()));
                    Thread.yield();
                }
            } catch (IOException ioe) {System.out.println(ioe);}
        }
    }


        public static String showDialog () {
        FileDialog fd = new FileDialog(new Frame(),"Select File...",FileDialog.LOAD);
        fd.show();
        return fd.getDirectory()+fd.getFile();
    }


        private class buttonListener implements ActionListener {


            public void actionPerformed (ActionEvent e) {
            byte[] array = null;


                if (e.getSource() == browse) {
                path = showDialog();
                tf.setText(path);
                int index = path.lastIndexOf("\\");
                fileName = path.substring(index+1);
            }


                if (e.getSource() == send) {


                    //if (fileName != null && !fileName.equals("")) {


                        try {
                        FileInputStream f = new FileInputStream (path);
                        int size = f.available();
                        array = new byte[size];
                        f.read(array,0,size);


                            if (check == 5) {


                                for (int i=0;i<sockets.size();i++) {
                                ThreadedSocket temp = (ThreadedSocket)sockets.elementAt(i);
                                temp.out.writeObject("sot");
                                temp.out.flush();
                                temp.out.writeObject(fileName);
                                temp.out.flush();
                                temp.out.writeObject(array);
                                temp.out.flush();
                            }
                        }


                            if (check == 10) {
                            out.writeObject("sot");
                            out.flush();
                            out.writeObject(fileName);
                            out.flush();
                            out.writeObject(array);
                            out.flush();
                        }
                        JOptionPane.showMessageDialog(null,"File Sent!","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception ex) {}
                    //}
                }


                    if (e.getSource() == reset) {
                    tf.setText("");
                }
            }
        }
    }


        class ThreadedSocket extends Thread {
        public Socket socket;
        public ObjectInputStream in;
        public ObjectOutputStream out;


            public ThreadedSocket (Socket s) {
            socket = s;


                try {
                out = new ObjectOutputStream(socket.getOutputStream());
                out.flush();
                in = new ObjectInputStream(socket.getInputStream());
            } catch (Exception e) {System.out.println(e);}
            start();
        }


            public void run () {


                try {
                int flag = 0;
                String fileName = "";


                    while (true) {
                    Object recieved = in.readObject();


                        switch (flag) {
                        case 0:


                            if (recieved.equals("sot")) {
                            flag++;
                        }
                        break;
                        case 1:
                        fileName = (String) recieved;
                        int option = JOptionPane.showConfirmDialog(null,socket.getInetAddress().getHostName()+" is sending you "+fileName+"!\nDo you want to recieve it?","Recieve Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);


                            if (option == JOptionPane.YES_OPTION) {
                            flag++;


                            } else {
                            flag = 0;
                        }
                        break;
                        case 2:
                        byte[] b = (byte[])recieved;
                        FileOutputStream ff = new FileOutputStream(fileName);
                        //ObjectOutputStream o = new ObjectOutputStream(ff);
                        //o.writeObject(b);
                        //o.flush();
                        ff.write(b);
                        flag = 0;
                        //out.writeObject("rcn");
                        JOptionPane.showMessageDialog(null,"File Recieved!","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                    Thread.yield();
                }
            } catch (Exception e) {System.out.println(e);}
        }
    }

		
