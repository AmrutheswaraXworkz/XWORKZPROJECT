package com.xworkz.temple.runner;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.repo.TempleRepo;
import com.xworkz.temple.repo.TempleRepoImpl;
import com.xworkz.temple.repo.TempleUpdateRepo;
import com.xworkz.temple.repo.TempleUpdateRepoImpl;
import javafx.fxml.LoadException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TempleMain {
    public static void main(String[] args) {
//        TempleEntity temple=new TempleEntity(1,"Ram Mandir","Ayodha",100,1000, LocalDate.of(2024,01,22),"Ram",2.47);
        TempleRepo tr=new TempleRepoImpl();
//        tr.save(temple);

//        TempleEntity temple1=new TempleEntity(2,"Darmasthala","Dharmasthala",50,100,LocalDate.of(1970,10,22),"Manjunatha",4.5);
//        TempleEntity temple2=new TempleEntity(3,"Anjanadri","Anjanadri",30,300, LocalDate.of(1960,10,22),"Hanuman",3.8);
//        List<TempleEntity> templeEntityList=new ArrayList<TempleEntity>();
//        templeEntityList.add(temple1);
//        templeEntityList.add(temple2);
//        tr.saveAll(templeEntityList);
        tr.findAllByLocation("Ayodha");
        tr.findAllByEntryFeeGreaterThan(10);
        tr.findAllByEntryFeeBetween(10,60);
        tr.findAllByInaugaratedDateGreaterThan(LocalDate.of(1950,10,10));
        tr.findAllByMainGodAndLocation("Ram","Ayodha");
        tr.findById(1);
        tr.findByIdAndMainGod(1,"Rama");
        tr.findTotal();
        tr.findMaxFee();

        TempleUpdateRepo tur=new TempleUpdateRepoImpl();
        tur.updateLocationByName("Davangere","Darmasthala");
        tur.updateEntryFeeByName(123,"Ram Mandir");
        tur.updateLocationAndDimensionById("Masur",6,1);
        List<Integer> ids=new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);

        tur.updateAllVipEntry(10000,ids);
        tur.deleteByName("Subramanya");

    }
}
