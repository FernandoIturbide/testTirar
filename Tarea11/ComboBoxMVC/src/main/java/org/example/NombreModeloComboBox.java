package org.example;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class NombreModeloComboBox implements ComboBoxModel {

    ArrayList <String> datos;
    String select;

    public NombreModeloComboBox() {
        datos= new ArrayList<>();
    }

    public NombreModeloComboBox(ArrayList<String> datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.select=(String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return select;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return datos.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
    public void agregarNombre(String Nombre){
        datos.add(Nombre);
    }
}
