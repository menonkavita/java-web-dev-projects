package org.launchcode;

public class Message {
        private boolean friendly = true;
        private String language;
        private String text;

        public Message(String aLanguage, String aText) {
            language = aLanguage;
            text = aText;
        }

        public boolean getFriendly() {
            return friendly;
        }

        public String getLanguage() {
            return language;
        }

        public String getText() {
            return text;
        }
    }



