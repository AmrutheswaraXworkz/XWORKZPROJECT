package com.xworkz.conditioner.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {

    private static EntityManagerFactory emf;

    public static EntityManagerFactory getEMF() {
        return emf;
    }
    static {
        System.out.println("EMF is created using EMFUtil");
        emf=Persistence.createEntityManagerFactory("x-workz");
        System.out.println("After invoking EMF using EMFUtil");

    }
}
