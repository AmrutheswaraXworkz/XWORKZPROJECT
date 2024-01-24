package com.xworkz.disease.repository;

import com.xworkz.disease.entity.DiseaseEntity;

import javax.persistence.*;

public class DiseaseRepoImpl implements DiseaseRepo{

    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(DiseaseEntity disease) {
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            System.out.println("ET begin");
            et.begin();
            System.out.println("starting persist");
            em.persist(disease);
            System.out.println("persist successful:"+disease);
            et.commit();
            return disease.getId();

        }
        catch (PersistenceException e){
            System.out.println("persist exception,error occur:"+e.getMessage());
            et.rollback();

        }
        finally {
            System.out.println("closing resources");
            em.close();
            emf.close();

        }
        return disease.getId();
    }
}
