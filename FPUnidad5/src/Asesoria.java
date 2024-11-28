/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Asesoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 5;
        System.out.println(encuentraMaximo(n1, n2));

        double descuento = obtenerDescuento(85, 79, 0, 100, 80, 95, 71, 82);
        double califs[] = {85, 79, 0, 100, 80, 95, 71, 82};
        double x[] = new double[20];
//        double descuento2=obtenerDescuento(califs);
//        double descuento3=obtenerDescuento();
    }

//    public static tiposalida metodo(tipoDatoParam1 param1, tipoDatoParam2 param2){
//    }
    public static double obtenerDescuento(double... calificaciones) {
//        85 a 89 -> 40
//        90 a 94 -> 50
//        95 a 100 -> 80
//85,79,0,100,80,95,71,82
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] > 0) {
                suma += calificaciones[i];
            } else {
                return 0;
            }

        }
        double promedio = suma / calificaciones.length;
        if (promedio < 85) {
            return 0;
        } else if (promedio < 90) {
            return 40;
        } else if (promedio < 95) {
            return 50;
        }

        return 80;

    }

}

public static double encuentraMaximo(double valor1, double valor2) {
        if (valor1 > valor2) {
            return valor1;
        }
        
        return valor2;
        
//        if(valor1>valor2)
//            return valor1;
//        else
//            return valor2;
    }

}
