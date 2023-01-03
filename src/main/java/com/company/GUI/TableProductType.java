package com.company.GUI;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableProductType extends AbstractTableModel {
    private int columnNumber = 2;
    List<String[]> arrayList;

    public TableProductType() {
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
            case 1: return "Type";
        }
        return null;
    }
    public boolean addRow(String[] row) {
        return arrayList.add(row);
    }


}
