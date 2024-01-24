package com.xworkz.travel.runner;

import com.xworkz.travel.entity.TravelEntity;
import com.xworkz.travel.repository.TravelRepo;
import com.xworkz.travel.repository.TravelRepoImpl;

public class TravelRunner {
    public static void main(String[] args) {
        TravelEntity entity=new TravelEntity(1,"Davangere","Goa",10000,400,"2 days","Car","2024-01-24","2024-01-30");
        TravelRepo tr=new TravelRepoImpl();
        tr.save(entity);
    }
}
