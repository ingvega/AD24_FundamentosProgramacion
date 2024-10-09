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
public class Traductor2 {

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
        String traduccion="";
        if (u == '1' && d != '1') {
            traduccion="Uno" + traduccion;
        } else if (u == '2' && d != '1') {
            traduccion="Dos" + traduccion;
        } else if (u == '3' && d != '1') {
            traduccion="Tres" + traduccion;
        } else if (u == '4' && d != '1') {
            traduccion="Cuatro" + traduccion;
        } else if (u == '5' && d != '1') {
            traduccion="Cinco" + traduccion;
        } else if (u == '6') {
            traduccion="Seis" + traduccion;
        } else if (u == '7') {
            traduccion="Siete" + traduccion;
        } else if (u == '8') {
            traduccion="Ocho" + traduccion;
        } else if (u == '9') {
            traduccion="Nueve" + traduccion;
        }

        if (d == '1') {
            if (u == '1') {
                traduccion="Once" + traduccion;

            } else if (u == '2') {
                traduccion="Doce" + traduccion;
            } else if (u == '3') {
                traduccion="Trece" + traduccion;
            } else if (u == '4') {
                traduccion="Catorce" + traduccion;
            } else if (u == '5') {
                traduccion="Quince" + traduccion;
            } else {
                traduccion="Diez" + traduccion;
            }
        } else if (d == '2') {
            traduccion="Veinte" + traduccion;
        } else if (d == '3') {
            traduccion="Treinta" + traduccion;
        } else if (d == '4') {
            traduccion="Cuarenta" + traduccion;
        } else if (d == '5') {
            traduccion="Cincuenta" + traduccion;
        } else if (d == '6') {
            traduccion="Sesenta" + traduccion;
        } else if (d == '7') {
            traduccion="Setenta" + traduccion;
        } else if (d == '8') {
            traduccion="Ochenta" + traduccion;
        } else if (d == '9') {
            traduccion="Noventa" + traduccion;
        }

        if (c == '1') {
            //traduccion= u + " - " + d);
            if (d == '0' && u=='0') {
                traduccion="Cien" + traduccion;
            } else {
                traduccion="Ciento" + traduccion;
            }
        } else if (c == '2') {
            traduccion="Doscientos" + traduccion;
        } else if (c == '3') {
            traduccion="Trescientos" + traduccion;
        } else if (c == '4') {
            traduccion="Cuatrocientos" + traduccion;
        } else if (c == '5') {
            traduccion="Quinientos" + traduccion;
        } else if (c == '6') {
            traduccion="Seiscientos" + traduccion;
        } else if (c == '7') {
            traduccion="Setecientos" + traduccion;
        } else if (c == '8') {
            traduccion="Ochocientos" + traduccion;
        } else if (c == '9') {
            traduccion="Novecientos" + traduccion;
        }
        System.out.println(traduccion);
        //System.out.println(Math.abs(5-3)==Math.abs(3-5));
    }

}
