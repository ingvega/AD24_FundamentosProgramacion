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
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
//        int raiz=(int)Math.sqrt(n);
//        int cuadrado=raiz*raiz;
//        if(n==cuadrado){
//            System.out.println("SI "+raiz);
//        }else{
//            System.out.println("NO");
//        }
        double raiz=Math.sqrt(n);
        //double parteDecimal=raiz%1;
        double parteDecimal=raiz-(int)raiz;
        
        if(parteDecimal==0){
            System.out.println("SI "+raiz);
        }else{
            System.out.println("NO");
        }
    }
    
}
