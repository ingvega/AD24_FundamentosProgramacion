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
public class Mezclando2 {

    public static void main(String[] args) {
        Scanner lector=  new Scanner(System.in);
        int a[] = new int[lector.nextInt()];
        for (int i = 0; i < a.length; ++i) {
            a[i] = lector.nextInt();
        }
        int longB=lector.nextInt();
        int b[] = new int[longB];
        for (int i = 0; i < b.length; ++i) {
            b[i] = lector.nextInt();
        }
        int[] c=new int[a.length+b.length];
        lector.nextLine();
        String formaA = lector.nextLine();
        String formaB = lector.nextLine();
        /*Manejar posición de inicio del arreglo A y B, 
        así como el incremento o decremento de ajuste de la posición
        negativo si se cuando se inicia a recorrer del final
        o positivo si comienza del principio
        */
        int inicialA=0,ajusteA=1;
        if(formaA.equals("fin")){
            inicialA=a.length-1;
            ajusteA=-1;
        }
        int inicialB=0,ajusteB=1;
        if(formaB.equals("fin")){
            inicialB=b.length-1;
            ajusteB=-1;
        }
        /*
        Va llenando el arreglo c, obteniendo para cada iteración del ciclo
        el siguiente número y mezclandolo en C, se toma en cuenta 
        que es posible que cada iteración que se realiza es posible que se
        mezclen 2 elementos en C, también se toma en cuenta que es
        posible que de un arreglo ya no haya elementos a tomar
        */
        for (int i = 0; i < a.length+b.length;i++){
            //Toma el siguente elemento del arreglo A, excepto
            //que ya se hayan terminado
            if(inicialA>=0 &&inicialA<a.length){
                c[i++]=a[inicialA];
                inicialA+=ajusteA;
            }
            //Toma el siguente elemento del arreglo B, excepto
            //que ya se hayan terminado
            if(inicialB>=0 &&inicialB<b.length){
                c[i]=b[inicialB];
                inicialB+=ajusteB;
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
