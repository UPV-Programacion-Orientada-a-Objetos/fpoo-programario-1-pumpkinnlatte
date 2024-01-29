package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramaDiecinueve {

    public double tiempoRecorrer( double km, double velocidad){
        return Math.abs(km) / Math.abs(velocidad);
    }

    public ProgramaDiecinueve() throws IOException {

        System.out.println("Problema 19");
        System.out.println("Ciclista");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double velocidad, km;

        System.out.print("Ingrese la distancia a recorrer en km: ");
        km = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese en m/s2 la velocidad a la que va el ciclista: ");
        velocidad = Double.parseDouble(leer.readLine());

        System.out.print("El ciclista tardará " + tiempoRecorrer(km, velocidad) + " en recorrer " + km + " kilometros");

    }

}
