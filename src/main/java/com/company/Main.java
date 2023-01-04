//1. делаем кнопку RefreshTable
//2. надо сделать после нажатия кнопки addType/addBrand/addProduct всплывающее окно и туда вводить параметры, а не в общее поле вводить слово.


//нужно будет добавить сохранение таблицы и загрузку, вместо создания и удаления
//прееделать все try чтобы были с ресурсами
//почему в таблице id идут не по порядку, а таблица сортируется по алфавиту
//чтобы другие люди смогли подключиться к SQL нужно чтобы классы Const и Config указывали на их MySQL Server

//!улучшить переход от List<Product> selectedProducts = query1.selectAll(); к
// загрузке в GUI таблицу которой надо String[] s , потому что tableModel.addRow(str1); где str1, это String[] str1

package com.company;

import com.company.GUI.MainView;
import com.company.SQL.dao.Query;
import com.company.SQL.pojo.Brand;
import com.company.SQL.pojo.Product;
import com.company.SQL.pojo.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main( String[] args ) {
        MainView mainView = new MainView();
        Query query1 = new Query();
        List<Product> selectedProducts = query1.selectAll();
        List<String[]> tableFromSQL = new ArrayList<>();
        for (int i = 0; i < selectedProducts.size(); i++) {
            String[] sqlTableRow = {
                    selectedProducts.get(i).getId(),
                    selectedProducts.get(i).getName(),
                    selectedProducts.get(i).getType(),
                    selectedProducts.get(i).getBrand(),
                    String.valueOf(selectedProducts.get(i).getQuantity()),
                    String.valueOf(selectedProducts.get(i).getPrice_1()),
                    String.valueOf(selectedProducts.get(i).getPrice())
            };
            tableFromSQL.add(sqlTableRow);
        }
        mainView.showTables(tableFromSQL);


    }
}
