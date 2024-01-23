package com.taskmanagerapp;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TaskMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Task-Manager-App");
        EntityManager em = emf.createEntityManager();

        TaskManager taskManager = new TaskManager(em);

        em.getTransaction().begin();
        Task task = taskManager.createTask(); // Assuming you add a method to TaskManager for task creation
        em.persist(task);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}