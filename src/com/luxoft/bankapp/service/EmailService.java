package com.luxoft.bankapp.service;

import com.luxoft.bankapp.model.Email;

/**
 * Created by Gosh on 27.12.2016.
 * Nothing special
 */
public interface EmailService {

    void sendNotificationEmail(Email email);
}
