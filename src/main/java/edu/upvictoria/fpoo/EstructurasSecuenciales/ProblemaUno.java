package edu.upvictoria.fpoo.EstructurasSecuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaUno {
	public int sumar (int a, int b) {
		return a + b;
	}

	public double sumar (double a, double b) {
		return a + b;
	}

	public ProblemaUno() throws IOException {
		System.out.println("Problema 1");
		System.out.println("Sumar dos numeros");

		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		String a, b;

		System.out.print("Ingrese el primer número: ");
		a = leer.readLine();

		System.out.print("Ingrese el segundo número: ");
		b = leer.readLine();

		System.out.print("El resultado es: ");

		try
		{
			System.out.println(sumar(Integer.parseInt(a), Integer.parseInt(b)));
		}
		catch (NumberFormatException e)
		{
			System.out.println(sumar(Double.parseDouble(a), Double.parseDouble(b)));

		}

	}

}