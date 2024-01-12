package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "actor")
@AllArgsConstructor
public class ActorEntity {
    @Id
    @Column(name = "a_id")
    private int id;
    @Column(name = "a_name")
    private String name;
    @Column(name = "a_gender")
    private String gender;
    @Column(name = "a_city")
    private String city;
    @Column(name = "a_title")
    private String title;
}
