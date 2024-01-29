package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaSeis {

    public double areaRSC(double h, double r){
        double f1 = ((r+r) * h) / 2, f2 = (3.1416 * (r*r)) / 2;
        return f1 + f2;
    }
    public ProblemaSeis() throws IOException{

        System.out.println("Problema 6");
        System.out.println("Area FiguraRectanguloSemicirculo");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double h, r;

        System.out.print("Ingrese en unidades el tamaño del Radio: ");
        r = Math.abs(Double.parseDouble(leer.readLine()));

        System.out.print("Ingrese en unidades el tamaño de la Hipotenusa: ");
        h = Math.abs(Double.parseDouble(leer.readLine()));

        System.out.print("El area de la figura es de: " + areaRSC(h, r) + "(unidades)^2");

    }
}
