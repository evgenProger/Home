package bankclient;

public class BadCreditHistoryException extends Exception {
    BadCreditHistoryException(String msg) {
        super(msg);
    }
}
