package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "film")
@AllArgsConstructor
public class FilmEntity {

    @Id
    @Column(name = "f_id")
    private int id;
    @Column(name = "f_name")
    private String name;
    @Column(name = "f_language")
    private String language;
    @Column(name = "f_certificate")
    private String certificate;
    @Column(name = "f_director")
    private String director;
}
