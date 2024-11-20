package fpunidad5;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Caracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String cadena=lector.nextLine(), operacion="";
        Caracteres objeto=new Caracteres();
        
        do{
            operacion=lector.next();
            switch (operacion) {
                case "B":
                    String caracter=lector.next();
                    //Buscar caracter
                    int conteo=objeto.buscar(caracter.charAt(0),cadena);
                    System.out.println(conteo);
                    break;
                case "O":
                    //Ordenar la cadena e imiprimirla
                    cadena=objeto.ordenar(cadena);
                    System.out.println(cadena);
                    break;
                case "I":
                    //Ordenar la cadena e imiprimirla invertida
                    String cadenaOrdenada=objeto.ordenar(cadena);
                    System.out.println(objeto.invertir(cadenaOrdenada));
                    break;
                case "C":
                    String otraCadena=lector.next();
                    //concatenar
                    cadena+=otraCadena;
                    System.out.println(cadena);
                    break;
            }
        //}while(operacion.equals("T")==false);
        }while(!operacion.equals("T"));
    }

    public int buscar(char caracter, String enCadena){
        int contador=0;
        for (int i = 0; i < enCadena.length(); i++) {
            if(enCadena.charAt(i)==caracter)
                contador++;
        }
        return contador;
    }
    
    public String ordenar(String cadena){
        int contador=0;
        int[] cubetas=new int[123];
        for (int i = 0; i < cadena.length(); i++) {
            cubetas[(int)cadena.charAt(i)]++;
        }
        cadena="";
        for (int i = 97; i < 123; i++) {
            for (int j = 0; j < cubetas[i]; j++) {
                cadena+=(char)i;
            }
        }
        return cadena;
    }
    
    public String invertir(String cadena){
        String invertida="";
        
        for (int i = cadena.length()-1; i >=0; i--) {
            invertida+=cadena.charAt(i);
        }
        return cadena;
    }
    
}
