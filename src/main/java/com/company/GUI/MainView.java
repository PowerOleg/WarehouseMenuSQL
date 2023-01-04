package com.company.GUI;


import com.company.SQL.pojo.Product;

import javax.swing.*;
import java.awt.*;
import java.nio.file.Paths;
import java.util.List;

public class MainView {
    private JPanel window;
    private JPanel buttonsPane1;
    private JPanel buttonsPane2;
    private JPanel buttonsPane3;
    private JFrame frame;

    private JTextField textField1;
    private JLabel lable1;
    private JButton createTable, deleteTable, refreshTable, addProductName, deleteProductName, addProductType, deleteProductType,
            addBrand, deleteBrand, setPrice, setQuantity;

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






















//
        window.add("South", buttonsPane1);
        window.add("North", buttonsPane2);

        frame = new JFrame();
        frame.setContentPane(window);
        frame.setSize(1024, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void showTables(List<String[]> sqlTable) {
//Table1
        TableModel tableModel = new TableModel();
        JTable table1 = new JTable(tableModel);
        JScrollPane jScrollPane1 = new JScrollPane(table1);
        jScrollPane1.setPreferredSize(new Dimension(600, 320));

        //тут код чтобы добавить значения в таблицу
//        String[] str1 = new String[6];
//        str1[0] = "Джинсы";
//        str1[1] = "Штаны";
//        str1[2] = "Wrangler";
//        str1[3] = "5";
//        str1[4] = "3000";
        tableModel.addTable(sqlTable);

//
//        String[] str2 = new String[6];
//        str2[2] = "Levis";
//        tableModel.addRow(str2);




//Table2
        TableProductType tableProductType = new TableProductType();
        JTable table2 = new JTable(tableProductType);
        JScrollPane jScrollPane2 = new JScrollPane(table2);
        jScrollPane2.setPreferredSize(new Dimension(180, 320));

//Table3
        TableProductBrand tableProductBrand = new TableProductBrand();
        JTable table3 = new JTable(tableProductBrand);
        JScrollPane jScrollPane3 = new JScrollPane(table3);
        jScrollPane3.setPreferredSize(new Dimension(180, 320));



        buttonsPane3.add(jScrollPane1, new GridBagConstraints(0,0,
        1,1,0,0,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
        new Insets(1,1,1,1),0,0));


        buttonsPane3.add(jScrollPane2, new GridBagConstraints(1,0,
                1,1,0,0,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));


        buttonsPane3.add(jScrollPane3, new GridBagConstraints(2,0,
                1,1,0,0,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));

        window.add("Center", buttonsPane3);
        frame.setVisible(true);
    }
    public JButton getRefreshTable() {
        return refreshTable;
    }

}
