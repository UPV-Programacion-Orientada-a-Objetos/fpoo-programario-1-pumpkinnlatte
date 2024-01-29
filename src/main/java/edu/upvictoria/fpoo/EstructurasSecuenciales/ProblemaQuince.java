package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaQuince {

    public double cobroEstacionamiento(double horas, double precio){
        return Math.ceil(horas) * precio;
    }

    public ProblemaQuince() throws IOException {
        System.out.println("Problema 15");
        System.out.println("Estacionamiento");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double precio, horas;

        System.out.print("Ingrese el precio por hora de servicio: ");
        precio = Integer.parseInt(leer.readLine());

        System.out.print("Ingrese la cantidad de horas dispuestas: ");
        horas = Integer.parseInt(leer.readLine());

        System.out.print(cobroEstacionamiento(horas, precio) + " años");
    }
}
