import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Application {

    public static void main(String[] args) {
        final String username = "andrei.mladin@gmail.com";
        final String password = "ldwvisqsjafxszfp";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("andrei.mladin@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("andrei.mladin@gmail.com," +
                            "acomanoaibeniaminstefan@gmail.com," +
                            "radumbaciu@gmail.com," +
                            "bbabel06.ab@gmail.com," +
                            "hadjiu.marcel@gmail.com," +
                            "libenciuc.adrian@yahoo.com," +
                            "amaximoaiei.l@yahoo.com," +
                            "madamacioca@yahoo.com," +
                            "manciurazvan@gmail.com," +
                            "florentina.mirisan@yahoo.ro," +
                            "teofil.mitrea@yahoo.com," +
                            "darius.moholea.dev@gmail.com, " +
                            "emily_schmal@yahoo.com," +
                            "sami_nychitelea@yahoo.com," +
                            "diana.pop.v@gmail.com," +
                            "sastrasalina@gmail.com," +
                            "ursan.bia@gmail.com")
            );
            message.setSubject("Welcome to Java Advanced");
            message.setText("Va rugam sa nu incercati asta acasa,"
                    + "\n\n Please do not spam my email!");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
