package fpunidad5;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leer 2 números
        Scanner lector=new Scanner(System.in);
        int n1=lector.nextInt(),n2=lector.nextInt(),n3=lector.nextInt();
        int resultado=sumar(n1,n2);
        //double res=restar(n1, 2.5); //error de compilacion, ningun método puede recibir un double en 
                                                    //el segundo argumento
        //double res=restar(n1,n2);
        //Solicitar al usuario qué quiere hacer (varias veces)
        //1 Suma
        //2 Resta
        //3 Mutiplicación
        //4 División
        //5 Salir
        
    }
    
    /**
     * Suma dos valores
     * @param a Primer entero a sumar
     * @param b Segundo entero a sumar
     * @return La sumatoria de a y b
     */
    public static int sumar(int a, int b) {
        int suma=a+b;
        return suma; 
    }
    
    /**
     * Permite realizar la suma de tantos valores como se indiquen como argumentos,
     * puede incovarse de muchas maneras, tales como:
     * sumar(1,2,3,4,5,6)
     * sumar()
     * int[] numeros={1,2,3,4,5,6,7,9};
     * sumar(numeros)
     * En todos los casos suma los números recibidos, en el segundo: caso sumar() 
     * devolvería cero
     * @param valores Recibe los argumentos indicados en la invocación dentro de un arreglo
     * @return Entero que representa la suma de los valores recibidos como argumento
     */
    public static int sumar(int... valores) {
        int suma=0;
        for (int i = 0; i < valores.length; i++) {
            suma+=valores[i];
        }
        return suma; 
    }
        
    public static double restar(float a, float b) {
        double resultado=a-b;
        return resultado; 
    }
    
        
    public static int multiplicar(int a, int b) {
        int resultado=a*b;
        return resultado; 
    }
    
    public static double division(int a, int b) {
        return a/b*1.0;
    }
    
}
