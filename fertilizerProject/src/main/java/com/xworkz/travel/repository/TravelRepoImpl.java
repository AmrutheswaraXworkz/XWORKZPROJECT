package com.xworkz.travel.repository;

import com.xworkz.travel.entity.TravelEntity;

import javax.persistence.*;

public class TravelRepoImpl implements TravelRepo{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(TravelEntity travel) {
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            System.out.println("ET Begin");
            em.persist(travel);
            et.commit();
            System.out.println("Persist successful:"+travel);
            System.out.println("ET commit");
            return travel.getId();

        }
        catch (PersistenceException pe){
            et.rollback();
            System.out.println("Persistence exception:"+pe.getMessage());

        }finally {
            System.out.println("Closing resources");
            em.close();
            emf.close();
        }
        return null;
    }
}
