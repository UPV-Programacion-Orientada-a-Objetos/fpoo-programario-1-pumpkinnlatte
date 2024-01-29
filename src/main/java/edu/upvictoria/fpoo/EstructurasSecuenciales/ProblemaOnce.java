package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaOnce {

    public double pagoAgua(double l, double a, double h, double costo){
        return (l * a* h) * costo;
    }
    public ProblemaOnce() throws IOException{

        System.out.println("Problema 11");
        System.out.println("CONAGUA");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double l, a, h, costo;

        System.out.print("Ingrese el costo por metro cúbico: ");
        costo = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese en metros el largo de la alberca: ");
        l = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese en metros el ancho de la alberca: ");
        a = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese en metros la altura de la alberca: ");
        h = Double.parseDouble(leer.readLine());

        System.out.print("La alberca consumió: $ " + pagoAgua(l, a, h, costo) + "en agua");

    }

}
