package com.company.SQL.dao;

import com.company.SQL.pojo.Brand;
import com.company.SQL.pojo.Product;
import com.company.SQL.pojo.Type;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static com.company.SQL.Config.*;
import static com.company.SQL.Const.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Query implements WarehouseCommands, TypeTableCommands, BrandTableCommands {

    private Connection getConnection() {
        Connection dbConnection = null;
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("No connection");
            e.printStackTrace();
        }
        return dbConnection;
    }

    @Override
    public List<Product> selectAll() {
        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        List<Product> products = new ArrayList<>();

        try {
//не работает          String sqlQuery = "SELECT id, Name, Type, Brand, Quantity, Price(1), Price FROM warehouse1";
            String sqlQuery = "SELECT * FROM warehouse1";
            dbConnection = getConnection();
            preparedStatement = dbConnection.prepareStatement(sqlQuery);
//            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getString("id"));
                product.setName(resultSet.getString("Name"));
                product.setType(resultSet.getString("Type"));
                product.setBrand(resultSet.getString("Brand"));
                product.setQuantity(resultSet.getInt("Quantity"));
                product.setPrice_1(resultSet.getInt("Price(1)"));
                product.setPrice(resultSet.getInt("Price"));
                products.add(product);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return products;
    }

    @Override
    public Product select(int id) {
        return null;
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public void remove(Product product) {

    }






    @Override
    public void insertType(Type type) {

    }

    @Override
    public void remove(Type type) {

    }






    @Override
    public void insertType(Brand brand) {

    }

    @Override
    public void remove(Brand brand) {

    }
}
