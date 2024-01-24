package com.xworkz.january.boot.bulb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Bulb {
    private String shape;
    private String wattage;

    @Override
    public String toString() {
        return "Bulb{" +
                "shape='" + shape + '\'' +
                ", wattage='" + wattage + '\'' +
                '}';
    }
}
