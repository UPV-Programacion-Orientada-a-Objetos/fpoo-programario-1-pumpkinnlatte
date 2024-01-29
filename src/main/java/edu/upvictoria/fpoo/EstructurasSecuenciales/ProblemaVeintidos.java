package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeintidos {

    public double precioLuz(double precio, double kw) throws IOException {
        return Math.abs(precio) * Math.abs(kw);
    }

    public ProblemaVeintidos() throws IOException {

        System.out.println("Problema 22");
        System.out.println("CLS");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double kw, precio;

        System.out.print("Ingrese el costo de un kilowatt(kW) de consumo: ");
        precio = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese los kilowatts(kW) consumidos: ");
        kw = Double.parseDouble(leer.readLine());

        System.out.print("El costo del consumo de agua es de $ " + precioLuz(precio, kw) + " pesos mexicanos");

    }

}
