package com.luxoft.bankapp.tests;

import com.luxoft.bankapp.model.Client;
import com.luxoft.bankapp.model.Email;
import com.luxoft.bankapp.service.EmailService;
import com.luxoft.bankapp.service.EmailServiceImpl;
import org.junit.Test;

/**
 * Created by Gosh on 27.12.2016.
 * Nothing special
 */
public class EmailServiceTest {

    @Test
    public void sendNotificationEmailTest() {
        EmailService emailService = new EmailServiceImpl();
        Email email = new Email().setEmailAddress("test@mail.ru")
                .setEmailBody("TestText")
                .setClient(new Client("Anna", Client.Gender.FEMALE));
        emailService.sendNotificationEmail(email);

    }
}
