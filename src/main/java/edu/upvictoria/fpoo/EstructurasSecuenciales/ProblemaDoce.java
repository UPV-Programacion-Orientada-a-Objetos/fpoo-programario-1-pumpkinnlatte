package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaDoce {

    public double areaTriangulo(double b, double h){
        return (b*h)/2;
    }
    public ProblemaDoce() throws IOException {
        System.out.println("Problema 12");
        System.out.println("Area de un Triangulo");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double b, h;

        System.out.print("Ingrese en unidades la base: ");
        b = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese en unidades la altura: ");
        h = Double.parseDouble(leer.readLine());

        System.out.print("La alberca consumió: $ " + areaTriangulo(b,h) + " en agua");
    }

}
