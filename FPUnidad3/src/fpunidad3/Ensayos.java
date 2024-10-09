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
public class Ensayos {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        String texto=l.nextLine();
        boolean cambiarAMayuscula=true;
        texto=texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char c=texto.charAt(i);
            
            if(c=='.' || c=='?' || c=='!'){
                cambiarAMayuscula=true;
                System.out.print(c);
            }else if(Character.isLetter(c)){ 
                if(cambiarAMayuscula==true){
                    c=Character.toUpperCase(c); //Convirtiendo a mayúscula
                }
                System.out.print(c);
                cambiarAMayuscula=false;
            }else{
                System.out.print(c);
            }
            
        }
//    public static void main(String[] args) {
//        Scanner l=new Scanner(System.in);
//        String texto=l.nextLine();
//        boolean cambiarAMayuscula=true;
//        for (int i = 0; i < texto.length(); i++) {
//            char c=texto.charAt(i);
//            if(c=='.' || c=='?' || c=='!'){
//                cambiarAMayuscula=true;
//                System.out.print(c);
//            }else if(c>=65 && c<=90){ //Mayuscula
//                if(cambiarAMayuscula==false){
//                    c+=32; //Convirtiendo a minúscula
//                }
//                System.out.print(c);
//                cambiarAMayuscula=false;
//            }else if(c>=97 && c<=122){ //Minusculas
//                if(cambiarAMayuscula==true){
//                    c-=32; //Convirtiendo a mayúscula
//                }
//                System.out.print(c);
//                cambiarAMayuscula=false;
//            }else{
//                System.out.print(c);
//            }
//            
//        }
    }
}
