package com.xworkz.conditioner.repository;

import com.xworkz.conditioner.entity.ConditionerEntity;
import com.xworkz.conditioner.util.EMFUtil;

import javax.persistence.*;
import java.util.List;

public class ConditionerRepoImpl implements ConditionerRepo{

    private EntityManagerFactory emf=EMFUtil.getEMF();
    @Override
    public void save(ConditionerEntity entity) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            System.out.println("ET begin");
            em.persist(entity);
            System.out.println("Persistence successful:"+entity);
            et.commit();
            System.out.println("Commit is done");


        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();
        }finally {
            System.out.println("resources are closed");
            em.close();

        }

    }

    @Override
    public void saveAll(List<ConditionerEntity> entities) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            System.out.println("ET begin");
            for (ConditionerEntity entity:entities
                 ) {
                em.persist(entity);
                
            }

            System.out.println("Persistence saved successfully");
            entities.forEach(c-> System.out.println(c));
            et.commit();
            System.out.println("Commit is done");


        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();
        }finally {
            System.out.println("resources are closed");
            em.close();

        }

    }

    @Override
    public void updateNetQuantityByBrand(Integer quantity, String brand) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            System.out.println("ET begin");
            Query query=em.createNamedQuery("updateNetQuantityByBrand");
            query.setParameter("cQuantity",quantity);
            query.setParameter("cBrand",brand);
            query.executeUpdate();
            System.out.println("Updated successfully");
            et.commit();
            System.out.println("Commit is done");


        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();
        }finally {
            System.out.println("resources are closed");
            em.close();

        }

    }

    @Override
    public void updateBenefitsByBrand(String benefits, String brand) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            System.out.println("ET begin");
            Query query=em.createNamedQuery("updateBenefitsByBrand");
            query.setParameter("cBenefits",benefits);
            query.setParameter("cBrand",brand);
            query.executeUpdate();
            System.out.println("Updated successfully");
            et.commit();
            System.out.println("Commit is done");


        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();
        }finally {
            System.out.println("resources are closed");
            em.close();

        }

    }

    @Override
    public List<ConditionerEntity> findAllByBrand(String brand) {

        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            System.out.println("ET begin");
            Query query=em.createNamedQuery("findAllByBrand");
            query.setParameter("cBrand",brand);
            List<ConditionerEntity> obj=query.getResultList();

            System.out.println("Details are:");
            obj.forEach(c-> System.out.println(c));
            et.commit();
            System.out.println("Commit is done");
            return obj;


        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();
        }finally {
            System.out.println("resources are closed");
            em.close();

        }
        return null;
    }

    @Override
    public List<ConditionerEntity> findAllByHairType(String type) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            System.out.println("ET begin");
            Query query=em.createNamedQuery("findAllByHairType");
            query.setParameter("cHairType",type);
            List<ConditionerEntity> obj=query.getResultList();

            System.out.println("Details are:");
            obj.forEach(c-> System.out.println(c));
            et.commit();
            System.out.println("Commit is done");
            return obj;


        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();
        }finally {
            System.out.println("resources are closed");
            em.close();

        }
        return null;
    }

    @Override
    public String findScentById(Integer id) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            System.out.println("ET begin");
            Query query=em.createNamedQuery("findScentById");
            query.setParameter("cId",id);
            Object obj=query.getSingleResult();
            String scent=(String)obj;
            System.out.println("Details of Scent is:"+scent);

            et.commit();
            System.out.println("Commit is done");
            return null;


        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();
        }finally {
            System.out.println("resources are closed");
            em.close();

        }
        return null;
    }

    @Override
    public void getAllSize() {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            System.out.println("ET begin");
            Query query=em.createNamedQuery("getAllSize");
            Object obj=query.getSingleResult();
            System.out.println("Size of the table is:"+obj);
            et.commit();
            System.out.println("Commit is done");



        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();
        }finally {
            System.out.println("resources are closed");
            em.close();

        }

    }

    @Override
    public void getAllBrand() {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            System.out.println("ET begin");
            Query query=em.createNamedQuery("getAllBrand");
            List<String> obj=query.getResultList();
            System.out.println("All the brands are:");
            obj.forEach(c-> System.out.println(c));
            et.commit();
            System.out.println("Commit is done");



        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();
        }finally {
            System.out.println("resources are closed");
            em.close();

        }

    }
}
