package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaSiete {

    public double convertirAGalones (double litros){
        return (litros/3.785);
    }
    public ProblemaSiete () throws IOException {

        System.out.println("Problema 7");
        System.out.println("Producción Leche");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double litros, galon = 3.785;

        System.out.print("Ingrese en la cantidad de Litros producidos: ");
        litros = Math.abs(Double.parseDouble(leer.readLine()));

        System.out.print("Serán recibidos: " + convertirAGalones(litros) + " galones de leche");

    }

}
