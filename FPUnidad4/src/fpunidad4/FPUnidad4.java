/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fpunidad4;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class FPUnidad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ARREGLOS (datos del mismo tipo)
        //  Unidimensionales (Vectores)
        //  Bidimensionales (Matrices)
        //  Multidimensionales
        //Definir o declarar
        int[] edades;
        //Crear
        edades=new int[5];
        //Definir y crear
        double promedios[]=new double[10];
        //Inicializar
        edades[0]=1;
        edades[1]=10;
        edades[2]=7;
        edades[3]=8;
        edades[4]=5;

        //Inicializar y crear
        String[] meses={"ENE","FEB","MAR","ABR"};
        
        //Recorrer
        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i]);
        }
        Scanner l=new Scanner(System.in);
        int n=l.nextInt();
        int mayor,menor,suma=0,edad,posMayor,posMenor;
        mayor=menor=l.nextInt();
        posMayor=posMenor=1;
        for (int i = 2; i <= n; i++) {
            edad=l.nextInt();
            if(mayor<edad){
                mayor=edad;
                posMayor=i;
            }
            if(menor>edad){
                menor=edad;
                posMenor=i;
            }
            suma+=edad;
        }
        
        System.out.printf("Menor=%d\nMayor=%d\nPromedio=%.1f\n"+
                "Alumno %d\nAlumno %d",menor,mayor,suma*1.0/n,posMenor,posMayor);
        
    }
    
}
