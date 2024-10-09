/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String numero = lector.nextLine();
        char u, d, c;
        if (numero.length() == 3) {
            u = numero.charAt(2) ;
            d = numero.charAt(1) ;
            c = numero.charAt(0);
        } else if (numero.length() == 2) {
            u = numero.charAt(1);
            d = numero.charAt(0);
            c = '0';
        } else {
            u = numero.charAt(0);
            d = '0';
            c = '0';
        }

        if (u == '1' && d != '1') {
            System.out.println("Uno");
        } else if (u == '2' && d != '1') {
            System.out.println("Dos");
        } else if (u == '3' && d != '1') {
            System.out.println("Tres");
        } else if (u == '4' && d != '1') {
            System.out.println("Cuatro");
        } else if (u == '5' && d != '1') {
            System.out.println("Cinco");
        } else if (u == '6') {
            System.out.println("Seis");
        } else if (u == '7') {
            System.out.println("Siete");
        } else if (u == '8') {
            System.out.println("Ocho");
        } else if (u == '9') {
            System.out.println("Nueve");
        }

        if (d == '1') {
            if (u == '1') {
                System.out.println("Once");

            } else if (u == '2') {
                System.out.println("Doce");
            } else if (u == '3') {
                System.out.println("Trece");
            } else if (u == '4') {
                System.out.println("Catorce");
            } else if (u == '5') {
                System.out.println("Quince");
            } else {
                System.out.println("Diez");
            }
        } else if (d == '2') {
            System.out.println("Veinte");
        } else if (d == '3') {
            System.out.println("Treinta");
        } else if (d == '4') {
            System.out.println("Cuarenta");
        } else if (d == '5') {
            System.out.println("Cincuenta");
        } else if (d == '6') {
            System.out.println("Sesenta");
        } else if (d == '7') {
            System.out.println("Setenta");
        } else if (d == '8') {
            System.out.println("Ochenta");
        } else if (d == '9') {
            System.out.println("Noventa");
        }

        if (c == '1') {
            //System.out.println( u + " - " + d);
            if (d == '0' && u=='0') {
                System.out.println("Cien");
            } else {
                System.out.println("Ciento");
            }
        } else if (c == '2') {
            System.out.println("Doscientos");
        } else if (c == '3') {
            System.out.println("Trescientos");
        } else if (c == '4') {
            System.out.println("Cuatrocientos");
        } else if (c == '5') {
            System.out.println("Quinientos");
        } else if (c == '6') {
            System.out.println("Seiscientos");
        } else if (c == '7') {
            System.out.println("Setecientos");
        } else if (c == '8') {
            System.out.println("Ochocientos");
        } else if (c == '9') {
            System.out.println("Novecientos");
        }

    }

}
