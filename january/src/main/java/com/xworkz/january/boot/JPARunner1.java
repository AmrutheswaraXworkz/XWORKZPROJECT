package com.xworkz.january.boot;

import com.xworkz.january.entity.OceanEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner1 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println("created EMF");
       EntityManager em= emf.createEntityManager();
        System.out.println("Created EM");
        EntityTransaction et=em.getTransaction();
        System.out.println("created ET");
        et.begin();
        System.out.println("ET Begin");
//        ActorEntity actorEntity=new ActorEntity(2,"Yash","Male","Mandya","Rocking Star");
//        em.persist(actorEntity);
//        FestivalEntity festivalEntity=new FestivalEntity(2,"Dasara","Karnataka","Chamundeshwari","Hindu");
//        em.persist(festivalEntity);
        OceanEntity oceanEntity=new OceanEntity(2,"Antartic Ocean","120KM","Antartica","2000sq feet");
        em.persist(oceanEntity);
        et.commit();
        System.out.println("ET Commit");
        em.close();
        emf.close();
        System.out.println("EM,EMF are closed");

    }

}
