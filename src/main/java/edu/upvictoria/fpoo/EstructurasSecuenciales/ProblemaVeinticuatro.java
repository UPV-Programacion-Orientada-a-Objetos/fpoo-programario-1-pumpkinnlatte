package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeinticuatro {
    public double ahorroAnual(double sueldo) throws IOException {
        return ((sueldo * 0.15) * (4*12));
    }

    public ProblemaVeinticuatro() throws IOException {

        System.out.println("Problema 24");
        System.out.println("Ahorro Anual");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double sueldo;

        System.out.print("Ingrese el sueldo semanal: ");
        sueldo = Double.parseDouble(leer.readLine());

        System.out.print("Ahorro anual: $ " + ahorroAnual(sueldo) + " pesos mexicanos");

    }

}
