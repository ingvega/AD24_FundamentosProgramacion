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
public class ElementosOpuestos {

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=lector.nextInt();
        }
        for (int i = 0; i < n/2; i++) {
            System.out.print(a[i]+a[n-i-1]+" ");
        }
    }
    
}

