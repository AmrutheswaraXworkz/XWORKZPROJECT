package com.xworkz.conditioner.runner;

import com.xworkz.conditioner.entity.ConditionerEntity;
import com.xworkz.conditioner.repository.ConditionerRepo;
import com.xworkz.conditioner.repository.ConditionerRepoImpl;

import java.util.ArrayList;
import java.util.List;

public class ConditionerRunner {

    public static void main(String[] args) {
        ConditionerRepo repo=new ConditionerRepoImpl();
        ConditionerEntity entity=new ConditionerEntity(1,"Biolage","Liquid","All","Smoothening","Adult",196,1,"Camellia");
//        repo.save(entity);
        ConditionerEntity entity1=new ConditionerEntity(2,"Tresme","Liquid","Smooth","Smoothening","All",200,2,"Laviander");
        ConditionerEntity entity2=new ConditionerEntity(3,"Dove","Liquid","Hard","Smooths and HaiCare","Adult",200,1,"Choclate");
        List<ConditionerEntity> list=new ArrayList<ConditionerEntity>();
        list.add(entity1);
        list.add(entity2);
//        repo.saveAll(list);
        repo.updateNetQuantityByBrand(300,"Dove");
        repo.updateBenefitsByBrand("Smooth and Less Hairfall","Tresme");
        repo.findAllByBrand("Biolage");
        repo.findAllByHairType("Hard");
        repo.findScentById(2);
        repo.getAllSize();
        repo.getAllBrand();


    }
}
