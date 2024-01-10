package com.taskmanagerapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskManager extends Task {

    public TaskManager() {
        taskCreation();
    }

    public void taskCreation() {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the title of your task \n ");
        this.setTitle(in.nextLine());

        System.out.println("Please enter the description of your task \n ");
        this.setDescription(in.nextLine());

        System.out.println("Please enter due date of your task in the format (dd-MM-yyyy): \n ");
        Scanner scanner = new Scanner(in.nextLine());
        String dateString = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(LocalDate.parse(dateString, formatter));

        System.out.println("Please enter the priority level of your task (1 being ver low and 5 being very high) \n ");
        this.setPriority(in.nextInt());
        if (getPriority() < 1 || getPriority() > 5) {
            System.out.println("Invalid priority level entered");
        }

        System.out.println("Please choose one of the following: \n 1. TO DO \n 2. IN PROGRESS \n 3. COMPLETED");
        this.setStatus(in.nextInt());
        switch (getStatus()){
            case 1:
                System.out.println("TO DO");
                break;
            case 2:
                System.out.println("IN PROGRESS");
                break;
            case 3:
                System.out.println("COMPLETED");
                break;
            default:
                System.out.println("Invalid Input");

        }

    }

}
