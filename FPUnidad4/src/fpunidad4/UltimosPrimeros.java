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
public class UltimosPrimeros {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        String[] nombres=new String[100];
        String nombre="";
        String cadena="";
        int i ;
        for (i=0; i < nombres.length; i++) {
            nombre=l.nextLine();
            if(!nombre.equals("#")){
                cadena=nombre+"\n"+cadena;
            }else{
                //i=nombres.length;
                break;
            }
        }
        
        for (i=0; i < nombres.length; i++) {
            nombre=l.nextLine();
            if(!nombre.equals("#")){
                nombres[i]=nombre;
            }else{
                //i=nombres.length;
                break;
            }
        }
        for (i = i-1; i >= 0; i--) {
            //System.out.println(i);
            //if(nombres[i]!=null)
                System.out.println(nombres[i]);
        }
    }
}
