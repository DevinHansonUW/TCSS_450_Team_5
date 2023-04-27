package com.example.tcss_450_team_5.ui.contacts;

import java.io.Serializable;

public class Contact implements Serializable {
    private final String myName;
    private final String myUsername;

    public static class Builder {
        private final String myName;
        private final String myUsername;

        public Builder (final String theName, final String theUsername) {
            this.myName = theName;
            this.myUsername = theUsername;
        }

        public Contact build () {
            return new Contact(this);
        }
    }

    private Contact (final Builder builder) {
        this.myName = builder.myName;
        this.myUsername = builder.myUsername;
    }

    public String getMyName () {
        return myName;
    }

    public String getMyUsername () {
        return myUsername;
    }
}
