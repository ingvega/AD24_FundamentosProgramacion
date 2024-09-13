/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nocontrol;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class AnalizandoNoControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //S24120001
        /*Hacerlo así implica que necesitamos varias cadenas de texto de entrada
        y que solamente nos interesa el primer caracter de cada palabra
        hola como estas*/
//        char cadena=lector.next().charAt(0); //obtiene h
//        char cadena2=lector.next().charAt(0); //obtiene c
//        char cadena3=lector.next().charAt(0); //obtiene e
        String noControl = lector.nextLine();
        //String carrera1=noControl.charAt(0)+"";

        char carrera = noControl.charAt(0);
        //String licenciatura="";
        String licenciatura;
//        if(carrera=='S'){
//            licenciatura="Sistemas Computacionales";
//        }else{
//            if(carrera=='s'){
//                licenciatura="Sistemas Computacionales";
//            }else{
//            
//            }
//        }
//        if (carrera == 'S') {
//            licenciatura = "Sistemas Computacionales";
//        } else if (carrera == 's') {
//            licenciatura = "Sistemas Computacionales";
//        } else if (carrera == 'A') {
//            licenciatura = "Ambiental";
//        }
        if (carrera == 'S' || carrera == 's') {
            licenciatura = "Sistemas Computacionales";
        } else if (carrera == 'A' || carrera == 'a') {
            licenciatura = "Ambiental";
        } else if (carrera == 'D' || carrera == 'd') {
            licenciatura = "Industrial";
        } else if (carrera == 'G' || carrera == 'g') {
            licenciatura = "Gestion";
        } else if (carrera == 'M' || carrera == 'm') {
            licenciatura = "Gastronomia";
        } else if (carrera == 'T' || carrera == 't') {
            licenciatura = "Automitrices";
        } else if (carrera == 'E' || carrera == 'e') {
            licenciatura = "Electronica";
        } else if (carrera == 'C' || carrera == 'c') {
            licenciatura = "Cambio";
        }else{
            licenciatura="";
        }
        System.out.println(licenciatura);
        
        String generacion;
        /*S24120001
        S98120001*/
        //int anio=noControl.charAt(1)-48 +noControl.charAt(2)-48;
        String anio=""+noControl.charAt(1)+noControl.charAt(2);
        System.out.println(anio);
        //int anioIngreso=anio;
        int anioIngreso=Integer.parseInt(anio);
    }

}
