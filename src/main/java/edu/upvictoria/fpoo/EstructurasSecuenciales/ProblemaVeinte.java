package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeinte {

    public double precioLlamada(double precio, double duracion) throws IOException {
        return Math.abs(precio) * Math.abs(duracion);
    }

    public ProblemaVeinte() throws IOException {

        System.out.println("Problema 20");
        System.out.println("Llamada Telefonica");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double duracion, precio;

        System.out.print("Ingrese el costo de llamada por minuto: ");
        precio = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese los minutos que duró la llamada: ");
        duracion = Double.parseDouble(leer.readLine());

        System.out.print("El costo de la llamada es de $ " + precioLlamada(precio, duracion) + " pesos mexicanos");

    }

}
