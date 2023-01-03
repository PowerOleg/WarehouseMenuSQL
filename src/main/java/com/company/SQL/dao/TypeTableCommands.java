package com.company.SQL.dao;

import com.company.SQL.pojo.Product;
import com.company.SQL.pojo.Type;

import java.util.List;

public interface TypeTableCommands {
    List<Type> selectAllTypes();
    void insertType(Type type);
    void remove(Type type);
}
