package com.company.GUI;

import com.company.SQL.dao.Query;
import com.company.SQL.pojo.Brand;
import com.company.SQL.pojo.Product;
import com.company.SQL.pojo.Type;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class EventHandler implements ActionListener {
    MainView mainView = new MainView();
    Query query1 = new Query();

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == mainView.getRefreshTable()) {
            List<Product> selectedProducts = query1.selectAll();
//            List<Type> selectedTypes = query1.selectAllTypes();
//            List<Brand> selectedBrands = query1.selectAllBrands();
//            String[] s = selectedProducts.get(0).toString().split();
//            mainView.showTables();
        }
    }
}
