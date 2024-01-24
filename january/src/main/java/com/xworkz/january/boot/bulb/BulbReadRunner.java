package com.xworkz.january.boot.bulb;

import com.xworkz.january.entity.BulbEntity;
import jdk.nashorn.internal.codegen.ObjectCreator;

import javax.persistence.*;
import java.util.List;

public class BulbReadRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        System.out.println("created EMF,EM AND ET");
        et.begin();
        System.out.println("ET begin");
        System.out.println("Operation");


//        Query query=em.createQuery("Select entity from BulbEntity entity where entity.brand='LED'");
//        List results=query.getResultList();
//        results.forEach(c-> System.out.println(c));
        
        Query query=em.createNamedQuery("findByBrand");
        query.setParameter("bn","LED");
        Object object= query.getSingleResult();
        BulbEntity entity=(BulbEntity)object;
        System.out.println("Data are:"+entity);

        Query brandQuery=em.createNamedQuery("findBrandByWatt");
        brandQuery.setParameter("watt","9 watt");
        Object object1=brandQuery.getSingleResult();
        String brand=(String)object1;
        System.out.println("Brand is where watt is 9 watt:"+brand);

        Query wattQuery=em.createNamedQuery("findWattByBrand");
        wattQuery.setParameter("brand","LED");
        Object object2=wattQuery.getSingleResult();
        String watt=(String)object2;
        System.out.println("watt is where brand is LED:"+watt);

        Query shapeQuery=em.createNamedQuery("findShapeByBrand");
        shapeQuery.setParameter("brand","LED");
        Object object3=shapeQuery.getSingleResult();
        String shape=(String)object3;
        System.out.println("shape of brand LED is:"+shape);

        Query colorQuery=em.createNamedQuery("findColorByBrand");
        colorQuery.setParameter("brand","Panasonic");
        Object object4=colorQuery.getSingleResult();
        String color=(String)object4;
        System.out.println("color of the brand panasonic:"+color);

        Query voltageQuery=em.createNamedQuery("findVoltageByBrand");
        voltageQuery.setParameter("brand","LED");
        Object object5=voltageQuery.getSingleResult();
        String voltage=(String)object5;
        System.out.println("voltage of the brand LED:"+voltage);

        Query priceQuery=em.createNamedQuery("findPriceByBrand");
        priceQuery.setParameter("brand","Panasonic");
        Object object6=priceQuery.getSingleResult();
        Integer price=(Integer) object6;
        System.out.println("Price of the brand LED:"+price);



        et.commit();
        System.out.println("ET commit");
        em.close();
        emf.close();
        System.out.println("Closed EM and EMF");
    }
}
