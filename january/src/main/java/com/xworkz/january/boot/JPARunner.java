package com.xworkz.january.boot;

import com.xworkz.january.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);

        EntityManager em= emf.createEntityManager();
        System.out.println("EM:"+em);
        EntityTransaction et=em.getTransaction();
        System.out.println("ET:"+et);
        et.begin();
        System.out.println("ET begin");
        System.out.println("operations begin");
//        SuperHeroEntity superHero=new SuperHeroEntity(2,"Bruce Banner","Hulk","Smash","USA","Angry");
//        em.persist(superHero);
//        FilmEntity filmEntity=new FilmEntity(2,"KGF2","Kannada","U/A","Prashanth Neel");
//        em.persist(filmEntity);
//        TrafficEntity trafficEntity=new TrafficEntity(3,"Manjunath Circle","Jayanagara","Banglore");
//        em.persist(trafficEntity);
//        ResumeEntity resumeEntity=new ResumeEntity(2,"Gagan","UBDT","Resume","Siddganaga");
//        em.persist(resumeEntity);
//        ShopEntity shopEntity=new ShopEntity(2,"Dmart","Jayanagar","Ashok","Groceries");
//        em.persist(shopEntity);
//        SportEntity sportEntity=new SportEntity(2,"Football","Brazil",11,"Ronaldo");
//        em.persist(sportEntity);
//        TransportEntity transportEntity=new TransportEntity(2,"bike","2","Pulsar ns 200",80000);
//        em.persist(transportEntity);

        System.out.println("operation completed");
        et.commit();
        System.out.println("ET commit");
        em.close();
        emf.close();
        System.out.println("EM,EMF are closed");

//emf,em,et,et.begin,object creation for entity(data),em.persist(object),et.commit,em.close,emf.close
    }
}
