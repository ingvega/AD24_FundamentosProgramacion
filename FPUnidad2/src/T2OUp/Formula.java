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
public class Formula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        Scanner lector=new Scanner(System.in);
        a=lector.nextInt();
        b=lector.nextInt();
        c=lector.nextInt();
        double resultado1=b*b-4*a*c;
        if(resultado1>=0){
            double x1=(-b+Math.sqrt(resultado1))/(2*a);
            double x2=(-b-Math.sqrt(resultado1))/(2*a);
            /*System.out.println(x1);
            System.out.println(x2);
            */
            
            System.out.printf("%.1f\n%.1f",x1,x2);
        }else{
            System.out.println("-");
        }
    }
    
}
