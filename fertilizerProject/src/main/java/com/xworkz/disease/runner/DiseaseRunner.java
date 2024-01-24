package com.xworkz.disease.runner;

import com.xworkz.disease.entity.DiseaseEntity;
import com.xworkz.disease.repository.DiseaseRepo;
import com.xworkz.disease.repository.DiseaseRepoImpl;

public class DiseaseRunner {

    public static void main(String[] args) {
        DiseaseEntity entity=new DiseaseEntity(1,"Tuber Colosis","India","Virus","Dolo");
        DiseaseRepo dr= new DiseaseRepoImpl();
        dr.save(entity);
    }
}
