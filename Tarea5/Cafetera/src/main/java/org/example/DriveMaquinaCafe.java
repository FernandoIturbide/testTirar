package org.example;

import java.util.Scanner;
public class DriveMaquinaCafe {
    public static void main(String[] args) {
        byte a=0,opcion=0;
        Scanner in=new Scanner(System.in);
        Metodos metodos=new Metodos();
        while (a==0){
            metodos.Inicio();
            opcion=in.nextByte();
            if (opcion==1){
                metodos.cafeAmericano();
            } else if (opcion==2) {
                metodos.cafeExpreso();
            } else if (opcion==3) {
               metodos.cafeCapuchino();
            } else if (opcion==4) {
                metodos.recursos();
            } else if (opcion==5) {
                metodos.rellenar();
            } else if (opcion==6) {
                metodos.saliendo();
                a=1;
            } else {
                metodos.noValido();
            }
        }
    }
}
