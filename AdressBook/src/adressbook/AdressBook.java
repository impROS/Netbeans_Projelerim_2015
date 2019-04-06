
package adressbook;
//suhan@turkserve.net

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class AdressBook extends Frame{
Label lad, lsoyad, ladres, ltelefon, lemail, kayitsayisi; 
TextField[] tf=new TextField[5];
Button ekle, sonraki, onceki; 
Dialog dialogBox;
File f;
RandomAccessFile raf;
String str;
long l=0;
int i=0, j=0, kaysay=0;
java.util.List list = new LinkedList();    

public AdressBook(){
list = new ArrayList(); //to hold the file pointers
          
f = new File("adresbook.txt");	

lad=new Label("Name         : ");
lsoyad=new Label("Surname   : ");
ladres=new Label("Address     : ");
ltelefon=new Label("Telephone : ");
lemail=new Label("E-mail         : ");

tf[0]=new TextField(20);
tf[1]=new TextField(20);
tf[2]=new TextField(40);
tf[3]=new TextField(20);
tf[4]=new TextField(20);

ekle=new Button("Add");
onceki=new Button("Previous");
sonraki=new Button("Next");
kayitsayisi=new Label("          ");

Panel p1=new Panel(new FlowLayout(FlowLayout.LEFT));
Panel p2=new Panel(new FlowLayout(FlowLayout.LEFT));
Panel p3=new Panel(new FlowLayout(FlowLayout.LEFT));
Panel p4=new Panel(new FlowLayout(FlowLayout.LEFT));
Panel p5=new Panel(new FlowLayout(FlowLayout.LEFT));

Panel p6=new Panel(new GridLayout(5,1));

Panel p7=new Panel(new FlowLayout(FlowLayout.CENTER));

p1.add(lad);
p1.add(tf[0]);
p2.add(lsoyad);
p2.add(tf[1]);
p3.add(ladres);
p3.add(tf[2]);
p4.add(ltelefon);
p4.add(tf[3]);
p5.add(lemail);
p5.add(tf[4]);

p6.add(p1);
p6.add(p2);
p6.add(p3);
p6.add(p4);
p6.add(p5);

p7.add(ekle);
p7.add(onceki);
p7.add(sonraki);
p7.add(kayitsayisi);

setLayout(new BorderLayout());
add(p6,BorderLayout.CENTER);
add(p7,BorderLayout.SOUTH);

dosyaAc();//open the file	
pack();
setTitle("AdressBook");
setVisible(true);

	
/***********************WindowListener***********************/
addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent we){
		try{raf.close();}catch(Exception e){System.out.println("Can't close the file");}
		dispose();
		System.exit(0);
		}
	});


/***********************Action Listenerlar********************/
ekle.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	if(tf[0].getText().equals("")) //check the fields are full
	dialogMesaj("Name required..."); //you can remove any of you want
	else if(tf[1].getText().equals(""))
	dialogMesaj("Surname required...");
	else if(tf[2].getText().equals(""))
	dialogMesaj("Address required...");
	else if(tf[3].getText().equals(""))
	dialogMesaj("Telephone required...");
	else if(tf[4].getText().equals(""))
	dialogMesaj("E-mail required...");	
	else{ //create the kisi(person) object
		Kisi k=new Kisi(tf[0].getText(),tf[1].getText(),tf[2].getText(),tf[3].getText(),tf[4].getText());
		System.out.println(k);
		try{
		raf.seek(f.length()); //go to the end of the file
		raf.writeBytes(k.toString());
		raf.close();
		dosyaAc(); //reopen the file
		}catch(Exception e){System.out.println("Can't write to file");}
		}	
		}
	});
	
onceki.addActionListener(new ActionListener(){ //previous button
	public void actionPerformed(ActionEvent ae){
		try {
			if(i>0){
            i--;  //to get the previous file pointer from arraylist
            raf.seek(list.get(i).hashCode()); //because of the araylist holding the Object Long, we have to get the long type of the Long object
			str = raf.readLine();
			StringTokenizer strtk=new StringTokenizer(str,">"); //parse the line 
        	while(strtk.hasMoreElements()){
        		tf[j].setText(strtk.nextToken()); //write to the textfields
        		j++; //next token
        		}
        		j=0;
        	}
        }catch(Exception e){System.out.println("Can't read from file");}
		}
	});
	
sonraki.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
		try {
			if(i<list.size()-1){
            i++; //to get the next file pointer from arraylist
 			raf.seek(list.get(i).hashCode()); //because of the araylist holding the Object Long, we have to get the long type of the Long object
            str = raf.readLine();
            StringTokenizer strtk=new StringTokenizer(str,">");//parse the line 
        	while(strtk.hasMoreElements()){
        		tf[j].setText(strtk.nextToken()); //write to the textfields
        		j++; //next token
        		}
        		j=0;
        	}
 		}catch(Exception e){System.out.println("Can't read from file");}
		}
	});
	
	
}//konstr.sonu

/*************open the file*****************/
public void dosyaAc(){
	try{
	raf = new RandomAccessFile(f, "rw");
	       while((str = raf.readLine()) != null){
            kaysay++; //record count
            list.add(new Long(l)); //add the file pointer to the arraylist
            l+=str.length()+1; //+1 for the \n (newline) character
            raf.seek(l);
            }
            raf.seek(0);
            System.out.println(list);
       		kayitsayisi.setText("     Record count : " + kaysay);
	
	/********write the first record to the textfields*********/
		str = raf.readLine();
		StringTokenizer strtk=new StringTokenizer(str,">");
        while(strtk.hasMoreElements()){
        tf[j].setText(strtk.nextToken());
        j++;
        }
        j=0;
        raf.seek(0);
		}catch(Exception e){System.out.println("Can't read from file");}
	
	}

/**********************************MESAJ***********************/
public void dialogMesaj(String str){

dialogBox=new Dialog(new Frame(),"Mesaj",true);
dialogBox.setLayout(new
BorderLayout());


Panel p1=new Panel(new FlowLayout());
Button okBtn=new Button("TAMAM");
okBtn.setForeground(Color.black);
okBtn.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
dialogBox.setVisible(false);
}
});

p1.add(okBtn);
Label l=new Label(str,Label.CENTER);
l.setFont(new Font("Courier",Font.PLAIN,14));
l.setForeground(Color.black);

dialogBox.add(l,BorderLayout.CENTER);
dialogBox.add(p1,BorderLayout.SOUTH);
dialogBox.setResizable(false);
dialogBox.setLocation(270,200);
dialogBox.pack();
dialogBox.show();
}

/**************************************MAIN**********************/
public static void main(String args[]){
	AdressBook ab=new AdressBook();
	}
}

class Kisi{
	String ad, soyad, adres, telefon, email;
	
	public Kisi(String a, String s, String ad, String t, String e){
		this.ad=a; //name
		this.soyad=s; //surname
		this.adres=ad;
		this.telefon=t;
		this.email=e;
		}
	public String toString(){ //override the toString method to write the record to the file
		return (this.ad + ">" + this.soyad + ">" + this.adres + ">" 
		+ this.telefon + ">" + this.email + "\n"); 
		}
	
	}