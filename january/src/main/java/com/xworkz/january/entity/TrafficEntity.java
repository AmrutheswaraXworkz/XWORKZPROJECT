package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@Table(name = "traffic")
public class TrafficEntity {

    @Id
    @Column(name = "t_id")
    private int id;
    @Column(name = "t_circle")
    private String circle;
    @Column(name = "t_area")
    private String area;
    @Column(name = "t_city")
    private String city;
}
