/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpunidad5;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Cajero {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int total=lector.nextInt(), pagado=lector.nextInt(),cambio;
        //679       2000    1321
        cambio=pagado-total;
        Cajero objeto=new Cajero();
        int resultado[];
        resultado=objeto.obtenerUnidadesMonetarias(cambio,1000);
        //[0]-> 0 
        //[1]-> 679 
        System.out.print(resultado[0]+" ");
        resultado=objeto.obtenerUnidadesMonetarias(resultado[1],500);
        System.out.print(resultado[0]+" ");
        resultado=objeto.obtenerUnidadesMonetarias(resultado[1],200);
        System.out.print(resultado[0]+" ");
        resultado=objeto.obtenerUnidadesMonetarias(resultado[1],100);
        System.out.print(resultado[0]+" ");
        resultado=objeto.obtenerUnidadesMonetarias(resultado[1],50);
        System.out.print(resultado[0]+" ");
        resultado=objeto.obtenerUnidadesMonetarias(resultado[1],20);
        System.out.print(resultado[0]+" ");
        resultado=objeto.obtenerUnidadesMonetarias(resultado[1],10);
        System.out.print(resultado[0]+" ");
        resultado=objeto.obtenerUnidadesMonetarias(resultado[1],5);
        System.out.print(resultado[0]+" ");
        resultado=objeto.obtenerUnidadesMonetarias(resultado[1],2);
        System.out.print(resultado[0]+" ");
        System.out.print(resultado[1]);
    }
    
    int[] obtenerUnidadesMonetarias(int total,int denominacion){
        total=1000;
        int unidades=total/denominacion;
        int sobra=total%denominacion;
        int[] resultado={unidades,sobra};
        return resultado;
    }
            
}
//public class Cajero {
//    public static void main(String[] args) {
//        Scanner lector=new Scanner(System.in);
//        int total=lector.nextInt(), pagado=lector.nextInt(),cambio;
//        //679       2000    1321
//        cambio=pagado-total;
//        Cajero objeto=new Cajero();
//        
//        int mil=objeto.obtenerUnidadesMonetarias(cambio,1000);
//        cambio=cambio-mil*1000;
//        int quinientos=objeto.obtenerUnidadesMonetarias(cambio,500);
//        cambio=cambio-quinientos*500;
//        int doscientos=objeto.obtenerUnidadesMonetarias(cambio,200);
//        
//        System.out.println(mil + " " + quinientos + "...");
//                
//        
//    }
//    
//    int obtenerUnidadesMonetarias(int total,int denominacion){
//        int unidades=total/denominacion;
//        return unidades;
//    }
//            
//}
