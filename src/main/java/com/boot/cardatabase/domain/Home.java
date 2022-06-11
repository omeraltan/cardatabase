package com.boot.cardatabase.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String homeName;
    private String address;
    private int homePrice;
    private int roomNumbers;

    @ManyToMany(mappedBy = "homes")
    private Set<Owner> owners = new HashSet<Owner>();

    public Home() {
    }

    public Home(String homeName, String address, int homePrice, int roomNumbers) {
        this.homeName = homeName;
        this.address = address;
        this.homePrice = homePrice;
        this.roomNumbers = roomNumbers;
    }
}
