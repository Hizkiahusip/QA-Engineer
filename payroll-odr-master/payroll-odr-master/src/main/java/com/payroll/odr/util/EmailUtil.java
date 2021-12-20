package com.payroll.odr.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;

@Service
public class EmailUtil {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private Environment env;
    
    public void sendEmail(String to, String subject, String text) {
        new Thread(() -> {
            try {
                MimeMessagePreparator messagePreparator = mimeMessage -> {
                    InternetAddress address = new InternetAddress(to);

                    mimeMessage.setFrom(env.getProperty("spring.mail.username"));
                    mimeMessage.setRecipient(Message.RecipientType.TO, address);
                    mimeMessage.setSubject(subject);
                    mimeMessage.setText(text);
                    mimeMessage.setContent(text, "text/html");
                };

                mailSender.send(messagePreparator);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

}
