package com.xworkz.fertilizer.runner;

import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.repository.FertilizerRepoImpl;
import com.xworkz.fertilizer.repository.FertilizerRepository;

public class FertilizerRunner {

    public static void main(String[] args) {
        FertilizerEntity fertilizer=new FertilizerEntity(2,"Urea","Earth",15,150,"2024-02-12");
        FertilizerRepository fr=new FertilizerRepoImpl();
        fr.save(fertilizer);

    }
}
