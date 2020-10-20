package postOfficeSystem;

/*
    Посылка, содержимое которой можно получить с помощью метода getContent
 */

public class MailPackage extends AbstractSendable {
    private final Package content;


    public MailPackage(String from, String to,Package content) {
       super(from, to);
        this.content = content;
    }


    public Package getContent() {
        return content;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MailPackage that = (MailPackage) obj;
         if (!content.equals(that.content)) return false;
         return true;
    }
}
