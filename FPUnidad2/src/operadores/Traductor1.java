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
public class Traductor1 {

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


        if (c == '1') {
            //System.out.print( u + " - " + d);
            if (d == '0' && u=='0') {
                System.out.print("Cien");
            } else {
                System.out.print("Ciento");
            }
        } else if (c == '2') {
            System.out.print("Doscientos");
        } else if (c == '3') {
            System.out.print("Trescientos");
        } else if (c == '4') {
            System.out.print("Cuatrocientos");
        } else if (c == '5') {
            System.out.print("Quinientos");
        } else if (c == '6') {
            System.out.print("Seiscientos");
        } else if (c == '7') {
            System.out.print("Setecientos");
        } else if (c == '8') {
            System.out.print("Ochocientos");
        } else if (c == '9') {
            System.out.print("Novecientos");
        }

        System.out.print(" ");
        
        switch (d) {
            case '1' -> {
                if (u == '1') {
                    System.out.print("Once");
                } else if (u == '2') {
                    System.out.print("Doce");
                } else if (u == '3') {
                    System.out.print("Trece");
                } else if (u == '4') {
                    System.out.print("Catorce");
                } else if (u == '5') {
                    System.out.print("Quince");
                } else {
                    System.out.print("Diez");
                }
            }
            case '2' -> System.out.print("Veinte");
            case '3' -> System.out.print("Treinta");
            case '4' -> System.out.print("Cuarenta");
            case '5' -> System.out.print("Cincuenta");
            case '6' -> System.out.print("Sesenta");
            case '7' -> System.out.print("Setenta");
            case '8' -> System.out.print("Ochenta");
            case '9' -> System.out.print("Noventa");
            
        }

        System.out.print(" ");
        
        if (u == '1' && d != '1') {
            System.out.print("Uno");
        } else if (u == '2' && d != '1') {
            System.out.print("Dos");
        } else if (u == '3' && d != '1') {
            System.out.print("Tres");
        } else if (u == '4' && d != '1') {
            System.out.print("Cuatro");
        } else if (u == '5' && d != '1') {
            System.out.print("Cinco");
        } else if (u == '6') {
            System.out.print("Seis");
        } else if (u == '7') {
            System.out.print("Siete");
        } else if (u == '8') {
            System.out.print("Ocho");
        } else if (u == '9') {
            System.out.print("Nueve");
        }
    }

}
