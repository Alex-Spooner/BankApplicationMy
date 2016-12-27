package com.luxoft.bankapp.model;

/**
 * Created by Gosh on 27.12.2016.
 * Nothing special
 */
public class Email {
    private Client client;
    private String emailAddress;
    private String emailBody;

    public Client getClient() {
        return client;
    }

    public Email setClient(Client client) {
        this.client = client;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Email setEmailAddress(String emailAddress) {

        this.emailAddress = emailAddress;
        return this;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public Email setEmailBody(String emailBody) {

        this.emailBody = emailBody;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Email{");
        sb.append("client=").append(client.toString());
        sb.append(", emailAddress='").append(emailAddress).append('\'');
        sb.append(", emailBody='").append(emailBody).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
