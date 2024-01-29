package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ProblemaDieciseis
{
    public double cobroPinturas(double precio, double cantidad){
        return precio * cantidad;
    }
    public ProblemaDieciseis() throws IOException{
        System.out.println("Problema 16");
        System.out.println("Trabajos pintura");

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double precio, cantidad;

        System.out.print("Ingrese el precio que se cobra por m2: ");
        precio = Math.abs(Double.parseDouble(leer.readLine()));

        System.out.print("Ingrese la cantidad de m2 utilizados: ");
        cantidad = Math.abs(Double.parseDouble(leer.readLine()));

        System.out.print("Se tiene que pagar $ " + cobroPinturas(precio, cantidad) + " por " + cantidad + " metros2");
    }

}
