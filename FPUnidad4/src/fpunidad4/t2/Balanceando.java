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
public class Balanceando {
    //Sin arreglos
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int f=lector.nextInt();
        int c=lector.nextInt();
        int n=lector.nextInt();
        int y;
        int m1=0,m2=0;
        for (int i = 0; i < n; i++) {
            lector.nextInt();
            y=lector.nextInt();
            if(y<c/2)
                m1++;
            else
                m2++;
        }
        if(Math.abs(m1-m2)<=1){
            System.out.println("EQUITATIVO");
        }else{
            System.out.println("NO EQUITATIVO " + m1 +  " " + m2);
        }
    }

//    public static void main(String[] args) {
//        Scanner lector=new Scanner(System.in);
//        int f=lector.nextInt();
//        int c=lector.nextInt();
//        int n=lector.nextInt();
//        int x,y;
//        int[][] salon=new int[f][c];
//        int m1=0,m2=0;
//        for (int i = 0; i < n; i++) {
//            x=lector.nextInt();
//            y=lector.nextInt();
//            salon[x][y]=1;
//        }
//        for (int i = 0; i < f; i++) {
//            for (int j = 0; j < c/2; j++) {
//                m1+=salon[i][j];
//            }
//        }
//        for (int i = 0; i < f; i++) {
//            for (int j = c/2; j < c; j++) {
//                m2+=salon[i][j];
//            }
//        }
//        if(Math.abs(m1-m2)==0 || Math.abs(m1-m2)==1){
//            System.out.println("EQUITATIVO");
//        }else{
//            System.out.println("NO EQUITATIVO " + m1 +  " " + m2);
//        }
//    }
}
