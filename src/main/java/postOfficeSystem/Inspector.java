package postOfficeSystem;

public class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail)  {
        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            Package pack = mailPackage.getContent();
            if (pack.getContent().contains("stone")) {
                throw new StolenPackageException();
            }
            if (pack.getContent().contains("weapons") || pack.getContent().contains("banned substance")) {
                throw new IllegalPackageException();

            }

            return mailPackage;

        }
        return mail;

    }
}



