package org.example.Ejemplo2;

public class Motocicleta implements Vehiculo{
    private int CC;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int CC, String marca) {
        this.CC = CC;
        this.marca = marca;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "CC=" + CC +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void Caballito(){
        System.out.println("Haciendo un caballito para romperme un pie");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo");
        return true;
    }

    @Override
    public boolean Apagar() {
        System.out.println("Apagando");
        return false;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando");
    }
}
