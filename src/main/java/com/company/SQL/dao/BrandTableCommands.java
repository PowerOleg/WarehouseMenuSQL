package com.company.SQL.dao;

import com.company.SQL.pojo.Brand;
import com.company.SQL.pojo.Product;

import java.util.List;

public interface BrandTableCommands {
    List<Brand> selectAllBrands();
    void insertType(Brand brand);
    void remove(Brand brand);
}
