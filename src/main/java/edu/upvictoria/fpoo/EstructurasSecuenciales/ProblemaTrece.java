package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaTrece {

    public double pesoADolar( double pesos){
        return 01 / pesos;
    }
    public ProblemaTrece() throws IOException {
        System.out.println("Problema 13");
        System.out.println("Empresa Importadora");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double pesos;

        System.out.print("Ingrese la cantidad de pesos mexicanos:");
        pesos = Math.abs(Double.parseDouble(leer.readLine()));

        System.out.print("\n1 Dolar = : 17.6 MXN\n");

        System.out.print("Se pueden adquirir: $ " + pesoADolar(pesos) + " dólares");
    }

}
