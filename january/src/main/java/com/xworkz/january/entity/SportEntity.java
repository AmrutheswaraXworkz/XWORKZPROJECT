package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "sports")
@AllArgsConstructor
public class SportEntity {

    @Id
    @Column(name = "s_id")
    private int id;
    @Column(name = "s_name")
    private String name;
    @Column(name = "s_originCountry")
    private String originCountry;
    @Column(name = "s_members")
    private int members;
    @Column(name = "s_favPlayer")
    private String favPlayer;
}
