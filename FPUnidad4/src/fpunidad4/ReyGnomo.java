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
public class ReyGnomo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        for (int j = 0; j < n; j++) {

            //Leer el tamaño del grupo y los gnomos
            int gnomos = lector.nextInt();
            int grupo[] = new int[gnomos];
            for (int i = 0; i < gnomos; i++) {
                grupo[i] = lector.nextInt();
            }
            //Revisar quien es el primer gnomo
            int gnomoActual = grupo[0];
            for (int i = 1; i < gnomos; i++) {
                if (grupo[i] != gnomoActual + i) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
