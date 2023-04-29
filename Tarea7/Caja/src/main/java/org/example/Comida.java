package org.example;

public class Comida {
    private String Nombre;
    private boolean Procesado;

    public Comida() {
    }

    public Comida(String nombre, boolean procesado) {
        Nombre = nombre;
        Procesado = procesado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public boolean isProcesado() {
        return Procesado;
    }

    public void setProcesado(boolean procesado) {
        Procesado = procesado;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "Nombre='" + Nombre + '\'' +
                ", Procesado=" + Procesado +
                '}';
    }
}
