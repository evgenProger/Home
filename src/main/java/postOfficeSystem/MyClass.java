package postOfficeSystem;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MyClass {

    public static class Inspector implements MailService {

        @Override
        public Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException {
            if (mail instanceof MailPackage) {
                MailPackage mailPackage = (MailPackage) mail;
                Package pack = mailPackage.getContent();
                if (pack.getContent().contains("stone")) {
                    throw new StolenPackageException();
                }
                if (pack.getContent().contains("weapons") || pack.getContent().contains("banned substance ")) {
                    throw new IllegalPackageException();

                }

                return mailPackage;

            }
            return mail;

        }
    }

    public static class Thief implements MailService {
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
                    return new MailPackage(mailPackage.getFrom(), mailPackage.getTo(), new Package("stones inststed of" + mailPackage.getContent().getContent(), 0));

                }
            }
            return  mail;
        }
        public int getStolenValue() {
            return sumthief;
        }
    }

    public static class Spy implements MailService {

        private  Logger logger;

        public Spy(Logger logger) {
            this.logger = logger;
        }

        @Override
        public Sendable processMail(Sendable mail)  {
            if (mail instanceof MailMessage) {
                MailMessage mailMessage = (MailMessage) mail;
                if (mailMessage.getTo().equals("Austin Powers") || mailMessage.getFrom().equals("Austin Powers")) {
                    logger.log(Level.WARNING, "Detected target mail correspondence: from" + mailMessage.getFrom() + "to" + mailMessage.getTo());
                } else {
                    logger.log(Level.INFO, "Usual correspondence: from" + mailMessage.getFrom() + "to" + mailMessage.getTo());
                }


            }
            return mail;
        }

    }

    public static class UntrustworthyMailWorker implements MailService {
        protected   MailService[] mailServices;
        protected RealMailService realMailService;

        public UntrustworthyMailWorker(MailService[] mailServices) {
            this.mailServices = mailServices;
        }

        @Override
        public Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException, postOfficeSystem.IllegalPackageException, postOfficeSystem.StolenPackageException {
            for(MailService mailService: mailServices) {
                mail = mailService.processMail(mail);
            }

            return realMailService.processMail(mail);

        }

        public RealMailService getRealMailService() {
            return realMailService;
        }
    }

    public static class StolenPackageException extends Exception {
    }

    public static class IllegalPackageException extends Exception {
    }
}




