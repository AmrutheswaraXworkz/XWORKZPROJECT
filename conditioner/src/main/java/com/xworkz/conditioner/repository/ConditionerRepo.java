package com.xworkz.conditioner.repository;

import com.xworkz.conditioner.entity.ConditionerEntity;

import java.util.List;

public interface ConditionerRepo {

    void save(ConditionerEntity entity);

    void saveAll(List<ConditionerEntity> entities);

    void updateNetQuantityByBrand(Integer quantity,String brand);

    void updateBenefitsByBrand(String benefits,String brand);

    List<ConditionerEntity> findAllByBrand(String brand);

    List<ConditionerEntity> findAllByHairType(String type);

    String findScentById(Integer id);

    void getAllSize();

    void getAllBrand();
}
