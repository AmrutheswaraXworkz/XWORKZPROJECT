package com.xworkz.conditioner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "conditioner")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries(
        {
                @NamedQuery(name = "updateNetQuantityByBrand", query = "update ConditionerEntity ce set ce.netQuantity=:cQuantity where ce.brand=:cBrand"),
                @NamedQuery(name = "updateBenefitsByBrand", query = "update ConditionerEntity ce set ce.benefits=:cBenefits where ce.brand=:cBrand"),
                @NamedQuery(name = "findAllByBrand",query = "select ce from ConditionerEntity ce where ce.brand=:cBrand"),
                @NamedQuery(name = "findAllByHairType",query = "select ce from ConditionerEntity ce where ce.hairType=:cHairType"),
                @NamedQuery(name = "findScentById",query = "select ce.scent from ConditionerEntity ce where ce.id=:cId"),
                @NamedQuery(name = "getAllSize",query = "select count(ce) from ConditionerEntity ce"),
                @NamedQuery(name = "getAllBrand",query = "select ce.brand from ConditionerEntity ce")
        }
)

public class ConditionerEntity {

    @Id
    @Column(name = "c_id")
    private int id;
    @Column(name = "c_brand")
    private String brand;
    @Column(name = "c_itemForm")
    private String itemForm;
    @Column(name = "c_hairType")
    private String hairType;
    @Column(name = "c_benefits")
    private String benefits;
    @Column(name = "c_ageRange")
    private String ageRange;
    @Column(name = "c_netQuantity")
    private Integer netQuantity;
    @Column(name = "c_number")
    private Integer number;
    @Column(name = "c_scent")
    private String scent;
}
