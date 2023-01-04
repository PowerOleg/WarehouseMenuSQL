package com.company.GUI;

import com.company.SQL.dao.Query;
import com.company.SQL.pojo.Brand;
import com.company.SQL.pojo.Product;
import com.company.SQL.pojo.Type;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class EventHandler implements ActionListener {
    //тут создавать new MainView нельзя. Проблема что будет новый MainView, а не тот который в main. НАДО передать
    MainView mainView; //создаю этот объект в другом месте и сюда надо загрузить объект с нужными мне методами.
    Query query1 = new Query();

    public void setMainView(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == mainView.getRefreshTableButton()) {
            List<String[]> tableWarehouseFromSQL = new ArrayList<>();
            List<String[]> tableTypeFromSQL = new ArrayList<>();
            List<String[]> tableBrandFromSQL = new ArrayList<>();

            List<Product> selectedProducts = query1.selectAll();
            List<Type> selectedTypes = query1.selectAllTypes();
            List<Brand> selectedBrands = query1.selectAllBrands();


            for (int i = 0; i < selectedProducts.size(); i++) {
                String[] sqlTableWarehouseRow = {
                        selectedProducts.get(i).getId(),
                        selectedProducts.get(i).getName(),
                        selectedProducts.get(i).getType(),
                        selectedProducts.get(i).getBrand(),
                        String.valueOf(selectedProducts.get(i).getQuantity()),
                        String.valueOf(selectedProducts.get(i).getPrice_1()),
                        String.valueOf(selectedProducts.get(i).getPrice())
                };
                tableWarehouseFromSQL.add(sqlTableWarehouseRow);
            }


            for (int i = 0; i < selectedTypes.size(); i++) {
                String[] sqlTableTypeRow = {
                        selectedTypes.get(i).getId(),
                        selectedTypes.get(i).getType()
                };
                tableTypeFromSQL.add(sqlTableTypeRow);
            }


            for (int i = 0; i < selectedBrands.size(); i++) {
                String[] sqlTableBrandRow = {
                        selectedBrands.get(i).getId(),
                        selectedBrands.get(i).getBrand(),
                };
                tableBrandFromSQL.add(sqlTableBrandRow);
            }

            mainView.showTables(tableWarehouseFromSQL, tableTypeFromSQL, tableBrandFromSQL);

        }
    }
}
