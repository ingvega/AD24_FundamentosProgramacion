/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T2OUp;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Redondeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double total = lector.nextDouble();
        double pesos = (int) total;
        double centavos = total % 1;
        System.out.println(Math.PI);
        if (total < 0.5) {
            System.out.println("0.5");
        } else {
            if (centavos < 0.5) {
                System.out.printf("%.1f", pesos);
            } else {
                if (centavos < 0.8) {
                    //pesos=pesos+0.5;
                    pesos += 0.5;
                    System.out.printf("%.1f", pesos);
                } else {
                    pesos += 1;
                    System.out.printf("%.1f", pesos);
                }
            }
        }
    }

}
