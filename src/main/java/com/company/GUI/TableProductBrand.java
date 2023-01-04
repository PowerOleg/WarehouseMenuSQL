package com.company.GUI;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableProductBrand extends AbstractTableModel {
    private int columnNumber = 2;
    private List<String[]> arrayList;

    public TableProductBrand() {
        arrayList = new ArrayList<String[]>();
    }

    @Override
    public int getRowCount() {
        return arrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNumber;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] s = arrayList.get(rowIndex);
        return s[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "id";
            case 1: return "Brand";
        }
        return null;
    }

    public boolean addRow(String[] row) {   ///////??????зачем массив
        return arrayList.add(row);
    }
    public boolean addTableBrand(List<String[]> table) {
        return arrayList.addAll(table);
    }
}
