package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaOcho {

    public double distanciaEntrePuntos(double x1, double y1, double x2, double y2){
        double x = x2-x1, y = y2-y1;
        return Math.sqrt( (x*x) + (y*y) );
    }
    public ProblemaOcho() throws IOException{

        System.out.println("Problema 8");
        System.out.println("Producción Leche");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double x1, x2, y1, y2;

        System.out.println("---------- PUNTO A ------------");
        System.out.print("Ingresa la coordenada x: ");
        x1 = Double.parseDouble(leer.readLine());
        System.out.print("Ingresa la coordenada y: ");
        y1 = Double.parseDouble(leer.readLine());

        System.out.println("\n---------- PUNTO B ------------");
        System.out.print("Ingresa la coordenada x: ");
        x2 = Double.parseDouble(leer.readLine());
        System.out.print("Ingresa la coordenada y: ");
        y2 = Double.parseDouble(leer.readLine());

        System.out.println("\n\nLa distancia entre los dos puntos es de: " + distanciaEntrePuntos(x1, y1, x2, y2) + " Unidades");


    }

}
