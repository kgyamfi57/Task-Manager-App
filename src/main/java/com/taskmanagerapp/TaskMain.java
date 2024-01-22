package com.taskmanagerapp;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TaskMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("YourPersistenceUnitName");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        TaskManager taskManager = new TaskManager();
        Task task = taskManager; // Assuming you add a method to TaskManager for task creation
        em.persist(task);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}