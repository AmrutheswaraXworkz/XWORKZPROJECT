package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "festival")
@AllArgsConstructor
public class FestivalEntity {

    @Id
    @Column(name = "f_id")
    private int id;
    @Column(name ="f_name")
    private String name;
    @Column(name = "f_state")
    private String state;
    @Column(name = "f_god")
    private String god;
    @Column(name = "f_religion")
    private String religion;
}
