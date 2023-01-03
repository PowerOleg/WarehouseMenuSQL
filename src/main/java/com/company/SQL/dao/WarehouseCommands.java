package com.company.SQL.dao;

import com.company.SQL.pojo.Product;

public interface WarehouseCommands {
    void insert(Product product);
    /*List<Employee>*/Product select (Product product);
    void remove(Product product);
}
