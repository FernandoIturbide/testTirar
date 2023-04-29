package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja <String> miCaja=new Caja<>(new String[10]);
        miCaja.Add(0,"Hola");
        miCaja.Add(1,"Adios");
        miCaja.Add(2,"Hi");
        System.out.println(miCaja);
        String temp=miCaja.get(0);
        System.out.println("_______________________");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.Add(0,"Hola");
        cajaSin.Add(1,"Adios");
        cajaSin.Add(2,"HIII");
        System.out.println(cajaSin);
        String temp2=(String) miCaja.get(0);
        System.out.println("--------Comida-------");
        Caja <Comida> comidaCaja = new Caja<>(new Comida[10]);
        comidaCaja.Add(0,new Comida("Manzana",false));
        comidaCaja.Add(1,new Comida("Yogurth",true));
        comidaCaja.Add(2,new Comida("Naranja",false));
        System.out.println(comidaCaja);
        System.out.println("_______________________");
        ArrayList<Comida> comidaArrayList=new ArrayList<>();
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Zanahoria",false));
        comidaArrayList.add(new Comida("Manzana",false));
        System.out.println(comidaArrayList.size());
        System.out.println(comidaArrayList.get(13));
        ArrayList<Comida> comidaArrayList1 = new ArrayList<>();
        comidaArrayList1.add(new Comida("Zanahoria",false));
        comidaArrayList1.add(new Comida("Yogurth",true));
        comidaArrayList1.add(new Comida("Danonino",true));
        comidaArrayList1.add(new Comida("Manzana",false));
        comidaArrayList1.add(new Comida("Bisteck",false));
        System.out.println(comidaArrayList1.get(1));
        comidaArrayList1.set(3,new Comida("Sabritas",true));
        comidaArrayList1.add(new Comida("Fresa",false));
        System.out.println("------Final--------");
        for (Comida comida:comidaArrayList1){
            System.out.println(comida);
        }
    }
}