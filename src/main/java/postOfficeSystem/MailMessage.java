package postOfficeSystem;

/*
    Письмо у которого есть текст, который можно получить с вомощью метода getMessage
 */

public class MailMessage extends AbstractSendable {
    private final String message;

    public MailMessage(String from, String to, String message) {
        super(from, to);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MailMessage that = (MailMessage) obj;
        if (!message.equals(that.message)) return false;
        return true;

    }
}
