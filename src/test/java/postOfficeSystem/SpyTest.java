package postOfficeSystem;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;
import java.util.Arrays;
import java.util.logging.*;
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;

class SpyTest {

    public static final String AUSTIN_POWERS = "Austin Powers";
    public Logger logger = Logger.getLogger(getClass().getName());



    @Test
    void testSpy_SpyCorrectResultReturn() {
        logger.setLevel(Level.OFF);
        MailPackage test = new MailPackage(AUSTIN_POWERS, "NASA", new Package(" asdda", 1000));
        MailPackage result = (MailPackage) new Spy(logger).processMail(test);
        assert (test.equals(result));
    }


    static class myFilter implements Filter {
        public boolean compare = false;
        private String findStr;
        private Object[] arrStr;

        public myFilter(String findStr, Object[] arrStr) {
            this.findStr = findStr;
            this.arrStr = arrStr;
        }

        @Override
        public boolean isLoggable(LogRecord record) {

            if (record.getMessage().equals(findStr)) {
                compare = Arrays.equals(record.getParameters(), arrStr);
            }
            return false;
        }
    }

    @Test
    void testSpy_SpyCorrectLogRec1() {
        MailMessage test = new MailMessage(AUSTIN_POWERS, "NASA", "SOS");
        logger.setLevel(Level.WARNING);
        logger.setFilter(new myFilter("Detected target mail correspondence: from {0} to {1} \"{2}\"",
                new Object[]{"Austin Powers", "NASA", "SOS"}));
        new Spy(logger).processMail(test);
        if (!((myFilter) logger.getFilter()).compare) {
            fail();
        }
    }

    @Test
    void testSpy_SpyCorrectLogRec2() {
        MailMessage test = new MailMessage("CCCP", "NASA", "SOS");
        logger.setLevel(Level.INFO);
        logger.setFilter(new myFilter("Usual correspondence: from {0} to {1}",
                new Object[]{"CCCP", "NASA"}));
        new Spy(logger).processMail(test);
        if (!((myFilter) logger.getFilter()).compare) {
            fail();
        }
    }






}