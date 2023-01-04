//1. делаем кнопку RefreshTable для всех таблиц
//2. надо сделать после нажатия кнопки addType/addBrand/addProduct всплывающее окно и туда вводить параметры, а не в общее поле вводить слово.


//нужно будет добавить сохранение таблицы и загрузку, вместо создания и удаления
//прееделать все try чтобы были с ресурсами
//почему в таблице id идут не по порядку, а таблица сортируется по алфавиту
//чтобы другие люди смогли подключиться к SQL нужно чтобы классы Const и Config указывали на их MySQL Server

//!улучшить переход от List<Product> selectedProducts = query1.selectAll(); к
// загрузке в GUI таблицу которой надо String[] s , потому что tableModel.addRow(str1); где str1, это String[] str1


//trouble1(done)
// нельзя создавать внутри MainView EventHandler -получается они друг друга создают. и получается Deadloop
// Если создавать нельзя, !нужно передавать =>
//может отнаследоваться?
//решение: чтобы работала кнопка нужно чтобы выполнились 2-а условия: в MainView к кнопке подключился eventHandler и у eventHandler
// был объект MainView с методами MainView. это можно сделать через сеттеры. Как только сделаешь - все работает. В моем случае я для MainView сделал через конструктор.
package com.company;

import com.company.GUI.EventHandler;
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

    }
}
