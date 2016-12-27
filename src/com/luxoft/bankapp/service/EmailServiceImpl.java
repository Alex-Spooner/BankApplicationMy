package com.luxoft.bankapp.service;

import com.luxoft.bankapp.model.Email;
import com.luxoft.bankapp.model.Queue;
import com.luxoft.bankapp.utils.Logger;

import java.util.Iterator;

/**
 * Created by Gosh on 27.12.2016.
 * Nothing special
 */
public class EmailServiceImpl implements EmailService {

    Queue queue;

    public EmailServiceImpl() {
        queue = new Queue();
    }

    @Override
    public void sendNotificationEmail(Email email) {
        queue.addMail(email);
        Thread sender = new Thread(new Sender());
        sender.start();
        try {
            sender.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    class Sender implements Runnable {

        @Override
        public void run() {
            Iterator<Email> iterator = queue.getIterator();
            while (iterator.hasNext()) {
                Logger.log(iterator.next().toString());
                iterator.remove();
            }
        }
    }
}
