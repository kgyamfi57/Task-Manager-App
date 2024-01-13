package com.taskmanagerapp;

import java.io.FileWriter;
import java.io.IOException;

import static com.taskmanagerapp.TaskManager.formatTaskDetails;

public class TaskMain {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();
        try (FileWriter writer = new FileWriter("output.txt")) {
            String taskDetails = formatTaskDetails(taskManager);
            writer.write(taskDetails);
            System.out.println("Text saved to file successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

    }
}