package fpunidad5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class MetodosString {
    public static void main(String a[]) {
        String cadena="Perez Ma. Luz";
//        String[] palabras=cadena.split(" ");
//        if(palabras.length==2){
//            System.out.println(palabras[1]+" "+palabras[0]);
//        }else if(palabras.length==3){
//            System.out.println(palabras[2]+" "+palabras[0]+" "+palabras[1]);
//        }else if(palabras.length==4){
//            System.out.println(palabras[2]+" "+palabras[3]+" "+palabras[0]+" "+palabras[1]);
//        }else{
//            System.out.println("*");
//        }
        
        int contEspacios=0,idxEspacio=0;
        cadena="un texto de ejemplo";
        while(true){
            idxEspacio=cadena.indexOf(" ",idxEspacio+1);
            //System.out.println(idxEspacio);
            if(idxEspacio!=-1)
                contEspacios++;
            else
                break;
        }
        idxEspacio=cadena.indexOf(" ");
        if(contEspacios==1){
            imprimir(idxEspacio,cadena);
        }else if(contEspacios==2 || contEspacios==3){
            idxEspacio=cadena.indexOf(" ",idxEspacio+1);
            imprimir(idxEspacio,cadena);
        }else{
            System.out.println("*");
        }

//        for (int i = 0; i < palabras.length; i++) {
//            System.out.println(palabras[i]);
//        }
    }
    
    public static void imprimir(int indice, String cadena){
            System.out.println(cadena.substring(indice+1)+" "+
                    cadena.substring(0, indice));
    }
}
