package ico.fes.poo2258;

import java.awt.*;

public class Gato {
    private boolean maulla;
    private Color color;
    private float altura;
    private String especie;
    private Color color_ojos;

    public Gato() {
    }

    public Gato(boolean maulla, Color color, float altura, String especie, Color color_ojos) {
        this.maulla = maulla;
        this.color = color;
        this.altura = altura;
        this.especie = especie;
        this.color_ojos = color_ojos;
    }

    public Gato(Color color, String especie) {
        this.color = color;
        this.especie = especie;
    }

    public boolean isMaulla() {
        return maulla;
    }

    public void setMaulla(boolean maulla) {
        this.maulla = maulla;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Color getColor_ojos() {
        return color_ojos;
    }

    public void setColor_ojos(Color color_ojos) {
        this.color_ojos = color_ojos;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "maulla=" + maulla +
                ", color=" + color +
                ", altura=" + altura +
                ", especie='" + especie + '\'' +
                ", color_ojos=" + color_ojos +
                '}';
    }

    public boolean dormir(){
        System.out.println("¿El gato está durmiendo?: ");
        boolean durmiendo =Math.random()>0.51;
        return durmiendo;
    }

    public boolean comer(){
        System.out.println("¿El gato está comiendo?: ");
        boolean comiendo =Math.random()>0.51;
        return comiendo;
    }
    public boolean rascar(){
        System.out.println("¿El gato está rascando?: ");
        boolean rascar =Math.random()>0.51;
        return rascar;
    }
}
