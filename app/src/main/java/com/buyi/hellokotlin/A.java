package com.buyi.hellokotlin;

import android.support.annotation.Nullable;

/**
 * Created by buyi on 16/2/19.
 */
public class A {
    public void sendMessageToClient(
            @Nullable Client client,
            @Nullable String message,
            Mailer mailer
    ) {
        if (client == null || message == null) return;

        PersonalInfo personalInfo = client.getPersonalInfo();
        if (personalInfo == null) return;

        String email = personalInfo.getEmail();
        if (email == null) return;

        mailer.sendMessage(email, message);
    }

    class Client {
        public PersonalInfo getPersonalInfo() {
            return personalInfo;
        }

        public void setPersonalInfo(PersonalInfo personalInfo) {
            this.personalInfo = personalInfo;
        }

        PersonalInfo personalInfo;
        public Client (PersonalInfo personalInfo) {
            this.personalInfo = personalInfo;
        }

    }
    class PersonalInfo {


        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        String  email;
        public PersonalInfo (String email) {
            this.email = email;
        }

    }
    interface Mailer {
         void sendMessage(String email , String message);
    }
}
