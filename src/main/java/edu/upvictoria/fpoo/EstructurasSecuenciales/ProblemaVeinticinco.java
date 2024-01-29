package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeinticinco
{
    public double costoViaje(double dias, double hotel, double comida) throws IOException {
        return Math.ceil(dias) * (Math.abs(hotel) + Math.abs(comida) + 100.00);
    }

    public ProblemaVeinticinco() throws IOException {

        System.out.println("Problema 25");
        System.out.println("Cheque Viaje");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double dias, hotel, comida;

        System.out.print("Ingrese el numero de dias que durará el viaje: ");
        dias = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese el coste del hotel por día: ");
        hotel = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese el coste de la comida por día: ");
        comida = Double.parseDouble(leer.readLine());

        System.out.println("---- Costos del cheque ----");
        System.out.println("Hotel: " + hotel * dias);
        System.out.println("Comida: " + comida * dias);
        System.out.println("Otros: " + 100 * dias);

        System.out.print("El cheque deberá de tener la cantidad de: $ " + costoViaje(dias, hotel, comida) + " pesos mexicanos");

    }

}
