package com.HANDSON.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
    public static EntityManager getEntityManager() {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("test1");
        EntityManager em = emf.createEntityManager();
        return em;
    }
}
