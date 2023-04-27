package com.example.tcss_450_team_5.ui.contacts;

import java.util.Arrays;
import java.util.List;

public class ContactGenerator {
    private static final Contact[] CONTACTS;
    public static final int COUNT = 10;

    static {
        CONTACTS = new Contact[COUNT];
        for (int i = 0; i < CONTACTS.length; i++) {
            CONTACTS[i] = new Contact.Builder("A Friend", "Friendo").build();
        }
    }

    public static List<Contact> getContactList () {
        return Arrays.asList(CONTACTS);
    }

    public static Contact[] getContacts () {
        return Arrays.copyOf(CONTACTS, CONTACTS.length);
    }

    private ContactGenerator () {

    }
}
