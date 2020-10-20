


package postOfficeSystem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    private String from;
    private String to;
    private String message;
    private  Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail)  {
        if (mail instanceof MailMessage) {
            MailMessage mailMessage = (MailMessage) mail;
            from = mailMessage.getFrom();
            to = mailMessage.getTo();
            message = mailMessage.getMessage();
            if (mailMessage.getFrom().contains("Austin Powers") || mailMessage.getTo().contains("Austin Powers")) {
                logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                        new String[] {from, to, message});
            } else {
                logger.log(Level.INFO, "Usual correspondence: from {0} to {1}",
                        new String[] {from, to});
            }


        }
        return mail;
        }

    }
