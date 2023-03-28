package com.adecco.modelo;

public class Agua extends Bebida {
    private String origen;

    @Override
    public String toString() {
        return "Agua { " +
                "origen = '" + origen + '\'' +
                " } " + super.toString();
    }

    public Agua() {
    }

    public Agua(String nombre, String marca, double precio, String origen) {
        super(nombre, marca, precio);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
