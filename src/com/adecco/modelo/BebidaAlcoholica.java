package com.adecco.modelo;

public class BebidaAlcoholica extends Bebida {
    private int gradosAlcohol;

    @Override
    public String toString() {
        return "BebidaAlcoholica { " +
                " gradosAlcohol = " + gradosAlcohol +
                " } " + super.toString();
    }

    public BebidaAlcoholica() {
    }

    public BebidaAlcoholica(String nombre, String marca, double precio, int gradosAlcohol) {
        super(nombre, marca, precio);
        this.gradosAlcohol = gradosAlcohol;
    }

    public int getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(int gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }
}
