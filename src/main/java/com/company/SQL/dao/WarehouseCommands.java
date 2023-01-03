package com.company.SQL.dao;

import com.company.SQL.pojo.Warehouse;

public interface WarehouseCommands {
    void insert(Warehouse warehouse);
    /*List<Employee>*/Warehouse select (Warehouse warehouse);
    void remove(Warehouse warehouse);
}
