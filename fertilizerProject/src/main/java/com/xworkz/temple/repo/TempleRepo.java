package com.xworkz.temple.repo;

import com.xworkz.temple.entity.TempleEntity;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.util.List;

public interface TempleRepo {

    Integer save(TempleEntity entity);

    Integer saveAll(List<TempleEntity> templeEntityList);

    List<TempleEntity> findAllByLocation(String location);

    List<TempleEntity> findAllByEntryFeeGreaterThan(int fee);

    List<TempleEntity> findAllByEntryFeeBetween(int startFee,int endFee);

    List<TempleEntity> findAllByInaugaratedDateGreaterThan(LocalDate date);

    List<TempleEntity> findAllByMainGodAndLocation(String god,String location);

    TempleEntity findById(int id);

    TempleEntity findByIdAndMainGod(int id,String god);

    void findTotal();

    void findMaxFee();

}
