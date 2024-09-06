/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conversiones de tipos
        float decimal=5.6f;
        float decimal1=(float)5.6;
        double decimal2=decimal;
        
        //-128 a 127
        /*Conversiones implicitas*/
        byte enteroByte=7;
        byte enteroByte2=127;
        short enteroShort=5;
        int entero=100;
        long enteroLong=900;
        //Conversiones explícitas
        byte enteroByte3=(byte)128; //Desbordamiento
        System.out.println(enteroByte3);
        int entero1=2000000000;
        short enteroShort1=(short)2000000000;
        long enteroLong2= 3000000000L;
        char letraMayus='A';
        char letraMinus='a';
        char numero='1';
        if(numero==1){
            System.out.println("Iguales");
        }
        if(numero==49){
            System.out.println("Iguales");
        }
        Scanner lector=new Scanner(System.in);
        //Leer un char
        char valor=lector.next().charAt(0);
        
        int letraEntero=valor+1;
        //valor=letraEntero;
        valor=(char)letraEntero;
        System.out.println(valor);
        
        letraEntero=valor-1;
        //valor=letraEntero;
        valor=(char)letraEntero;
        System.out.println(valor);
    }
}
