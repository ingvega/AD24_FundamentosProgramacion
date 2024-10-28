/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpunidad4;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class ModificandoArreglo {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int n=l.nextInt();
        int m=l.nextInt();
        int[] arreglo=new int[n];
        int x;
        for (int i = 1; i <= m; i++) {
            x=l.nextInt();
            arreglo[x]++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arreglo[i]);
        }
        
    }
}
