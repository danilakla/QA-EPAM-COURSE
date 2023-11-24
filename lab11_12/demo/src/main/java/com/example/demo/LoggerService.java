package com.example.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerService {

    private static final String LOG_FILE_PATH = "application.log";

    public static void log(String message) {
        try (FileWriter fileWriter = new FileWriter(LOG_FILE_PATH, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            String formattedMessage = formatLogMessage(message);
            printWriter.println(formattedMessage);
            System.out.println(formattedMessage); // Optional: Print to console

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String formatLogMessage(String message) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        return "[" + formattedDateTime + "] " + message;
    }
}