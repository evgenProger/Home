package postOfficeSystem;

public class RealMailService implements MailService {


    @Override
    public Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException {
        return mail;
    }
}
