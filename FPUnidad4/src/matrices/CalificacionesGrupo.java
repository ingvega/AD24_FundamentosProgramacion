/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class CalificacionesGrupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int[] calificaciones[];
        System.out.println("Ingresa la cantidad de alumnos del grupo");
        int numAlumnos=l.nextInt();
        System.out.println("Ingresa la cantidad unidades de la materia");
        int numUnidades=l.nextInt();
        
        calificaciones=new int[numAlumnos][numUnidades];
        //Filas (Alumnos)
        for (int i = 0; i < numAlumnos; i++) {
            //Columnas (unidades)
            for (int j = 0; j < numUnidades; j++) {
                calificaciones[i][j]=l.nextInt();
            }
        }
        
        //calificaciones.length
        //Cantidad de filas del arreglo (longitud de la primera dimension)
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                if(calificaciones[i][j]<70){
                    System.out.println("Alumno " +i +1+ "Reprobado");
                    break;
                }
            }
            System.out.println("Alumno " +i +1+ "Aprobado");
        }
        
        System.out.println(calificaciones);
    }
    
}
