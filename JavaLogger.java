package com.mycompany.coffemachine;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;
import java.util.logging.*;
import javax.swing.JOptionPane;


public class JavaLogger implements CoffeeLogger{
    private static final Logger logger = Logger.getLogger(JavaLogger.class.getName());
        @Override
    public void log(String message) {
logger.log(Level.INFO, message);

LocalDateTime loc = LocalDateTime.now();
DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("d/Mo/Ye se/Min/Hou");
String formattedDateTime = loc.format(timeformat);

File loggers = new File("loggers.txt");
FileWriter filewrite = null;

try {
    filewrite = new FileWriter(loggers, true);
    filewrite.write(formattedDateTime + " | " + message + ".\n");
} catch (FileNotFoundException ex) {
    try {
        File file = new File("log.txt");
        if (file.createNewFile()) {
            JOptionPane.showMessageDialog(null, "No log file .. one will be created ");
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
} catch (IOException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
} finally {
    if (filewrite != null) {
        try {
            filewrite.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Log file can't be closed*");
            System.exit(0);
        }
    }
}

    }
    

}
