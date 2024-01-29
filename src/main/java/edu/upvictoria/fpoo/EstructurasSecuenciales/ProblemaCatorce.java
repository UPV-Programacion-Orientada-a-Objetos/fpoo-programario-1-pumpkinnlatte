package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
public class ProblemaCatorce {

    public int obtenerEdad(int ano) {
        Calendar fecha = Calendar.getInstance();
        return fecha.get(Calendar.YEAR) - ano;
    }

    public ProblemaCatorce() throws IOException {
        System.out.println("Problema 14");
        System.out.println("Calcular Edad");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        int ano;

        System.out.print("Ingrese el año de nacimiento: ");
        ano = Integer.parseInt(leer.readLine());

        System.out.print(obtenerEdad(ano) + " años");
    }

}
