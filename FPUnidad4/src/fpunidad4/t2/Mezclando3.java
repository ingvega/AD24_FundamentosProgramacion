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
public class Mezclando3 {

    public static void main(String[] args) {
        Scanner lector=  new Scanner(System.in);
        int a[] = new int[lector.nextInt()];
        for (int i = 0; i < a.length; ++i) {
            a[i] = lector.nextInt();
        }
        int longB=lector.nextInt();
        int b[] = new int[longB];
        for (int i = 0; i < b.length; ++i) {
            b[i] = lector.nextInt();
        }
        
        lector.nextLine();
        String formaA = lector.nextLine();
        String formaB = lector.nextLine();
        int inicialA=0,ajusteA=1;
        if(formaA.equals("fin")){
            inicialA=a.length-1;
            ajusteA=-1;
        }
        int inicialB=0,ajusteB=1;
        if(formaB.equals("fin")){
            inicialB=b.length-1;
            ajusteB=-1;
        }
        for (int i = 0; i < a.length+b.length;i++){
            if(inicialA>=0 &&inicialA<a.length){
                System.out.println(a[inicialA]);
                inicialA+=ajusteA;
            }
            if(inicialB>=0 &&inicialB<b.length){
                System.out.println(b[inicialB]);
                inicialB+=ajusteB;
            }
        }
    }
}
