package com.nathquintero.tiendavirtual;

public class Product {
    private String name;
    private String description;
    private Double price;
    private String img_url;

    public Product() {

    }

    public Product(String name, String description, Double price, String img_url) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.img_url = img_url;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
