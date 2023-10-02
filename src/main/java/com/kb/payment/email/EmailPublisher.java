package com.kb.payment.email;

import jakarta.mail.*;
import jakarta.mail.internet.*;

import java.util.Properties;

public class EmailPublisher {

    public static void main(String[] args) throws MessagingException {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.mailtrap.io");
        prop.put("mail.smtp.port", "25");
        prop.put("mail.smtp.ssl.trust", "smtp.mailtrap.io");


        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("mohanputtamadaiah@gmail.com", "Aneesh@12");
            }
        });


        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("mohanputtamadaiah@gmail.com"));
        message.setRecipients(
                Message.RecipientType.TO, InternetAddress.parse("kannada.balaga.belfast@gmail.com"));
        message.setSubject("Mail Subject");

        String msg = "This is my first email using JavaMailer";

        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(msg, "text/html; charset=utf-8");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);

        message.setContent(multipart);

        Transport.send(message);
    }
}
