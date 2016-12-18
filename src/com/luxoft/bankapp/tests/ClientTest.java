package com.luxoft.bankapp.tests;

import com.luxoft.bankapp.model.Client;
import org.junit.Test;

import static com.luxoft.bankapp.model.Client.Gender;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Gosh on 18.12.2016.
 */
public class ClientTest {
    @Test
    public void equalsMethodTest() {
        Client clientAnna = new Client("Anna", Gender.FEMALE);
        Client clientAnnaSecond = new Client("Anna", Gender.FEMALE);
        Client clientBob = new Client("Bob", Gender.MALE);
        assertFalse(clientAnna.equals(clientBob));
        assertFalse(clientAnna.equals(clientAnnaSecond));
    }
}
