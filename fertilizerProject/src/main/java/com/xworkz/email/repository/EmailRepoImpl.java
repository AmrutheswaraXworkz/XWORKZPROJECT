package com.xworkz.email.repository;

import com.xworkz.email.entity.EmailEntity;

import javax.persistence.*;

public class EmailRepoImpl implements EmailRepo{
    private EntityManagerFactory emf=Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer saveDetails(EmailEntity email) {
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
    try {
        et.begin();
        System.out.println("ET Begin");
        em.persist(email);
        System.out.println("Persist successful:"+email);
        et.commit();
        System.out.println("ET commit");
        return email.getId();


    }
    catch (PersistenceException pe){
        et.rollback();
        System.out.println("Persistence exception:"+pe.getMessage());

    }finally {
        System.out.println("closing resources");
        em.close();
        emf.close();

    }
        return email.getId();
    }
}
