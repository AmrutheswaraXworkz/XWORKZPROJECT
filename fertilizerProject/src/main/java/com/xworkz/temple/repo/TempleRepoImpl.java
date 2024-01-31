package com.xworkz.temple.repo;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.util.EMFUtil;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class TempleRepoImpl implements TempleRepo {
    private EntityManagerFactory emf= EMFUtil.getEmf();

    @Override
    public Integer save(TempleEntity entity) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("ET begin");
            em.persist(entity);
            System.out.println("persistence successful:" + entity);
            et.commit();
            System.out.println("ET commit");

        } catch (PersistenceException e) {
            System.out.println("persistence error:" + e.getMessage());
            et.rollback();

        } finally {
            System.out.println("closing resources");
            em.close();


        }
        return entity.getId();

    }

    @Override
    public Integer saveAll(List<TempleEntity> templeEntityList) {

        EntityManager em1 = emf.createEntityManager();
        EntityTransaction et1 = em1.getTransaction();
        try {
            et1.begin();
            System.out.println("ET1 begin");
            for (TempleEntity templ : templeEntityList
            )
                em1.persist(templ);
            {

            }

            System.out.println("persistence is successful :");
            templeEntityList.forEach(c -> System.out.println(c));
            et1.commit();
            System.out.println("ET1 commit");

        } catch (PersistenceException pe) {
            System.out.println("persistence error:" + pe.getMessage());
            et1.rollback();
        } finally {
            System.out.println("closing resources");
            em1.close();

        }

        return null;
    }

    @Override
    public List<TempleEntity> findAllByLocation(String location) {
        EntityManager em2 = emf.createEntityManager();
        EntityTransaction et2 = em2.getTransaction();

        try {
            et2.begin();
            System.out.println("ET2 Begin");
            System.out.println("Find all by location");
            Query query = em2.createNamedQuery("findAllByLocation");
            query.setParameter("tLocation", location);
            List<TempleEntity> temple = query.getResultList();
            temple.forEach(c -> System.out.println(c));
            et2.commit();
            return temple;

        } catch (PersistenceException e) {

            System.out.println("persistence error");
            et2.rollback();
        } finally {
            System.out.println("closing EM");
            em2.close();
        }

        return null;
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeGreaterThan(int fee) {
        EntityManager em3 = emf.createEntityManager();
        EntityTransaction et3 = em3.getTransaction();
        try {
            et3.begin();
            System.out.println("ET3 Begin");
            System.out.println("Find all by entry fee greater than");
            Query query = em3.createNamedQuery("findAllByEntryFeeGreaterThan");
            query.setParameter("tFee", fee);

            List<TempleEntity> obj = query.getResultList();
            obj.forEach(c -> System.out.println(c));
            et3.commit();
            return obj;

        } catch (PersistenceException e) {

            System.out.println("persistence error");
            et3.rollback();
        } finally {
            System.out.println("closing EM");
            em3.close();

        }

        return null;
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeBetween(int startFee, int endFee) {
        EntityManager em4 = emf.createEntityManager();
        EntityTransaction et4 = em4.getTransaction();
        try {
            et4.begin();
            System.out.println("ET4 Begin");
            System.out.println("Find all by entry fee between start and end fee");
            Query query = em4.createNamedQuery("findAllByEntryFeeBetween");
            query.setParameter("sFee", startFee);
            query.setParameter("eFee", endFee);

            List<TempleEntity> obj = query.getResultList();
            obj.forEach(c -> System.out.println(c));
            et4.commit();
            return obj;

        } catch (PersistenceException e) {

            System.out.println("persistence error");
            et4.rollback();
        } finally {
            System.out.println("closing EM");
            em4.close();

        }

        return null;
    }

    @Override
    public List<TempleEntity> findAllByInaugaratedDateGreaterThan(LocalDate date) {
        EntityManager em5 = emf.createEntityManager();
        EntityTransaction et5 = em5.getTransaction();
        try {
            et5.begin();
            System.out.println("ET5 Begin");
            System.out.println("Find all by inagruated date greater than");
            Query query = em5.createNamedQuery("findAllByInaugaratedDateGreaterThan");
            query.setParameter("date", date);


            List<TempleEntity> obj = query.getResultList();
            obj.forEach(c -> System.out.println(c));
            et5.commit();
            return obj;

        } catch (PersistenceException e) {

            System.out.println("persistence error");
            et5.rollback();
        } finally {
            System.out.println("closing EM");
            em5.close();
        }
        return null;
    }

    @Override
    public List<TempleEntity> findAllByMainGodAndLocation(String god, String location) {

        EntityManager em6 = emf.createEntityManager();
        EntityTransaction et6 = em6.getTransaction();
        try {
            et6.begin();
            System.out.println("ET6 Begin");
            System.out.println("Find all by Main god and location");
            Query query = em6.createNamedQuery("findAllByMainGodAndLocation");
            query.setParameter("tGod", god);
            query.setParameter("tLocation",location);


            List<TempleEntity> obj = query.getResultList();
            obj.forEach(c -> System.out.println(c));
            et6.commit();
            return obj;

        } catch (PersistenceException e) {

            System.out.println("persistence error");
            et6.rollback();
        } finally {
            System.out.println("closing EM");


        }
        return null;
    }

    @Override
    public TempleEntity findById(int id) {
        EntityManager em7=emf.createEntityManager();
        System.out.println("details of temple of id:"+id);
        TempleEntity te=em7.find(TempleEntity.class,id);
        System.out.println(te);
        em7.close();
        return te;

    }

    @Override
    public TempleEntity findByIdAndMainGod(int id, String god) {
        EntityManager em8 = emf.createEntityManager();
        EntityTransaction et8 = em8.getTransaction();
        try {
            et8.begin();
            System.out.println("ET8 Begin");
            System.out.println("Find all by Id and Main god");
            Query query = em8.createNamedQuery("findByIdAndMainGod");
            query.setParameter("id", id);
            query.setParameter("god",god);


            Object obj = query.getSingleResult();
            TempleEntity t=(TempleEntity)obj;
            System.out.println(t);
            et8.commit();
            return t;

        } catch (PersistenceException e) {

            System.out.println("persistence error");
            et8.rollback();
        } finally {
            System.out.println("closing EM");
            em8.close();


        }
        return null;
    }

    @Override
    public void findTotal() {
        EntityManager em9=emf.createEntityManager();
        EntityTransaction et9=em9.getTransaction();
        try {
            et9.begin();
            System.out.println("total");
            Query query = em9.createNamedQuery("findTotal");
            Object obj = query.getSingleResult();
            System.out.println(obj);
            et9.commit();
        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et9.rollback();
        }

        finally {


            em9.close();

        }


    }

    @Override
    public void findMaxFee() {

        EntityManager em9=emf.createEntityManager();
        EntityTransaction et9=em9.getTransaction();
        try {
            et9.begin();
            System.out.println("max amount");
            Query query = em9.createNamedQuery("findMaxFee");
            Object obj = query.getSingleResult();
            System.out.println(obj);
            et9.commit();
        }catch (PersistenceException e){
            System.out.println("persistence error:"+e.getMessage());
            et9.rollback();
        }

        finally {


            em9.close();


        }


    }

}
