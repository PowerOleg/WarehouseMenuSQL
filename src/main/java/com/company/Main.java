//странно что таблица всегда отображает значения, я думал нужно будет обновлять
//нужно будет добавить сохранение таблицы и загрузку

//задание 1. Загрузить в таблицу из SQL строчку
//interface Warehouse command. возвращает не список. Может лучше список?
//Warehouse содержит строки под названием Product а не warehouse в строке
//прееделать все try тчобы были с ресурсами
//WarehouseCommands, Product  //убрал все аргументы у метода select() потому что пока хочу вывести все, без условий
//почему в таблице id идут не по порядку, а таблица сортируется по алфавиту
package com.company;

import com.company.GUI.MainView;
import com.company.SQL.dao.Query;
import com.company.SQL.pojo.Brand;
import com.company.SQL.pojo.Product;
import com.company.SQL.pojo.Type;

import java.util.List;

public class Main {
    public static void main( String[] args ) {
//        MainView mainView = new MainView();
        Query query1 = new Query();
        List<Product> selectedProducts = query1.selectAll();
        List<Type> selectedTypes = query1.selectAllTypes();
        List<Brand> selectedBrands = query1.selectAllBrands();
        System.out.println(selectedProducts);
        System.out.println(selectedTypes);
        System.out.println(selectedBrands);
    }
}
