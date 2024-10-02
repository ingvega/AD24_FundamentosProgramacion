/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fpunidad3;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            for (int j = n; j > i; j--) {
                System.out.print(n+1-i);
            }
            System.out.println();
        }

    }

}
