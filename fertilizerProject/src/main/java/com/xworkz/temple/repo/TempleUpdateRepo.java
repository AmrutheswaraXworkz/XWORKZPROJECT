package com.xworkz.temple.repo;

import java.util.List;

public interface TempleUpdateRepo {

    void updateLocationByName(String location,String name);

    void updateEntryFeeByName(int fee,String name);

    void updateLocationAndDimensionById(String location,double dimension,int id );

    void updateAllVipEntry(double vipEntry, List<Integer> ids);

    void deleteByName(String name);
}
