package org.example;

public class Apagador {
    private Color color;
    private float dimensiones;
    private byte numero_interruptores;
    private String forma;
    private byte numero_enchufes;
    public Apagador() {
    }
    public Apagador(Color color, float dimensiones, byte numero_interruptores, String forma, byte numero_enchufes) {
        this.color = color;
        this.dimensiones = dimensiones;
        this.numero_interruptores = numero_interruptores;
        this.forma = forma;
        this.numero_enchufes = numero_enchufes;
    }
    public Apagador(Color color, byte numero_enchufes) {
        this.color = color;
        this.numero_enchufes = numero_enchufes;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public float getDimensiones() {
        return dimensiones;
    }
    public void setDimensiones(float dimensiones) {
        this.dimensiones = dimensiones;
    }
    public byte getNumero_interruptores() {
        return numero_interruptores;
    }
    public void setNumero_interruptores(byte numero_interruptores) {
        this.numero_interruptores = numero_interruptores;
    }
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
    public byte getNumero_enchufes() {
        return numero_enchufes;
    }
    public void setNumero_enchufes(byte numero_enchufes) {
        this.numero_enchufes = numero_enchufes;
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "Apagador{" +
                "color=" + color +
                ", dimensiones=" + dimensiones +
                ", numero_interruptores=" + numero_interruptores +
                ", forma='" + forma + '\'' +
                ", numero_enchufes=" + numero_enchufes +
                '}';
    }
    public boolean encendido{
        System.out.println("El apagador está: ");
        boolean on = Math.random()>5.1;
        return on;
    }
}