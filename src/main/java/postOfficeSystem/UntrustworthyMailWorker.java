package postOfficeSystem;

public class UntrustworthyMailWorker implements MailService {
    protected   MailService[] mailServices;
    protected RealMailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    @Override
    public Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException, MyClass.IllegalPackageException, MyClass.StolenPackageException {
        for(MailService mailService: mailServices) {
            mail = mailService.processMail(mail);
        }

        return realMailService.processMail(mail);

    }

    public RealMailService getRealMailService() {
        return realMailService;
    }
}







