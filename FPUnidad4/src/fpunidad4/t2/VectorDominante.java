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
public class VectorDominante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=lector.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(lector.nextInt()>=a[i]){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
//        boolean dominante=true;
//        for (int i = 0; i < n; i++) {
//            if(lector.nextInt()>=a[i]){
//                dominante=false;
//                break;
//            }
//        }
//        //if(dominante)
//        //System.out.println((dominante?1:0));
//        if(dominante==true){
//            System.out.println(1);
//        }else{
//            System.out.println(0);
//        }
        
    }
    
}
