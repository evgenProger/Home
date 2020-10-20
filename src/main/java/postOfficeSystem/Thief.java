package postOfficeSystem;

public class Thief implements MailService {
    private int sumcostmin;
    private int sumthief;

    public Thief(int sumcostmin) {
        this.sumcostmin = sumcostmin;
    }
    @Override
    public Sendable processMail(Sendable mail)  {

         if (mail instanceof MailPackage) {
             MailPackage mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getPrice() > sumcostmin) {
                sumthief += mailPackage.getContent().getPrice();
                return new MailPackage(mailPackage.getFrom(), mailPackage.getTo(), new Package("stones instead of" + mailPackage.getContent().getContent(), 0));

            }
        }
         return  mail;
    }
    public int getStolenValue() {
        return sumthief;
    }
}
