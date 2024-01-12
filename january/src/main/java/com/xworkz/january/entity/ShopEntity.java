package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "shop")
@AllArgsConstructor
public class ShopEntity {
    @Id
    @Column(name="s_id")
    private int id;
    @Column(name = "s_name")
    private String name;
    @Column(name = "s_area")
    private String area;
    @Column(name = "s_owner")
    private String owner;
    @Column(name = "s_type")
    private String type;
}
