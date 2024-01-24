package com.xworkz.january.boot.bulb;

import com.xworkz.january.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BulbDeleteRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        System.out.println("created EMF,EM AND ET");
        et.begin();
        System.out.println("ET begin");
        System.out.println("Operation");

        BulbEntity delete=em.find(BulbEntity.class,2);
        if(delete!=null){
            em.remove(delete);
            System.out.println("deleted");
            System.out.println(delete);
        }
        et.commit();
        System.out.println("ET commit");
        em.close();
        emf.close();
        System.out.println("Closed EM and EMF");
    }
}
