package org.example;

public class Vaso {
    private int capacidad;
    private String tipo;

    public Vaso() {
    }

    public Vaso(int capacidad, String tipo) {
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vaso{" +
                "capacidad=" + capacidad +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
