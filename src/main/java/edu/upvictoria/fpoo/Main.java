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
    public static void main( String[] args ) throws IOException
    {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String b;

        System.out.println("------ PROGRAMARIO 1 ------\n" );

        int opc = Integer.parseInt(leer.readLine());

        try {

            switch(opc){
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

                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;
                case 21:
                    break;
                case 22:
                    break;
                case 23:
                    break;
                case 24:
                    break;
                case 25:
                    break;
                case 26:
                    break;

            }
        } catch (IOException e) {

        }

    }
}
