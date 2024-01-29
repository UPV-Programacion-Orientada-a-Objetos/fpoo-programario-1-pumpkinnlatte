package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeintiuno {

    public double precioAgua(double precio, double m3) throws IOException {
        return Math.abs(precio) * Math.abs(m3);
    }

    public ProblemaVeintiuno() throws IOException {

        System.out.println("Problema 21");
        System.out.println("CONAGUA 2");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double m3, precio;

        System.out.print("Ingrese el costo de un metro cubico de agua: ");
        precio = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese los metros cubicos de agua consumidos: ");
        m3 = Double.parseDouble(leer.readLine());

        System.out.print("El costo del consumo de agua es de $ " + precioAgua(precio, m3) + " pesos mexicanos");

    }

}
