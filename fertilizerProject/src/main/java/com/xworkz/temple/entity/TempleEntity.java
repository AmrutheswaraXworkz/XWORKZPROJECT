package com.xworkz.temple.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "temple")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findAllByLocation",query ="select te from TempleEntity te where te.location=:tLocation" )
@NamedQuery(name = "findAllByEntryFeeGreaterThan",query = "select t from TempleEntity t where t.entryFee >:tFee")
@NamedQuery(name = "findAllByEntryFeeBetween",query ="select t from TempleEntity t where t.entryFee>:sFee and t.entryFee<:eFee" )
@NamedQuery(name = "findAllByInaugaratedDateGreaterThan",query = "select t from TempleEntity t where t.inaugrationDate>:date")
@NamedQuery(name = "findAllByMainGodAndLocation",query = "select t from TempleEntity t where t.mainGod=:tGod and t.location=:tLocation")
@NamedQuery(name = "findByIdAndMainGod",query = "select t from TempleEntity t where t.id=: id and t.mainGod=:god")
@NamedQuery(name = "findTotal",query = "select count(t) from TempleEntity t")
@NamedQuery(name = "findMaxFee",query = "select max(t.entryFee) from TempleEntity t")
@NamedQuery(name = "updateLocationByName",query = "update TempleEntity t set t.location=:tLoc where t.name=:tName")
@NamedQuery(name = "updateEntryFeeByName",query = "update TempleEntity t set t.entryFee=:tFee where t.name=:tName")
@NamedQuery(name = "updateLocationAndDimensionById",query = "update TempleEntity t set t.location=:tLoc,t.dimension=:tDim where t.id=:tId")
@NamedQuery(name = "updateAllVipEntry",query = "update TempleEntity t set t.vipEntry=:tVip where t.id=:tId")
@NamedQuery(name = "deleteByName",query = "delete from TempleEntity t where t.name=:tName")

public class TempleEntity {

    @Id
    @Column(name = "t_id")
    private int id;
    @Column(name = "t_name")
    private String name;
    @Column(name = "t_location")
    private String location;
    @Column(name = "t_entryFee")
    private int entryFee;
    @Column(name = "t_vipEntry")
    private double vipEntry;
    @Column(name = "t_inaugrationDate")
    private LocalDate inaugrationDate;
    @Column(name = "t_mainGod")
    private String mainGod;
    @Column(name = "t_dimension")
    private double dimension;
}
