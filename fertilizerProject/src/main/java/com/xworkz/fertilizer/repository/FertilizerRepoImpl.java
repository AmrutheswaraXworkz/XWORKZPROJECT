package com.xworkz.fertilizer.repository;

import com.xworkz.fertilizer.entity.FertilizerEntity;

import javax.persistence.*;

public class FertilizerRepoImpl implements FertilizerRepository {

    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(FertilizerEntity fertilizer) {
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        try {
            System.out.println("Starting ET");
            et.begin();
            System.out.println("starting persist");
            em.persist(fertilizer);
            System.out.println("persist success:"+fertilizer);
            et.commit();
            return fertilizer.getId();

        }
        catch (PersistenceException pe){

            System.out.println("Persistence exception in save method:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            em.close();
            emf.close();
        }
        return fertilizer.getId();
    }
}
