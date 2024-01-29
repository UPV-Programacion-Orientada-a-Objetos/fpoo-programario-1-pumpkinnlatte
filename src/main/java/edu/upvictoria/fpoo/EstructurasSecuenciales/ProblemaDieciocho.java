package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaDieciocho {

    public double precioKilometro(double precio, double km) {
        return Math.abs(precio) * Math.abs(km);
    }
    public ProblemaDieciocho() throws IOException {

        System.out.println("Problema 18");
        System.out.println("Viaje La Curva Loca");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double precio, km;

        System.out.print("Ingrese el costo de viaje por km: ");
        precio = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese el los kilometros que se recorrerán: ");
        km = Double.parseDouble(leer.readLine());

        System.out.print("El viaje costaría" + precioKilometro(precio, km) + " por " + km + " kilometros");

    }

}
