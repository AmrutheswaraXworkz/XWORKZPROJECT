package com.xworkz.temple.repo;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.util.EMFUtil;

import javax.persistence.*;
import java.util.List;

public class TempleUpdateRepoImpl implements TempleUpdateRepo{
    private EntityManagerFactory emf= EMFUtil.getEmf();
    @Override
    public void updateLocationByName(String location, String name) {
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        System.out.println("updated fee using name");
        try {
            et.begin();
            System.out.println("ET begin");
            Query query=em.createNamedQuery("updateLocationByName");
            query.setParameter("tLoc",location);
            query.setParameter("tName",name);

            int v=query.executeUpdate();
            System.out.println(v);
            et.commit();
            System.out.println("ET commit");

        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();


        }finally {
            em.close();

            System.out.println("resources are closed");
        }


    }

    @Override
    public void updateEntryFeeByName(int fee, String name) {
        EntityManager em1=this.emf.createEntityManager();
        EntityTransaction et=em1.getTransaction();
        try {
            et.begin();
            System.out.println("ET begin");
            Query query=em1.createNamedQuery("updateEntryFeeByName");
            query.setParameter("tFee",fee);
            query.setParameter("tName",name);

            int v=query.executeUpdate();
            System.out.println(v);
            et.commit();
            System.out.println("ET commit");

        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();


        }finally {
            em1.close();


            System.out.println("resources are closed");
        }


    }

    @Override
    public void updateLocationAndDimensionById(String location, double dimension, int id) {
        EntityManager em2=this.emf.createEntityManager();
        EntityTransaction et=em2.getTransaction();
        System.out.println("updating loacation and dimension by ID");
        try {
            et.begin();
            System.out.println("ET begin");
            Query query=em2.createNamedQuery("updateLocationAndDimensionById");
            query.setParameter("tLoc",location);
            query.setParameter("tDim",dimension);
            query.setParameter("tId",id);

            int v=query.executeUpdate();
            System.out.println(v);
            et.commit();
            System.out.println("ET commit");

        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();


        }finally {
            em2.close();


            System.out.println("resources are closed");
        }


    }

    @Override
    public void updateAllVipEntry(double vipEntry, List<Integer> ids) {
        EntityManager em3=this.emf.createEntityManager();
        EntityTransaction et=em3.getTransaction();
        System.out.println("updating vipEntry ID");
        try {
            et.begin();
            System.out.println("ET begin");
            Query query=em3.createNamedQuery("updateAllVipEntry");
            query.setParameter("tVip",vipEntry);
            for (Integer id:ids
                 ) {
                query.setParameter("tId",id);
                int v=query.executeUpdate();

            }
            System.out.println("updating all vipEntry using list of Ids");


            et.commit();
            System.out.println("ET commit");

        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();


        }finally {
            em3.close();


            System.out.println("resources are closed");
        }

    }

    @Override
    public void deleteByName(String name) {
        EntityManager em4=this.emf.createEntityManager();
        EntityTransaction et=em4.getTransaction();
        System.out.println("deleting table by name");
        try {
            et.begin();
            System.out.println("ET begin");
            Query query=em4.createNamedQuery("deleteByName");
            query.setParameter("tName",name);


            query.executeUpdate();
            et.commit();
            System.out.println("ET commit");

        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et.rollback();


        }finally {
            em4.close();



            System.out.println("resources are closed");
        }


    }
}
