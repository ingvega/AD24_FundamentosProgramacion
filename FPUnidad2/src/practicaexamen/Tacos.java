/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamen;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Tacos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int tacosTotales = lector.nextInt();
        int tacosOrden = lector.nextInt();
        int tacosPlaton = lector.nextInt();
        int tacosCanasta = lector.nextInt();
        int tacos = 0, ordenes = 0, platones = 0, canastas = 0;
        if (tacosTotales >= tacosCanasta) {
            canastas = tacosTotales / tacosCanasta;
            tacosTotales = tacosTotales % tacosCanasta;
        }
        if (tacosTotales > 0) {
            if (tacosTotales >= tacosPlaton) {
                platones = tacosTotales / tacosPlaton;
                tacosTotales = tacosTotales % tacosPlaton;
            }
            if (tacosTotales > 0) {
                if (tacosTotales >= tacosOrden) {
                    ordenes = tacosTotales / tacosOrden;
                    tacos = tacosTotales % tacosOrden;
                }
            }
        }
        int total = canastas * 1500 + platones * 250 + ordenes * 50 + tacos * 10;

        System.out.printf("%d\n%d %d %d %d", total, tacos, ordenes, platones, canastas);
//        System.out.println(total+"\n"+ tacos +" "+ordenes +" "+ platones +" "+ canastas);
//        System.out.print(total);
//        System.out.println();
//        System.out.print(tacos);
//        System.out.print(" ");
//        System.out.print(ordenes);
//        System.out.print(" ");

    }
//    public static void main(String[] args) {
//        Scanner lector=new Scanner(System.in);
//        int tacosTotales=lector.nextInt();
//        int tacosOrden=lector.nextInt();
//        int tacosPlaton=lector.nextInt();
//        int tacosCanasta=lector.nextInt();
//        int tacos=0,ordenes=0,platones=0,canastas=0;
//        canastas=tacosTotales/tacosCanasta;
//        tacosTotales=tacosTotales%tacosCanasta;
//        //tacosTotales%=tacosCanasta;
//        platones=tacosTotales/tacosPlaton;
//        tacosTotales=tacosTotales%tacosPlaton;
//        
//        ordenes=tacosTotales/tacosOrden;
//        tacos=tacosTotales%tacosOrden;
//        
//        int total=canastas*1500+platones*250+ordenes*50+tacos*10;
//        
//        System.out.printf("%d\n%d %d %d %d",total,tacos,ordenes,platones,canastas);
////        System.out.println(total+"\n"+ tacos +" "+ordenes +" "+ platones +" "+ canastas);
////        System.out.print(total);
////        System.out.println();
////        System.out.print(tacos);
////        System.out.print(" ");
////        System.out.print(ordenes);
////        System.out.print(" ");
//        
//    }
}
