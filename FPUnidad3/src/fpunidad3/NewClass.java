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
public class NewClass {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        int lineas=3;
        for (int i = 1; i <=n; i++) {
            //Líneas en ascenso
            for (int j = 1; j <=lineas/2+1; j++) {
                for(int k=1;k<=j;k++){
                    System.out.print("x");
                }
                System.out.println("");
            }
            
            //Líneas en descenso
            for (int j = 1; j <=lineas/2; j++) {
                for(int k=j;k>=1;k--){
                    System.out.print("x");
                }
                System.out.println("");
            }
            lineas+=2;
        }
        
    }
}
