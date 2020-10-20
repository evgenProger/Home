package com.javamentor.logging.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {
    public static void logging() {
        Logger.getLogger("com.javamentor.logging.Test").log(Level.INFO, "Все хорошо");
        Logger.getLogger("com.javamentor.logging.Test").log(Level.WARNING, "Произошла ошибка");



    }

}
