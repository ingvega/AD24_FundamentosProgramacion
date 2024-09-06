/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T1OmegaUp;

import java.util.Scanner;

/**
 *NOTA: se hizo una modificación para que este
 * ejercicio solo trabaje con 5 calificaciones
 * @author paveg
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int c1 = lector.nextInt();
        int c2 = lector.nextInt();
        int c3 = lector.nextInt();
        int c4 = lector.nextInt();
        int c5 = lector.nextInt();
        int aprobados = 0;
        double suma, promedio, optimista, pesimista;
        suma = c1 + c2 + c3 + c4 + c5;
        promedio = suma / 5;
        //Obtenerlos con funcion
        optimista = Math.ceil(promedio);
        pesimista = Math.floor(promedio);
        //Obtenerlos sin función
        //Quita los decimales y así obtiene el pesimista
        int pesimistaEntero = (int) promedio;
        //Obtiene la parte decimal del promedio
        //Ejemplo si promedio=98.56
        //decimal quedaría con 0.56
        double decimal = promedio - pesimistaEntero;
        if (decimal > 0) {
            optimista = pesimistaEntero + 1;
        }
        
        //Contar las aprobatorias y apartir de estas obtener las reprobatorias
        if(c1>=70){
            aprobados=aprobados+1;
        }
        if(c2>=70){
            aprobados=aprobados+1;
        }
        if(c3>=70){
            aprobados=aprobados+1;
        }
        if(c4>=70){
            aprobados=aprobados+1;
        }
        if(c5>=70){
            aprobados=aprobados+1;
        }
        
        int reprobados=5-aprobados;
        double porcentajeAprobados=1.0*aprobados/5*100;
        System.out.printf("Promedio optimista: %.0f\n" +
                                     "Promedio pesimista: %.0f\n" +
                                     "Aprobados: %d\n" +
                                     "Reprobados: %d\n" +
                                     "%.0f%% de aprobados",
                                    optimista, pesimista,
                                    aprobados,reprobados,
                                    porcentajeAprobados+"\n");
        

    }

}
