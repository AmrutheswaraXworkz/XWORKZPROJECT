package com.xworkz.january.boot.bulb;

import com.xworkz.january.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BulbUpdateRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        System.out.println("created EMF,EM AND ET");
        et.begin();
        System.out.println("ET begin");
        System.out.println("Operation");

        BulbEntity update=em.find(BulbEntity.class,2);
        if(update!=null){
            update.setPrice(300);
            em.merge(update);
            System.out.println("updated successfully");
            System.out.println(update);
        }

        et.commit();
        System.out.println("ET commit");
        em.close();
        emf.close();
        System.out.println("Closed EM and EMF");
    }
}
