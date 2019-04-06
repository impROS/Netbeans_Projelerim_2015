
package testmailmıme;
import java.io.*;
import java.net.*;

public class TestMailMIME {
  static  int SMTPport =  465;
  static  Socket  socket;
  static  DataInputStream in;
  static  DataOutputStream out;
  static  PrintStream prout;

  /* Name of file to be sent. */
  String FileName = "mouse.gif";

 public static void main(String s[]) {
  /*
  ** TestMailMIME [server] [recipient]
  */
  TestMailMIME t = new TestMailMIME();
  t.sendMail("smtp.gmail.com", "x.impROS.x@gmail.com");
 }

 public void sendMail(String mailServer, String recipient) {
  System.out.println("Send mail with attached file ");
  try {
    Socket s = new Socket(mailServer, 465);
    BufferedReader in = new BufferedReader
      (new InputStreamReader(s.getInputStream(), "8859_1"));
    BufferedWriter out = new BufferedWriter
      (new OutputStreamWriter(s.getOutputStream(), "8859_1"));

    String boundary = "DataSeparatorString";

    // here you are supposed to send your username
    sendln(in, out, "HELO theWorld");
    // warning : some mail server validate the sender address
    //           in the MAIL FROM command, put your real address here
    sendln(in, out, "MAIL FROM:<x.impROS.x@gmail.com>");
    sendln(in, out, "RCPT TO: <" + recipient + ">" );
    //   to have more than one recipient, repeat
    //      sendln(in, out, "RCPT TO: <" + recipient2 + ">" );
    //      sendln(in, out, "RCPT TO: <" + recipient3 + ">" );
    //      etc...
    //   thanks to  P-Y Colle for the tip!
    sendln(in, out, "DATA");
    sendln(out, "MIME-Version: 1.0");
    sendln(out, "Subject: remember me");
    sendln(out, "From: Elvis Presley <x.impROS.x@gmail.com>");
    sendln
     (out, "Content-Type: multipart/mixed; boundary=\"" + boundary +"\"");
    sendln(out, "\r\n--" + boundary);

    // Send the body
    sendln(out, "Content-Type: text/plain; charset=\"us-ascii\"\r\n");
    sendln(out, "I'm alive. Help me!\r\n\r\n");
    sendln(out, "\r\n--" +  boundary );

    // send the GIF
    sendln(out, "Content-Type:image/gif; name="+FileName);
    sendln
      (out, "Content-Disposition: attachment;filename=\""+FileName+"\"");
    sendln(out, "Content-transfer-encoding: base64\r\n");
    MIMEBase64.encode(FileName, out);
    sendln(out, "\r\n--" + boundary);

    sendln(out, "\r\n\r\n--" + boundary + "--\r\n");
    sendln(in, out,".");
    sendln(in, out, "QUIT");
    s.close();
  }
  catch (Exception e) {
    e.printStackTrace();
  }
 }

 public void sendln(BufferedReader in, BufferedWriter out, String s) {
  try {
    out.write(s + "\r\n");
    out.flush();
    // System.out.println(s);
    s = in.readLine();
    // System.out.println(s);
  }
  catch (Exception e) {
    e.printStackTrace();
  }
 }

 public void sendln(BufferedWriter out, String s) {
   try {
    out.write(s + "\r\n");
    out.flush();
    System.out.println(s);
   }
   catch (Exception e) {
    e.printStackTrace();
   }
 }
}