/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp24_4;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class ReyGnomoSinArrreglos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        for (int j = 0; j < n; j++) {
            //Leer el tamaño del grupo y los gnomos
            int gnomos = lector.nextInt();
            //Revisar quien es el primer gnomo
            int gnomoActual = lector.nextInt();
            for (int i = 1; i < gnomos; i++) {
                if (lector.nextInt() != gnomoActual + i) {
                    System.out.println(i + 1);
                    for (; i < gnomos-1; i++) {
                    //for (int k = i+1; k < gnomos; k++) {
                        lector.nextInt();
                    }
                    //break;
                }
            }
        }
    }
}
