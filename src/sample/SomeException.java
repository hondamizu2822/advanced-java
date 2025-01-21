package sample;

public class SomeException extends RuntimeException{
    public SomeException () {}

        public SomeException(String message) {
            super(message);
        }
    
        public SomeException(Throwable cause) {
            super(cause);
        }
    
        public SomeException(String message, Throwable cause) {
            super(message, cause);
        }
}


