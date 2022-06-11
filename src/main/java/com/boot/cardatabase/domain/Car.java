package com.boot.cardatabase.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long carId;
    @Column(name="marka")
    private String brand;
    @Column(name="model")
    private String model;
    @Column(name="renk")
    private String color;
    @Column(name="kayitNumarasi")
    private String registerNumber;
    @Column(name="yil")
    private int year;
    @Column(name="fiyat")
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner")
    private Owner owner;

    public Car() {
    }

    public Car(String brand, String model, String color, String registerNumber, int year, int price, Owner owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.year = year;
        this.price = price;
        this.owner = owner;
    }
}
