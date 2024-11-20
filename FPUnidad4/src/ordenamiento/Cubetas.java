/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Cubetas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        System.out.println("Indica la cantidad de datos a ordenar");
        int n=lector.nextInt(), 
                datos[]=new int[n],
                datosOrdenados[]=new int[n];
        System.out.println("Indica cual es el valor máximo que "
                + "pueden tener los datos");
        int maximo=lector.nextInt();
        int cubetas[]=new int[maximo+1];
        for (int i = 0; i < n; i++) {
            datos[i]=lector.nextInt();
            cubetas[datos[i]]++;
        }
        int pos=0;
        for (int i = 0; i < cubetas.length; i++) {
            for (int j = 0; j < cubetas[i]; j++) {
                //System.out.println(i);
                datosOrdenados[pos++]=i;
                //pos++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(datos[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(datosOrdenados[i]+" ");
        }
        int num;
        for (int i = 0; i < n; i++) {
            num=datos[i];
            System.out.print(num);
            if(datosOrdenados[i]==num){
                System.out.println(" 0");
            }else if(datosOrdenados[i]>num){
                //Desplazar a la izquierda
                for (int j = i; j >= 0; j--) {
                    if(datosOrdenados[j]==num){
                        System.out.println(" "+(i-j)+"I");
                        break;
                    }
                }
            //9 8 7 6 5
            //5 6 7 8 9
            }else{
                //Desplazar a la derecha
                for (int j = i; j < n; j++) {
                    if(datosOrdenados[j]==num){
                        System.out.println(" "+(j-i)+"D");
                        break;
                    }
                }
            }
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        
        
    }
    
}
