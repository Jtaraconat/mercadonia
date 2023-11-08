package com.johantaraconat.mercadoniabackend.model;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    private long price;
    private String image;
    private long promoPrice;
    private long promoStart;
    private long promoEnd;
    private String category;



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
    public long getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(long promoPrice) {
        this.promoPrice = promoPrice;
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

    public long getPromoStart() {
        return promoStart;
    }

    public void setPromoStart(long promoStart) {
        this.promoStart = promoStart;
    }

    public long getPromoEnd() {
        return promoEnd;
    }

    public void setPromoEnd(long promoEnd) {
        this.promoEnd = promoEnd;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}