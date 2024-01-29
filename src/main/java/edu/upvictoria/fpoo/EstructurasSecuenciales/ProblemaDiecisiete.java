package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaDiecisiete {

    public double hipotenusa(double a, double b){
        return Math.sqrt((a*a) + (b*b) );
    }

    public ProblemaDiecisiete() throws IOException {

        System.out.println("Problema 17");
        System.out.println("Modista");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double a, b;

        System.out.print("Ingrese en unidades la medida del lado A: ");
        a = Math.abs(Double.parseDouble(leer.readLine()));

        System.out.print("Ingrese en unidades la medida del lado B: ");
        b = Math.abs(Double.parseDouble(leer.readLine()));

        System.out.print("La medida de la hipotenusa es de" + hipotenusa(a, b) + " unidades");

    }

}
