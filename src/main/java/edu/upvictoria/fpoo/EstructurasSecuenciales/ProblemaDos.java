package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDos {

    public double promedio(double suma){
        return suma/4;
    }

    public ProblemaDos() throws IOException {

        System.out.println("Problema 2");
        System.out.println("Promedio Exámenes");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String a;
        double suma = 0;

        for(int i = 1; i <= 4; i++){
            System.out.print("Ingrese el número " + i + ": ");
            suma = suma + Double.parseDouble(leer.readLine());
        }

        System.out.println("El promedio es: " + promedio(suma));
    }

}
