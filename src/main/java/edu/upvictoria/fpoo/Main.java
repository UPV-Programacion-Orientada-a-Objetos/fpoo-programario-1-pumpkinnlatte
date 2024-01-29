package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import edu.upvictoria.fpoo.EstructurasSecuenciales.*;
/**
 * Hello world!
 *
 */
public class Main
{
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main( String[] args ) throws IOException
    {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String b;

        boolean salir = false;

        while (salir == false) {

            System.out.println("\n---------------- PROGRAMARIO 1 ----------------\n" );

            System.out.println("Ingrese el número de la práctica (1-25) (0) Salir\n" );
            int opc = Integer.parseInt(leer.readLine());

            try {

                switch(opc){
                    case 0:
                        salir = true;
                        break;
                    case 1:
                        ProblemaUno obj = new ProblemaUno();
                        break;
                    case 2:
                        ProblemaDos obj2 = new ProblemaDos();
                        break;
                    case 3:
                        ProblemaTres obj3 = new ProblemaTres();
                        break;
                    case 4:
                        ProblemaCuatro obj4 = new ProblemaCuatro();
                        break;
                    case 5:
                        ProblemaCinco obj5 = new ProblemaCinco();
                        break;
                    case 6:
                        ProblemaSeis obj6 = new ProblemaSeis();
                        break;
                    case 7:
                        ProblemaSiete obj7 = new ProblemaSiete();
                        break;
                    case 8:
                        ProblemaOcho obj8 = new ProblemaOcho();
                        break;
                    case 9:
                        ProblemaNueve obj9 = new ProblemaNueve();
                        break;
                    case 10:
                        ProblemaDiez obj10 = new ProblemaDiez();
                        break;
                    case 11:
                        ProblemaOnce obj11 = new ProblemaOnce();
                        break;
                    case 12:
                        ProblemaDoce obj12 = new ProblemaDoce();
                        break;
                    case 13:
                        ProblemaTrece obj13 = new ProblemaTrece();
                        break;
                    case 14:
                        ProblemaCatorce obj14 = new ProblemaCatorce();
                        break;
                    case 15:
                        ProblemaQuince obj15 = new ProblemaQuince();
                        break;
                    case 16:
                        ProblemaDieciseis obj16 = new ProblemaDieciseis();
                        break;
                    case 17:
                        ProblemaDiecisiete obj17 = new ProblemaDiecisiete();
                        break;
                    case 18:
                        ProblemaDieciocho obj18 = new ProblemaDieciocho();
                        break;
                    case 19:
                        ProblemaDiecinueve obj19 = new ProblemaDiecinueve();
                        break;
                    case 20:
                        ProblemaVeinte obj20 = new ProblemaVeinte();
                        break;
                    case 21:
                        ProblemaVeintiuno obj21 = new ProblemaVeintiuno();
                        break;
                    case 22:
                        ProblemaVeintidos obj22 = new ProblemaVeintidos();
                        break;
                    case 23:
                        ProblemaVeintitres obj23 = new ProblemaVeintitres();
                        break;
                    case 24:
                        ProblemaVeinticuatro obj24 = new ProblemaVeinticuatro();
                        break;
                    case 25:
                        ProblemaVeinticinco obj25 = new ProblemaVeinticinco();
                        break;
                    default:
                        System.out.println("Opción no válida, vuelva a intentar");
                        break;
                }

                limpiarConsola();

            } catch (IOException e) {
                System.out.println("Error en la ejecución");
            }

        }

    }
}
