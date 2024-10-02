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
public class SeleccionPizza {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int alumnos=lector.nextInt();
        int pizza;
        int p=0,h=0,m=0;
        for(int i=1;i<=alumnos;i++){
            pizza=lector.nextInt();
            switch(pizza){
                case 1:
                    p++;
                    break;
                case 2:
                    h++;
                    break;
                case 3:
                    m++;
            }
        }
        if(p>h && p>m){
            System.out.println("peperoni");
        }else if(h>p && h>m){
                System.out.println("hawaina");
        }else{
            System.out.println("mixta");
        }
            
            
            
            
            
    }
}
