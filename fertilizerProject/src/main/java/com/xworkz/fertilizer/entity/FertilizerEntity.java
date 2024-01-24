package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "fertilizer")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FertilizerEntity {

    @Id
    @Column(name = "f_id")
    private int id;
    @Column(name = "f_name")
    private String name;
    @Column(name = "f_brand")
    private String brand;
    @Column(name = "f_quantity")
    private int quantity;
    @Column(name = "f_cost")
    private int cost;
    @Column(name = "f_mfgDate")
    private String mfgDate;
}
