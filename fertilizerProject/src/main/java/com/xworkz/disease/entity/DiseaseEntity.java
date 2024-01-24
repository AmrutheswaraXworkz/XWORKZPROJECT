package com.xworkz.disease.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "disease")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class DiseaseEntity {

    @Id
    @Column(name = "d_id")
    private Integer id;
    @Column(name = "d_name")
    private String name;
    @Column(name ="d_originCountry")
    private String originCountry;
    @Column(name = "d_caused")
    private String caused;
    @Column(name = "d_medicine")
    private String medicine;
}
