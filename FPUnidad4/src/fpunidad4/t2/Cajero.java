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
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String operacion;
        int cantidad,saldo=1000;
        do{
            operacion=lector.next();
            switch (operacion) {
                case "C":
                    System.out.println("$"+saldo);
                    break;
                case "D":
                    cantidad=lector.nextInt();
                    saldo=saldo+cantidad;
                    lector.nextLine();
                    break;
                case "R":
                    cantidad=lector.nextInt();
                    saldo=saldo-cantidad;
                    lector.nextLine();
                    break;
            }
            if(operacion.equals("S")) 
                break;
        }while(true);//!operacion.equals("S"));
    }
    
}
