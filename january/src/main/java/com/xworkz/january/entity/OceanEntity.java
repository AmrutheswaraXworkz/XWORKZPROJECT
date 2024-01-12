package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "ocean")
@AllArgsConstructor
public class OceanEntity {
    @Id
    @Column(name = "o_id")
    private int id;
    @Column(name = "o_name")
    private String name;
    @Column(name = "o_depth")
    private String depth;
    @Column(name = "o_location")
    private String location;
    @Column(name = "o_area")
    private String area;
}
