package com.company.SQL.pojo;

public class Product {
    private String id;
    private String name;
    private String type;
    private String brand;
    private int quantity;
    private int price_1;
    private int price;

    public Product() {
    }

    public Product(String name, String type, String brand, int quantity, int price_1) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.quantity = quantity;
        this.price_1 = price_1;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice_1() {
        return price_1;
    }

    public int getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice_1(int price_1) {
        this.price_1 = price_1;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
