package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramaVeinte {

    public ProgramaVeinte() throws IOException {

        System.out.println("Problema 20");
        System.out.println("Llamada Telefonica");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double velocidad, km;

        System.out.print("Ingrese la distancia a recorrer en km: ");
        km = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese en m/s2 la velocidad a la que va el ciclista: ");
        velocidad = Double.parseDouble(leer.readLine());

        System.out.print("El ciclista tardará " + tiempoRecorrer(km, velocidad) + " en recorrer " + km + " kilometros");

    }

}
