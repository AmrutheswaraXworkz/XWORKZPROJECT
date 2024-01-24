package com.xworkz.january.boot.bulb;

import com.sun.corba.se.spi.ior.ObjectKey;
import com.xworkz.january.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BulbRunnerQuery {
    private Bulb bulb;
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();

        Query query=em.createNamedQuery("findShapeWattColorPriceByBrand");
        query.setParameter("brand","LED");
        List<Object[]> obj=query.getResultList();
        System.out.println("Shape,Wattage,Color,Price is:");
        for (Object[] obj1:obj)
        {
            for(int i=0;i<obj1.length;i++) {
                System.out.println(obj1[i]);

            }
        }

        Query findQuery=em.createNamedQuery("findAll");
        List<BulbEntity> all=findQuery.getResultList();
        System.out.println("All details are");
        all.forEach(c-> System.out.println(c));

        em.close();
        emf.close();
//        Object obj1=query.getSingleResult();
//        Object[] obj2=(Object[])obj1;
//        System.out.println("Shape:"+obj2[0]);
//        System.out.println("Watt:"+obj2[1]);
//        System.out.println("Color:"+obj2[2]);
//        System.out.println("Price:"+obj2[3]);

    }
}
