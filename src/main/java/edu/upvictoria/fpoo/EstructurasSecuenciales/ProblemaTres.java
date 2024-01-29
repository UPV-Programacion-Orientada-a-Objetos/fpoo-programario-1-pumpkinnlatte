package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaTres {

    public double areaRectangulo (double b, double h){
        return (b * h)/2;
    }

    public ProblemaTres() throws IOException{

        System.out.println("Problema 3");
        System.out.println("Area Rectangulo");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        double b, h;

        System.out.print("Ingrese la base del rectangulo (unidades):");
        b = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese la altura del rectangulo (unidades):");
        h = Double.parseDouble(leer.readLine());

        System.out.print("El area del rectangulo es de: " + areaRectangulo(b,h));
    }

}
