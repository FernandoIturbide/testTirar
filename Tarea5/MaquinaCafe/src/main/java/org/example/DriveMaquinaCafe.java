package org.example;

import java.util.Scanner;

public class DriveMaquinaCafe {

    public static void main(String[] args) {
        MaquinaCafe maquinaCafe=new MaquinaCafe();
        Vaso[] vasos=new Vaso[50];
        Scanner i=new Scanner(System.in);
        int salir=0;
        int opcion=0;
        int numCafes=0;
        int Contador=0;
        while (salir==0){
            System.out.println("1.Café Americano \n2.Café Expreso\n3.Café Capuchino\n4.Mostrar recursos\n5.Salir");
            opcion=i.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("¿Cuántos cafés americanos necesita?");
                    numCafes=i.nextInt();
                    for (int j = 0; j < numCafes; j++) {
                        maquinaCafe.cafeamericano();
                       vasos[Contador]=new Vaso(195,"Café Americano");
                       Contador++;
                    }
                    maquinaCafe.setVasos(vasos);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("¿Cuántos cafés expreso necesita?");
                    numCafes=i.nextInt();
                    for (int j = 0; j < numCafes; j++) {
                        maquinaCafe.cafeexpreso();
                        vasos[Contador]=new Vaso(140,"Café Expreso");
                        Contador++;
                    }
                    maquinaCafe.setVasos(vasos);
                    break;
                case 3:
                    System.out.println("¿Cuántos cafés Capuchinos necesita?");
                    numCafes=i.nextInt();
                    for (int j = 0; j < numCafes; j++) {
                        maquinaCafe.cafecapuchino();
                        vasos[Contador]=new Vaso(184,"Café Capuchino");
                        Contador++;
                    }
                    maquinaCafe.setVasos(vasos);
                    break;
                case 4:
                    maquinaCafe.recursos();
                    break;
                case 6:
                    salir=1;
            }
        }
    }
}

