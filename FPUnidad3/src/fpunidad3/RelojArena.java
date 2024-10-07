/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpunidad3;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class RelojArena {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        //Líneas iniciales del reloj de arena
        //int i=1;
        int ceros=0;
        int numeros=n;
        for (int i=1; i <=n/2+1; i++) {
            //Imprimir ceros izq
            for(int j=1;j<=ceros;j++){
                System.out.print("0");
            }
            //Imprimir números
            for(int j=1;j<=numeros;j++){
                System.out.print(i);
            }
            //Imprimir ceros der
            for(int j=1;j<=ceros;j++){
                System.out.print("0");
            }
            System.out.println("");
            ceros++;
            numeros-=2;
        }
        //System.out.println(ceros);
        ceros-=2;
        numeros=3;
        //i-=2;
        for (int i=n/2; i >= 1; i--) {
            //Imprimir ceros izq
            for(int j=1;j<=ceros;j++){
                System.out.print("0");
            }
            //Imprimir números
            for(int j=1;j<=numeros;j++){
                System.out.print(i);
            }
            //Imprimir ceros der
            for(int j=1;j<=ceros;j++){
                System.out.print("0");
            }
            System.out.println("");
            ceros--;
            numeros+=2;
        }
    }
}
