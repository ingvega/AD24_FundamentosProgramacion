/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Prueba {

    public static void main(String[] args) {

        int a1 = 2022;
        int m1 = 9;
        int d1 = 1;
        int a2 = 2000;
        int m2 = 10;
        int d2 = 24;
        int r = a1 - a2;
        //     false           true                true
        //     true           false                true
        if (m2 > m1) {
            r--; //El mes de cumpleaños no ha llegado
        } else {
            if (m1 == m2) {
                //Estamos en el mes de cumpleaños
                if (d2 > d1) {
                    r--;//El día de cumpleaños no ha llegado
                }
            }
        }

        System.out.println(r);

        int a = 10;
        int b = 5;
        int c = 2;
        int resultado;
        resultado = a + b * c;
        System.out.println(resultado);
        resultado += (a + b) * c;
        System.out.println(resultado);
        resultado = a / b - c;
        System.out.println(resultado);
        boolean logico = (a > b) && (b < c);
        System.out.println(logico);
        logico = (a + b) > (c * b) || (a - c) < b;
        System.out.println(logico);

    }
}
