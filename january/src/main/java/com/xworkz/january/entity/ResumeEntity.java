package com.xworkz.january.entity;

import com.sun.javafx.binding.StringFormatter;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "resume")
@AllArgsConstructor
public class ResumeEntity {
    @Id
    @Column(name = "r_id")
    private int id;
    @Column(name = "r_name")
    private String name;
    @Column(name = "r_college")
    private String college;
    @Column(name = "r_type")
    private String type;
    @Column(name = "r_school")
    private String school;
}
