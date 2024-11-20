package fpunidad5;


import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author paveg
 */
public class OperacionesArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat formateador=new DecimalFormat("0.##");
//        double x=1;
//        System.out.println(formateador.format(x));
//        x=1.2;
//        System.out.println(formateador.format(x));
//        x=1.23956;
//        System.out.println(formateador.format(x));
//        
        //1 Leer las n calificaciones de m alumnos
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de alumnos: ");
        int m = in.nextInt();
        System.out.print("Ingresa la cantidad de unidades: ");
        int n = in.nextInt();
        double[][] calificaciones = new double[m][n];
        for (int i = 0; i < m; i++) {
            System.out.print("Ingresa las " + n + "calificaciones del alumno :" + (i + 1) + " ");
            for (int j = 0; j < n; j++) {
                calificaciones[i][j] = in.nextDouble();
            }
        }
        //2 Posteriormente preguntar qué operaciones quiere realizar el usuario:
        int opcion;
        do {
            System.out.println("¿Qué operación deseas realizar?");
            System.out.println("1. PROMEDIO DEL GRUPO");
            System.out.println("2. PROMEDIO DEL GRUPO PARA UNA UNIDAD ");
            System.out.println("3. PROMEDIO DE UN ALUMNO");
            System.out.println("4. NUMERO DE ALUMNOS CON PROMEDIO ENCIMA DE CALIFICACION INDICADA");
            System.out.print("Elige una opción (1-4): ");
            opcion = in.nextInt();
            //DecimalFormat formateador=new DecimalFormat("0.00");
            switch (opcion) {
                case 1:
                    double promedio = promedioGrupo(calificaciones);
                    System.out.println("El promedio es " + formateador.format(promedio));
                    break;

            }
        } while (opcion >= 1 && opcion <= 4);
        //3 Obtener el promedio del grupo

        //4 Obtener el promedio del grupo para una unidad específica
        //5 Obtener el promedio de un alumno
        //6 Obtener el número de alumnos que obtuvieron un promedio por encima de una
        //   calificacion indicada
    }

    public static double promedioGrupo(double[][] calificaciones) {
        double sum = 0, sumGrupo = 0, promAlumno, promGrupo;
        for (int i = 0; i < calificaciones.length; i++) {
            sum=0;
            //Obtener la sumatoria de las calificaciones de un alumno
            for (int j = 0; j < calificaciones[i].length; j++) {
                if (calificaciones[i][j] < 70) {
                    sum = 0;
                    break;
                } else {
                    sum += calificaciones[i][j];
                }
            }
            //Obtener el promedio de un alumno
            promAlumno = sum / calificaciones[i].length;
            sumGrupo += promAlumno;
        }
        //y eso es la suma de las califiaciones en el mismo for para ir sumando sin repetir otro for
        //afuera hasta abajo para cuando vayas a imprimir, haces la division de la calificaion
        promGrupo = sumGrupo / calificaciones.length;

        return promGrupo;
    }

}
