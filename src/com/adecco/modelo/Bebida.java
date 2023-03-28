package com.adecco.modelo;

public class Bebida {
    protected String nombre;
    protected String marca;
    protected double precio;

    @Override
    public String toString() {
        return "Bebida { " +
                "nombre = '" + nombre + '\'' +
                ", marca = '" + marca + '\'' +
                ", precio = " + precio + " " +
                '}';
    }

    public Bebida() {
    }

    public Bebida(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
