package org.example;

public class Vaso {
    private int Capacidad;
    private String Tipo;

    public Vaso() {
    }

    public Vaso(int capacidad, String tipo) {
        Capacidad = capacidad;
        Tipo = tipo;

    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vaso{" +
                "Capacidad=" + Capacidad +
                "ml, Tipo='" + Tipo + '\'' +
                '}';
    }
}
