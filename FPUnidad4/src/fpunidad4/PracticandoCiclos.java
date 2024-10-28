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
public class PracticandoCiclos {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int n=l.nextInt();
        //Constantes
        final int a=l.nextInt();
        final int b=l.nextInt();
        //No se puede cambiar el valor de una constante
        //a=a+1;
        while(n<1000){
            if(n%2==0){
//                for (int i = 1; i <= a; i++) {
//                    n+=i;
//                }
                n+=(a+1)*a/2;
            }else{
//                for (int i = 1; i <= b; i++) {
//                    n+=i;
//                }
                n+=(b+1)*b/2;
            }
        }
        System.out.println(n);
    }
}
