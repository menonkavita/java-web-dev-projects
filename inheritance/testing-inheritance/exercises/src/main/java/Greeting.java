
public class Greeting extends Message {
        private boolean waving;

        public Greeting(String aLanguage, String aText) {
            super(aLanguage, aText);
        }

        public boolean wave() {
            waving = true;
            return false;
        }
    }

