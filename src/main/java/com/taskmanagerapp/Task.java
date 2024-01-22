package com.taskmanagerapp;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "USER STORY")
public class Task {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   @Column(name = "Task Title")
    private String title;
    @Column(name = "Task Description")
    private String description;
    @Column(name = "Task Date")
    private LocalDate dueDate;
    @Column(name = "Task Priority")
    private int priority;
    @Column(name = "Task Status")
    private int status;

    public Task() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
