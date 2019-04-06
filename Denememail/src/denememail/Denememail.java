
package denememail;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.text.GapContent;
public class Denememail {

    public static void main(String[] args)
    {
//Class anahtarı oluşturuyoruz.
		mailGonder gonderici = new mailGonder();
		//Anahtar ile foksiyonumuzu çağırıyoruz ve bilgileri giriyoruz.
		gonderici.mailSend("gonderlicekadres", "konu", "mesaj");
	}
	//Mail gönderici fonksiyon
	public void mailSend (String mailaddress, String subject, String text){
		//Kullanıcı adı ve şifre girişi
        final String username = "dene";
        final String password = "haci.impROS"; 
        //Mail konfigurasyonları
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
 
        Session session = Session.getInstance(props,
                      new javax.mail.Authenticator() {
               protected PasswordAuthentication getPasswordAuthentication() {
                      return new PasswordAuthentication(username, password);
               }
        }); 
        try {
        	   //Maili gonderdiğimiz kısım
               Message message = new MimeMessage(session);
               message.setFrom(new InternetAddress("x.impROS.x@gmail.com"));
               message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(mailaddress)); 
               message.setSubject(subject);
               message.setText(text); 
               Transport.send(message);
 
        } catch (MessagingException e) {
               throw new RuntimeException(e);
        }
    
}
