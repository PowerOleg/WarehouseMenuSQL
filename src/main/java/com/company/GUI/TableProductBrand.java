package com.company.GUI;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableProductBrand extends AbstractTableModel {
    //    private int columnNumber = 1;
    List<String> arrayList;

    public TableProductBrand() {
        arrayList = new ArrayList<String>();
    }

    @Override
    public int getRowCount() {
        return arrayList.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return arrayList.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        return "Brand";
    }
    public boolean addRow(String[] row) {   ///////??????зачем массив
        return arrayList.add(row[0]);
    }
}
