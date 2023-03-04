package ico.fes.poo2258;
import java.awt.*;
public class Apagador {
    private Color color;
    private byte numero_apagadores;
    private byte numero_enchufes;
    private String forma;
    private float dimensiones;

    public Apagador() {
    }

    public Apagador(Color color, byte numero_apagadores, byte numero_enchufes, String forma, float dimensiones) {
        this.color = color;
        this.numero_apagadores = numero_apagadores;
        this.numero_enchufes = numero_enchufes;
        this.forma = forma;
        this.dimensiones = dimensiones;
    }

    public Apagador(byte numero_apagadores, byte numero_enchufes) {
        this.numero_apagadores = numero_apagadores;
        this.numero_enchufes = numero_enchufes;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public byte getNumero_apagadores() {
        return numero_apagadores;
    }

    public void setNumero_apagadores(byte numero_apagadores) {
        this.numero_apagadores = numero_apagadores;
    }

    public byte getNumero_enchufes() {
        return numero_enchufes;
    }

    public void setNumero_enchufes(byte numero_enchufes) {
        this.numero_enchufes = numero_enchufes;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public float getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(float dimensiones) {
        this.dimensiones = dimensiones;
    }

    @Override
    public String toString() {
        return "Apagador{" +
                "color=" + color +
                ", numero_apagadores=" + numero_apagadores +
                ", numero_enchufes=" + numero_enchufes +
                ", forma='" + forma + '\'' +
                ", dimensiones=" + dimensiones +
                '}';
    }

    public boolean encendido1(){
        System.out.println("¿El Apagador está encendido?: ");
        boolean resultado = Math.random()>0.51;
        return resultado;
    }
    public boolean conectado(){
        System.out.println("El enchufe tiene algo conectado");
        boolean resultado2=Math.random()>0.51;
        return resultado2;
    }
    public boolean corriente(){
        System.out.println("¿Hay corriente en el enchufe?:");
        boolean luz=Math.random()<0.95;
        return luz;
    }

}
