/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *Ejercicios para realizar lectura, impresión 
 * @author paveg
 */
public class BEjerciciosLecturaCalculosImpresion {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        
        int h,m,s;
        lector.useDelimiter(":|\n");
        h=lector.nextInt();
        m=lector.nextInt();
        s=lector.nextInt();
        System.out.println(h+"-"+m+"-"+s);
        /*Cuando se imprime con printf se debe indicar un texto con
        caracteres de formato para el tipo de dato y luego separados por
        coma se indica cada variable a imprimir
        %d se usa para imprimir enteros
        
        %5d se usa para añadir espacios de relleno necesarios para imprimir
            un entero que ocupe 5 caracteres
        
        %03d se usa para añadir el caracteres 0 de relleno necesarios 
            para imprimir un entero que ocupe 3 caracteres
        EJEMPLOS:*/
        //Imprime la hora, minuto y segundo complementando los valores 
        //para que todos tengan 2 dígitos 
        h=5;
        m=10;
        s=0;
        System.out.printf("%02d %02d %02d",h,m,s);
        //La salida sería: 05 10 00
        //Si quisieras añadir los :, solo tienes que añadirlos en la parte 
        //del texto que quieres que aparezcan
        System.out.printf("%02d:%02d:%02d",h,m,s);
        //La salida sería: 05:10:00
                        
        //DECIMALES
        /*%f se usa para imprimir decimales, si solo lo ponemos así, el valor se imprimirá con 6 decimales
        
        %.2f se usa para indicar que queremos imprimir un número decimal con 2 posiciones
        después del punto, debes considerar que si colocas valores con más decimales, el valor
        se redondeará para obtener solo los decimales que indiques
        
        %.0f se usa para indicar que queremos imprimir un número decimal con 0 posiciones
        decimales, debes considerar que si colocas valores decimales, se redondearán
        pudiendo causar que también el entero próximo se redondee*/
        //EJEMPLOS
        double x=2.38;
        float y=2.64f; //La f nos ayuda a indicar que el valor se tome como float y 
                              //no como double (de lo contrario marca error)
        System.out.printf("x=%.1f y=%.0f",x,y);        
    }
}
