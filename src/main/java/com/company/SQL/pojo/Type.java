package com.company.SQL.pojo;

public class Type {
    private String id;
    private String type;

    public Type() {
    }

    public Type(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }
}
