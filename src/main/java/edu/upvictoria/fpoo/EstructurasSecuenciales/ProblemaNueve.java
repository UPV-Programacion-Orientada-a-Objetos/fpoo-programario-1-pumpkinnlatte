package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaNueve {

    public double obtenerSueldo(double pxh, double horas){
        return pxh * horas;
    }
    public ProblemaNueve() throws IOException {

        System.out.println("Problema 9");
        System.out.println("Sueldo Trabajador");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double horas, pxh;

        System.out.print("Ingrese el pago por hora del empleado: ");
        pxh = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        horas = Double.parseDouble(leer.readLine());

        System.out.print("El salario a pagar es de: $ " + obtenerSueldo(pxh, horas));
    }

}
