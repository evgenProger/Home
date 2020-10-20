package postOfficeSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.logging.*;
import static org.junit.jupiter.api.Assertions.*;


class InspectorTest {

    public static final String AUSTIN_POWERS = "Austin Powers";
    public Logger logger = Logger.getLogger(getClass().getName());

    @Test
    void testInspector_StoneTrue() {
        MailPackage mailPackage = new MailPackage("FBR", "NASA", new Package("stones ", 1000));
        try {
            new Inspector().processMail(mailPackage);
            fail("Не выбросило исключение StolenPackageException");
        } catch (Exception e) {
            assert (StolenPackageException.class == e.getClass());
        }
    }

    @Test
    void testInspector_IllegalTrue1() {
         MailPackage mailPackage = new MailPackage("FBR", "NASA", new Package("banned substance ", 1000));
        try {
            new Inspector().processMail(mailPackage);
            fail("Не выбросило исключение IllegalPackageException");
        } catch (Exception e) {
            assert (IllegalPackageException.class == e.getClass());
        }
    }

    @Test
    void testInspector_IllegalTrue2() {
        MailPackage mailPackage = new MailPackage("FBR", "NASA", new Package("weapons substance ", 1000));
        try {
            new Inspector().processMail(mailPackage);
            fail("Не выбросило исключение IllegalPackageException");
        } catch (Exception e) {
            assert (IllegalPackageException.class == e.getClass());
        }
    }

    @Test
    void testInspector_TrueMailPackage() {
        MailPackage test = new MailPackage(AUSTIN_POWERS, "NASA", new Package(" asdda", 1000));
        try {
            MailPackage result = (MailPackage) new Inspector().processMail(test);
            assert (test.equals(result));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    @Test
    void testInspector_TrueMailMessage() {
        MailMessage test = new MailMessage(AUSTIN_POWERS, "NASA", "AAAAA");
        try {
            MailMessage result = (MailMessage) new Inspector().processMail(test);
            assert (test.equals(result));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}