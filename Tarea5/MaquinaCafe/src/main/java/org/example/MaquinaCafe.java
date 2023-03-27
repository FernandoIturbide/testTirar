package org.example;

import java.util.Arrays;

public class MaquinaCafe {
    private int CapacidadAgua=5000, CapacidadCrema=1000,CapacidadCafe=1500;
    private int contador=0;
    private Vaso[] vasos;

    public MaquinaCafe() {
        vasos=new Vaso[50];
        for (int i = 0; i < 50; i++) {
            vasos[i]=new Vaso(0,"Vacio");
        }
    }

    public MaquinaCafe(int capacidadAgua, int capacidadCrema, int capacidadCafe, int contador, Vaso[] vasos) {
        CapacidadAgua = capacidadAgua;
        CapacidadCrema = capacidadCrema;
        CapacidadCafe = capacidadCafe;
        this.contador = contador;
        this.vasos = vasos;
    }

    public int getCapacidadAgua() {
        return CapacidadAgua;
    }

    public void setCapacidadAgua(int capacidadAgua) {
        CapacidadAgua = capacidadAgua;
    }

    public int getCapacidadCrema() {
        return CapacidadCrema;
    }

    public void setCapacidadCrema(int capacidadCrema) {
        CapacidadCrema = capacidadCrema;
    }

    public int getCapacidadCafe() {
        return CapacidadCafe;
    }

    public void setCapacidadCafe(int capacidadCafe) {
        CapacidadCafe = capacidadCafe;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Vaso[] getVasos() {
        return vasos;
    }

    public void setVasos(Vaso[] vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "MaquinaCafe{" +
                "CapacidadAgua=" + CapacidadAgua +
                ", CapacidadCrema=" + CapacidadCrema +
                ", CapacidadCafe=" + CapacidadCafe +
                ", contador=" + contador +
                ", vasos=" + Arrays.toString(vasos) +
                '}';
    }

    public void cafeamericano(){
        if (CapacidadAgua>=180){
            if (CapacidadCafe>=15){
                System.out.println("Café americano servido");
                CapacidadAgua=CapacidadAgua-180;
                CapacidadCafe=CapacidadCafe-15;
            }else {
                System.out.println("Café insuficiente");
            }
        } else {
            System.out.println("Agua insuficiente");
        }
    }
    public void cafeexpreso(){
        if (CapacidadAgua>=140){
            if (CapacidadCafe>=20){
                System.out.println("Café Expreso servido");
                CapacidadAgua=CapacidadAgua-120;
                CapacidadCafe=CapacidadCafe-20;
            }else {
                System.out.println("Café insuficiente");
            }
        } else {
            System.out.println("Agua insuficiente");
        }
    }
    public void cafecapuchino(){
        if (CapacidadAgua>=100){
            if (CapacidadCafe>=14){
                if (CapacidadCrema>=70){
                    System.out.println("Café Capuchino servido");
                    CapacidadAgua=CapacidadAgua-120;
                    CapacidadCafe=CapacidadCafe-20;
                }else {
                    System.out.println("Crema insuficiente");
                }
            }else {
                System.out.println("Café insuficiente");
            }
        } else {
            System.out.println("Agua insuficiente");
        }
    }
    public void recursos(){
        System.out.println("Agua="+CapacidadAgua+"\nCafé="+CapacidadCafe+"\nCrema="+CapacidadCrema);
    }
}
