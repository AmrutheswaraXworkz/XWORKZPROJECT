package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "bulb")
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findByBrand",query = "select et from BulbEntity et where et.brand=:bn")
@NamedQuery(name ="findBrandByWatt",query = "select et.brand from BulbEntity et where et.wattage=:watt")
@NamedQuery(name = "findWattByBrand",query = "select et.wattage from BulbEntity et where et.brand=:brand")
@NamedQuery(name = "findShapeByBrand",query = "select et.shape from BulbEntity et where et.brand=:brand")
@NamedQuery(name = "findColorByBrand",query = "select et.color from BulbEntity et where et.brand=:brand")
@NamedQuery(name = "findVoltageByBrand",query = "select et.voltage from BulbEntity et where et.brand=:brand")
@NamedQuery(name = "findPriceByBrand",query = "select et.price from BulbEntity et where et.brand=:brand")
@NamedQuery(name="findShapeWattColorPriceByBrand",query = "select et.shape,et.wattage,et.color,et.price from BulbEntity et where et.brand=:brand")
@NamedQuery(name = "findAll",query = "select et from BulbEntity et")
public class BulbEntity {

    @Id
    @Column(name="b_id")
    private Integer id;
    @Column(name = "b_brand")
    private String brand;
    @Column(name = "b_wattage")
    private String wattage;
    @Column(name = "b_shape")
    private String shape;
    @Column(name = "b_color")
    private String color;
    @Column(name = "b_voltage")
    private String voltage;
    @Column(name = "b_price")
    private Integer price;
}
