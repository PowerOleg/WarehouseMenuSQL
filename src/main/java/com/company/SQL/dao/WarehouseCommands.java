package com.company.SQL.dao;

import com.company.SQL.pojo.Product;

import java.util.List;

public interface WarehouseCommands {
    void insert(Product product);
    List<Product> selectAll();    //убрал все аргументы потому что хочу вывести все, без условий
    Product select(int id);
    void remove(Product product);
}
