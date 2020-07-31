package com.example.VoedselVeiling.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    public Product(String naam, double kosten) {
        this.naam = naam;
        this.kosten = kosten;
    }
    public Product() {
        System.out.println("Empty Product created");
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String naam;
    double kosten;

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getKosten() {
        return kosten;
    }

    public void setKosten(double kosten) {
        this.kosten = kosten;
    }
}