package com.xworkz.email.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "email")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class EmailEntity {

    @Id
    @Column(name = "e_id")
    private int id;
    @Column(name = "e_address")
    private String address;
    @Column(name = "e_from")
    private String from;
    @Column(name = "e_to")
    private String to;
    @Column(name = "e_subject")
    private String subject;
    @Column(name = "e_sentDate")
    private String sentDate;
    @Column(name = "e_success")
    private boolean success;
}
