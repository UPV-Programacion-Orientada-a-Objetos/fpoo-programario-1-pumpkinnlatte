package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaDiez {

    public double metrosAPulgadas(double metros){
        return metros / 0.0254;
    }

    public ProblemaDiez() throws IOException {

        System.out.println("Problema 10");
        System.out.println("Modista");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double medida;

        System.out.print("Ingrese la medida del pedido en metros: ");
        medida = Double.parseDouble(leer.readLine());

        System.out.print("La medida del pedido en pulgadas es de " + metrosAPulgadas(medida) + " pulgadas");

    }

}
