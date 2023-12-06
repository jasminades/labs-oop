package org.example.week8.task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Events {

    private static final String[] EVENT_TYPES = {"Login", "Logout", "Purchase", "ViewPage", "Error"};

    public static void generateEventsFile(String filename, int numberOfRecords) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)))) {
            Random random = new Random();

            for (int i = 0; i < numberOfRecords; i++) {
                String timestamp = String.valueOf(System.currentTimeMillis());
                String eventType = EVENT_TYPES[random.nextInt(EVENT_TYPES.length)];
                int userId = random.nextInt(1000);

                writer.println(timestamp + "," + eventType + "," + userId);
            }

            System.out.println("Events file generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readEventsFile(String filename, int iterations) {
        try {
            for (int i = 0; i < iterations; i++) {
                System.out.println("Iteration " + (i + 1) + ":");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filename = "events.txt";
        int numberOfRecords = 1000000;
        int iterations = 5;

        generateEventsFile(filename, numberOfRecords);
        readEventsFile(filename, iterations);
    }
}
