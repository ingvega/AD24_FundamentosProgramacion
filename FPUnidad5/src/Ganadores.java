/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Ganadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena="<CÑADñAñ>";
        //cadena=cadena.replace("ñ", "");
        //quita todo lo que sean letras (no considera la ñ ni vocales con acentos)
        cadena=cadena.replaceAll("[A-Z]","");
        System.out.println(cadena);
        
        
        String[] traduccionesLetras=
        {"Alfa","Bravo","Charlie","Delta","Yankee","Zulu"};
        
        System.out.println(traduccionesLetras[cadena.charAt(0)-65]);
        System.out.println(traduccionesLetras[cadena.charAt(1)-65]);
        System.out.println(traduccionesLetras[cadena.charAt(2)-65]);
        System.out.println(traduccionesLetras[cadena.charAt(3)-65]);
        String[] traduccionesNumeros=new String[10];
//        String[] traducciones=new String[91];
//        traducciones[46]="Decimal";
//        traducciones[48]="Cero";
//        traducciones[46]="Decimal";
//        traducciones[46]="Decimal";
//        traducciones[46]="Decimal";
//        traducciones[46]="Decimal";
//        traducciones[46]="Decimal";
//        traducciones[46]="Decimal";
        
        System.out.println((int)'Z');
        System.out.println((int)'.');
		
    }
    
}
