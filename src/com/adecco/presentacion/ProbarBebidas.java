package com.adecco.presentacion;

import com.adecco.modelo.Agua;
import com.adecco.modelo.Bebida;
import com.adecco.modelo.BebidaGaseosa;

public class ProbarBebidas {
    public static void main(String[] args) {
        // Vamos a instanciar el agua pero con polimorfismo
        Bebida a1 = new Agua("Agua", "Solán de Cabras", 1.5, "Madrid");
        System.out.println(a1);
        // Yo quiero cambiar el origen del agua, 1º debemos meter a1 a una variable tipo Agua y hacer casting
        Agua a2 = (Agua) a1;
        a2.setOrigen("Sierra Nevada"); // ya podemos cambiar el origen con el setter
        System.out.println(a2);

        Bebida g1 = new BebidaGaseosa("Coca-cola zero", "Coca-cola", 0.75, 0.12);
        // Ahora quiero modificar la cantidad de azúcar
        BebidaGaseosa g2 = (BebidaGaseosa) g1; // asigno a variable BebidaGaseosa y casting
        g2.setCantidadAzucar(0.09);
        System.out.println(g2.toString());
        System.out.println(g1.toString()); // Ahora g1 y g2 apuntan al mismo objeto en la memoria y valen lo mismo
    }
}