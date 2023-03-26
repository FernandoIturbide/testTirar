package org.example;

import java.util.Scanner;

public class Metodos {
    MaquinaCafe maquinaCafe = new MaquinaCafe();
    private Vaso[] vasos;
    private int contador=0;
    int numeroCafes;
    Scanner in=new Scanner(System.in);

    public Metodos() {
        vasos=new Vaso[50];
        for (int i = 0; i < 50; i++) {
            vasos[i]=new Vaso(0,"Vacio");
        }
    }

    public void Inicio(){
        System.out.print("1.Café Americano\n2.Café Expreso\n3.Café Capuchino\n4.Mostrar recursos\n5.Rellenar maquina de café\n6.Salir\nEscoja una opción: ");
    }
    public void cafeAmericano(){
        System.out.print("¿Cúantos cafés americanos quieres?: ");
        numeroCafes=in.nextInt();
        for (int i = 0; i < numeroCafes; i++) {
            maquinaCafe.Americano();
            vasos[contador]=new Vaso(195,"Café americano");
            contador++;
        }
        maquinaCafe.setVasos(vasos);
        System.out.println();
    }
    public void cafeExpreso(){
        System.out.print("¿Cúantos cafés Expresos quieres?: ");
        numeroCafes=in.nextInt();
        for (int i = 0; i < numeroCafes; i++) {
            maquinaCafe.Expreso();
            vasos[contador]=new Vaso(140,"Café expreso");
            contador++;
        }
        maquinaCafe.setVasos(vasos);
        System.out.println();
    }
    public void cafeCapuchino(){
        System.out.print("¿Cúantos cafés Capuchinos quieres?: ");
        numeroCafes=in.nextInt();
        for (int i = 0; i < numeroCafes; i++) {
            maquinaCafe.Capuchino();
            vasos[contador]=new Vaso(184,"Café capuchino");
            contador++;
        }
        maquinaCafe.setVasos(vasos);
        System.out.println();
    }
    public void recursos(){
        System.out.println(maquinaCafe);
    }
    public void rellenar(){
        maquinaCafe.setCafe(1000);
        maquinaCafe.setAgua(5000);
        maquinaCafe.setCrema(1500);
        contador=0;
        for (int i = 0; i < 50; i++) {
            vasos[i]=new Vaso(0,"Vacio");
        }
        maquinaCafe.setVasos(vasos);
        System.out.println("\nCargando.....\nLa maquina ya está llena\n");
    }

    public void saliendo (){
        System.out.println("\nGracias por usar nuestro software\nSaliendo....");
    }

    public void noValido() {
        System.out.println("\nOpción no valida, vuelva a intentar\n");
    }
}
