//window.add(buttonsPane1, new GridBagConstraints(0,0,
//        1,1,0,0,GridBagConstraints.WEST, GridBagConstraints.BOTH,
//        new Insets(1,1,1,1),0,0));


//странно что таблица всегда отображает значения, я думал нужно будет обновлять
package com.company.GUI;


import javax.swing.*;
import java.awt.*;

public class MainView {
    JPanel window;
    JPanel buttonsPane1;
    JPanel buttonsPane2;
    JPanel buttonsPane3;
    JFrame frame;

    JTextField textField1;
    JLabel lable1;
    JButton createTable, deleteTable, refreshTable, addProductName, deleteProductName, addProductType, deleteProductType,
            addBrand, deleteBrand, setPrice, setQuantity;                                        //+ цвет, страна

    public MainView() {
        window = new JPanel();
        window.setLayout(new BorderLayout());
        buttonsPane1 = new JPanel();
        buttonsPane2 = new JPanel();
        buttonsPane3 = new JPanel();
        buttonsPane1.setLayout(new GridLayout(3, 4));
        textField1 = new JTextField(20);
        lable1 = new JLabel("Нажмите кнопку действия ниже, затем введите параметр");

        createTable = new JButton("Create Table");
        deleteTable = new JButton("Delete Table");
        refreshTable = new JButton("Refresh Table");
        addProductName = new JButton("Add Product Name");
        deleteProductName = new JButton("Delete Product Name");
        addBrand = new JButton("Add Brand");
        deleteBrand = new JButton("Delete Brand");
        addProductType = new JButton("Add Product Type");
        deleteProductType = new JButton("Delete Product Type");
        setPrice = new JButton("Set Price");
        setQuantity = new JButton("Set Quantity");



        buttonsPane1.add(createTable);
        buttonsPane1.add(addProductName);
        buttonsPane1.add(addProductType);
        buttonsPane1.add(addBrand);
        buttonsPane1.add(deleteTable);
        buttonsPane1.add(deleteProductName);
        buttonsPane1.add(deleteProductType);
        buttonsPane1.add(deleteBrand);
        buttonsPane1.add(refreshTable);
        buttonsPane1.add(setPrice);
        buttonsPane1.add(setQuantity);
        buttonsPane2.add(lable1);
        buttonsPane2.add(textField1);



//Table
        TableModel tableModel = new TableModel();
        JTable table = new JTable(tableModel);
        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setPreferredSize(new Dimension(640, 480));
//тут раньше был код чтобы добавить значения в таблицу

        buttonsPane3.add(jScrollPane);



//
        window.add("South", buttonsPane1);
        window.add("North", buttonsPane2);
        window.add("Center", buttonsPane3);
        frame = new JFrame();
        frame.setContentPane(window);
        frame.setSize(960,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}
