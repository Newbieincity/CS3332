/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author duyto
 */
import Api_call.Lesson_api;

import javax.swing.table.AbstractTableModel;
import java.util.Stack;

public class SearchResult extends AbstractTableModel {
    private Stack<Lesson> lessons;

    public SearchResult() {
        lessons =new Stack<>();
    }

    public Stack<Lesson> getLessons() {
        return lessons;
    }

    @Override
    public int getRowCount() {
        return lessons.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        String name = "??";
        switch (column) {
            case 0:
                name = "ID";
                break;
            case 1:
                name = "Title";
                break;
            case 2:
                name = "Modified_at";
                break;
            case 3:
                name = "Modified_by";
                break;
            case 4:
                name = "Status";
                break;
        }
        return name;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class type = String.class;
        switch (columnIndex) {
            case 0:
            case 1:
            case 2:
            case 3:
                type = String.class;
                break;
            case 4:
                type = Integer.class;
                break;
        }
        return type;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Lesson lesson = lessons.get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = lesson.getLessonID();
                break;
            case 1:
                value = lesson.getTitle();
                break;
            case 2:
                value = lesson.getModified_at();
                break;
            case 3:
                value = lesson.getModified_by();
                break;
            case 4:
                value = lesson.getStatus();
                break;
        }
        return value;
    }
}