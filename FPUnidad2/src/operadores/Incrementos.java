/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Incrementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5;
        x++;
        int y = 1;
        ++y;
        
        int z = ++x + y++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        Scanner lector=new Scanner(System.in);
        int c1,c2,c3,c4,c5,aprobatorias=0;
        c1=lector.nextInt();
        /*
        100
        100
        100
        */
        if(c1>=70){
            aprobatorias++;
            System.out.println("Aprobatorias: " + aprobatorias);
        }
        c2=lector.nextInt();
        if(c2>=70){
            System.out.println("Aprobatorias: " + aprobatorias++);
        }
        c3=lector.nextInt();
        if(c3>=70){
            System.out.println("Aprobatorias: " + ++aprobatorias);
        }
    }

}
