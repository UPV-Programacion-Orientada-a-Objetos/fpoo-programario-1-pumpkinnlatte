package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaCinco {

    public double areaTerrerno (double a, double b){
        double c = a/2;
        return b*c + (b*(a-c)/2);
    }

    public ProblemaCinco() throws IOException{

        System.out.println("Problema 5");
        System.out.println("Area Figura");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double a,b;

        System.out.print("Ingrese el tamaño del lado A (unidades):");
        a = Math.abs(Double.parseDouble(leer.readLine()));

        System.out.print("Ingrese el tamaño del lado B (unidades):");
        b = Math.abs(Double.parseDouble(leer.readLine()));

        System.out.print("El area del terreno es de: " + areaTerrerno(a,b) + " unidades^2");
    }
}
