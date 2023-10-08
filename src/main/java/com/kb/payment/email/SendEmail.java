package com.kb.payment.email;

import com.kb.payment.dto.SubmitRequestDto;
import com.kb.payment.policy.EmailService;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class SendEmail implements EmailService {

    @Override
    public void sendEmail(SubmitRequestDto submitRequestDto) {
        // Sender's Gmail email address and password
        final String senderEmail = "mohanputtamadaiah@gmail.com";
        final String senderPassword = null ;

        // Recipient's email address
        String recipientEmail = "mohan.p3@gmail.com";

        // Set up JavaMail properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // Create a Session object with the Gmail account's credentials
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create a MimeMessage object
            Message message = new MimeMessage(session);

            // Set the sender's email address
            message.setFrom(new InternetAddress(senderEmail));

            // Set the recipient's email address
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));

            // Set the email subject and content
            message.setSubject("JavaMail API Test");
            message.setText("This is a test email sent from Java.");

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully!");

            //"bmbb frdl luhl hlsp";

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
