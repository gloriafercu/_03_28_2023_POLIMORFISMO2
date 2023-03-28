package com.adecco.modelo;

public class BebidaGaseosa extends Bebida {
    private double cantidadAzucar;

    @Override
    public String toString() {
        return "BebidaGaseosa { " +
                "cantidadAzucar = " + cantidadAzucar +
                " } " + super.toString();
    }

    public BebidaGaseosa() {
    }

    public BebidaGaseosa(String nombre, String marca, double precio, double cantidadAzucar) {
        super(nombre, marca, precio);
        this.cantidadAzucar = cantidadAzucar;
    }

    public double getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(double cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }
}
