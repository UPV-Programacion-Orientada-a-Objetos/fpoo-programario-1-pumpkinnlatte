package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeintitres {

    public double obtenerDesc(double precio){
        return Math.abs(precio) - (Math.abs(precio) * 0.20);
    }

    public double obtenerIVA(double precio){
        return Math.abs(precio) + (Math.abs(precio) * 0.15);
    }

    public double calcularPrecio(double precio){
        return obtenerIVA(obtenerDesc(precio));
    }

    public ProblemaVeintitres() throws IOException {

        System.out.println("Problema 23");
        System.out.println("Descuentos");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double costo;

        System.out.print("Ingrese el costo del producto: ");
        costo = Double.parseDouble(leer.readLine());

        System.out.print("Precio Original     : $" + obtenerDesc(costo) + " MXN");
        System.out.print("Precio con Descuento: $" + obtenerDesc(costo) + " MXN");
        System.out.print("Precio IVA          : $" + obtenerIVA(costo) + " MXN");
        System.out.print("Precio a pagar      : $ " + calcularPrecio(costo) + " MXN");

    }

}
