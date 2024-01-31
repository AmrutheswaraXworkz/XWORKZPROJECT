package com.xworkz.temple.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {

    private static EntityManagerFactory emf;

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    static {
        System.out.println("Initializing EntityManagerFactory");
        emf=Persistence.createEntityManagerFactory("x-workz");
        System.out.println("After creating emf using EMFUtil");

    }
}
