package matrices;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class CuadradoSemiMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        int[] cuadrado[]=new int[n][n];
        int sumaBase=0;
        //Leer la primera fila y obtener la suma base
        for (int i = 0; i < n; i++) {
            cuadrado[0][i]=lector.nextInt();
            sumaBase+=cuadrado[0][i];
        }
        //Leer el resto filas e ir obteniendo las sumas
        int suma=0;
        for (int i = 1; i < n; i++) {
            suma=0;
            for (int j = 0; j < n; j++) {
                cuadrado[i][j]=lector.nextInt();
                suma+=cuadrado[i][j];
            }
            if(suma!=sumaBase){
                System.out.println(0);
                return;
            }    
        }
        //suma por columna
        for (int i = 0; i < n; i++) {
            suma=0;
            for (int j = 0; j < n; j++) {
                suma+=cuadrado[j][i];
            }
            if(suma!=sumaBase){
                System.out.println(0);
                return;
            }    
        }
        //diagonales
        int sumaD2=0;
        suma=0;
        for (int i = 0; i < n; i++) {
            suma+=cuadrado[i][i];
            sumaD2+=cuadrado[i][n-1-i];
        }
        if(sumaBase==suma && sumaBase==sumaD2){
            System.out.println(1);
        }else{
            System.out.println(0);
    }
        
    }
    
}
