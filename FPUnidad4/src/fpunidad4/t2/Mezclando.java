/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fpunidad4.t2;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Mezclando {

    public static void main(String[] args) {
        Scanner lector=  new Scanner(System.in);
        //Leer el primer arreglo
        int a[] = new int[lector.nextInt()];
        for (int i = 0; i < a.length; ++i) {
            a[i] = lector.nextInt();
        }
        //Leer segundo arreglo
        int longB=lector.nextInt();
        int b[] = new int[longB];
        for (int i = 0; i < b.length; ++i) {
            b[i] = lector.nextInt();
        }
        
        //Crear arreglo que contendrá elementos mezclados
        int c[]=new int[a.length+b.length];
        lector.nextLine();
        String formaA = lector.nextLine();
        String formaB = lector.nextLine();
        /*Manejar posición de inicio del arreglo A, 
        así como el incremento o decremento de ajuste de la posición
        negativo si se cuando se inicia a recorrer del final
        o positivo si comienza del principio
        */
        int inicialA=0,ajusteA=1;
        
        if(formaA.equals("fin")){
            inicialA=a.length-1;
            ajusteA=-1;
        }
        
        //Obtener cual es la longitud del arreglo más pequeño
        int minimo=Math.min(a.length, b.length);
        
        //Mezcla el arreglo A, recorriendolo máximo el mismo número de
        //elementos que tiene el arreglo más pequeño
        for (int i = 0; i < c.length && 
                           (a.length!=minimo || (inicialA<minimo && inicialA>-1)); i+=2) {
            c[i]=a[inicialA];
            inicialA+=ajusteA;
        }
        /*Manejar posición de inicio del arreglo B, 
        así como el incremento o decremento de ajuste de la posición
        negativo si se cuando se inicia a recorrer del final
        o positivo si comienza del principio
        */
        int inicialB=0,ajusteB=1;
        if(formaB.equals("fin")){
            inicialB=b.length-1;
            ajusteB=-1;
        }
        //Mezcla el arreglo B, recorriendolo máximo el mismo número de
        //elementos que tiene el arreglo más pequeño
        for (int i = 1; i < c.length && 
                            (b.length!=minimo || (inicialB<minimo && inicialB>-1)); i+=2) {
            c[i]=b[inicialB];
            inicialB+=ajusteB;
        }
        
        /*En caso de que el arreglo A sea más grande que B,
        aún nos falta recorrer algunos elementos de A y se colocan 
        de manera consecutiva al final del arreglo c
        */
        if(a.length>b.length){
            inicialA-=ajusteA;
            for (int i = minimo*2-1; i < c.length; i++) {
                c[i]=a[inicialA];
                inicialA+=ajusteA;
            }
        }
        else if(b.length>a.length){
            /*En caso de que el arreglo B sea más grande que A,
        aún nos falta recorrer algunos elementos de A y se colocan 
        de manera consecutiva al final del arreglo c
        */
            inicialB-=ajusteB;
            //Comienza a llenar el arreglo c donde se quedó 
            //que es 2 veces el tamaño mínimo
            for (int i = minimo*2-1; i < c.length; i++) {
                c[i]=b[inicialB];
                inicialB+=ajusteB;
            }
        }
        //Imprime el arreglo c
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
