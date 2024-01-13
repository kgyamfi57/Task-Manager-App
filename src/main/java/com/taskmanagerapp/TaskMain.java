package com.taskmanagerapp;

import java.io.FileWriter;
import java.io.IOException;

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

    private static String formatTaskDetails(TaskManager taskManager){
        return "\nTitle: " + taskManager.getTitle() +
                "\nDescription: " + taskManager.getDescription() +
                "\nDue Date: " + taskManager.getDueDate() +
                "\nPriority: " + taskManager.getPriority() +
                "\nStatus: " + getStatusLabel(taskManager.getStatus());
    }

    private static String getStatusLabel(int status) {
        return switch (status) {
            case 1 -> "TO DO";
            case 2 -> "IN PROGRESS";
            case 3 -> "COMPLETED";
            default -> "Invalid Status";
        };
    }
}