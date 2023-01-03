package com.company.SQL.pojo;

public class Brand {
    private String id;
    private String brand;

    public Brand() {
    }

    public Brand(String brand) {
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
