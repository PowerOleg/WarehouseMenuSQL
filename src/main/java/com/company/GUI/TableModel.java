package com.company.GUI;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableModel extends AbstractTableModel {

    private int columnNumber = 7;
    private List<String[]> arrayList;

    public TableModel() {
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
        case 1: return "Name";
        case 2: return "Type";
        case 3: return "Brand";
        case 4: return "Quantity";
        case 5: return "Price(1)";
        case 6: return "Price";
    }
    return null;
    }
    public boolean addRow(String[] row) {
    return arrayList.add(row);
    }
    public boolean addTable(List<String[]> table) {
     return arrayList.addAll(table);
    }

}
