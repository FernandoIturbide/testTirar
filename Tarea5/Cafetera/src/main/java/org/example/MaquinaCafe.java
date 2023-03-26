package org.example;

import java.util.Arrays;

public class MaquinaCafe {
    private int agua=5000;
    private int cafe=1000;
    private int crema=1500;
    private Vaso[] vasos;

    public MaquinaCafe() {
        vasos=new Vaso[50];
    }

    public MaquinaCafe(Vaso[] vasos) {
        this.vasos = vasos;
    }

    public MaquinaCafe(int agua, int cafe, int crema, Vaso[] vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
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
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + Arrays.toString(vasos) +
                '}';
    }
    public void Americano(){
        if(agua-180>=0 && cafe-15>=15){
            System.out.println("Todavía tiene suficientes recursos para un cafe Americano");
            agua=agua-180;
            cafe=cafe-15;
        }else {
            System.out.println("Ya no cuanta con suficientes recursos para un cafe Americano");

        }
    }
    public void Expreso(){
        if(agua-120>=0 && cafe-20>=15){
            System.out.println("Todavía tiene suficientes recursos para un cafe Expreso");
            agua=agua-120;
            cafe=cafe-20;
        }else {
            System.out.println("Ya no cuanta con suficientes recursos para un cafe Expreso");
        }
    }
    public void Capuchino(){
        if(agua-100>=0 && cafe-15>=0 && crema-70>=0){
            System.out.println("Todavía tiene suficientes recursos para un cafe Capuchino");
            agua=agua-100;
            crema=crema-70;
            cafe=cafe-14;
        }else {
            System.out.println("Ya no cuanta con suficientes recursos para un cafe Capuchino");
        }
    }
    public String Recursos(){
        String recursos="\nHay "+agua+"ml de agua\nHay "+cafe+"g de café\nHay "+crema+"ml de crema\n";
        return recursos;
    }
}


