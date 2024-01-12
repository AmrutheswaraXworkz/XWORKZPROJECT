package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "transport")
@AllArgsConstructor
public class TransportEntity {
    @Id
    @Column(name = "t_id")
    private int id;
    @Column(name = "t_name")
    private String name;
    @Column(name = "t_wheels")
    private String wheels;
    @Column(name = "t_model")
    private String model;
    @Column(name = "t_price")
    private int price;

}
