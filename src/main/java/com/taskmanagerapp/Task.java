package com.taskmanagerapp;

import java.util.Scanner;

public class Task {
    private int id;
    private String title;
    private String description;
    private int dueDate;
    private int priority;
    private int status;

    public Task() {
        taskCreation();
    }
    public void taskCreation(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the title of your task \n ");
        this.title = in.nextLine();

        System.out.println("Please enter the description of your task \n ");
         this.description = in.nextLine();

         System.out.println("Please enter due date of your task \n ");
          this.dueDate = in.nextInt();

          System.out.println("Please enter the priority level of your task (1 being ver low and 5 being very high) \n ");
         this.priority = in.nextInt();
         if(priority < 1 || priority > 5){
             System.out.println("Invalid priority level entered");
         }
        //  this.status = in.nextInt();

    }

}
