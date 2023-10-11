package com.johantaraconat.mercadoniabackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    private long price;
    private String image;
    private Date promoStart;
    private Date promoEnd;
    //private type catégorie



    public long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getPromoStart() {
        return promoStart;
    }

    public void setPromoStart(Date promoStart) {
        this.promoStart = promoStart;
    }

    public Date getPromoEnd() {
        return promoEnd;
    }

    public void setPromoEnd(Date promoEnd) {
        this.promoEnd = promoEnd;
    }
}