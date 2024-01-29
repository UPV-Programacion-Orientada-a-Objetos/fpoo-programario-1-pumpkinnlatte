package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCuatro {

    public double areaCircunferencia(double r){
        return (3.1416 * (r *r));
    }
    public ProblemaCuatro() throws IOException{

        System.out.println("Problema 4");
        System.out.println("Area Circunferencia");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double radio;

        System.out.print("Ingrese el radio del circulo (unidades): ");

        radio = Math.abs(Double.parseDouble(leer.readLine()));

        System.out.print("El area de la circunferencia es de: " + areaCircunferencia(radio) + " (unidades^2)");

    }

}
