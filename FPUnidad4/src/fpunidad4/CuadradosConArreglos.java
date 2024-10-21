package fpunidad4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author paveg
 */
import java.util.Scanner;

public class CuadradosConArreglos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] colores = new int[3];
        colores[0] = scanner.nextInt();
        colores[1] = scanner.nextInt();
        colores[2] = scanner.nextInt();
        int izq, der, cen;

        for (int i = 0; i < n; i++) {
            int[] nuevosColores = {1, 1, 1};
            for (int j = 0; j < 3; j++) {
                izq = (2+j)%3;
                cen = j;
                der = (1+j)%3;
                if (colores[izq] == 0 && colores[cen] == 0 && colores[der] == 0) {
                    nuevosColores[j] = 0;
                } else if (colores[izq] == 0 && colores[cen] == 1 && colores[der] == 0) {
                    nuevosColores[j] = 0;
                } else if (colores[izq] == 1 && colores[cen] == 0 && colores[der] == 0) {
                    nuevosColores[j] = 0;
                } else if (colores[izq] == 1 && colores[cen] == 1 && colores[der] == 0) {
                    nuevosColores[j] = 0;
                }   
            }
            colores = nuevosColores;
        }

        System.out.println(colores[0] + " " + colores[1] + " " + colores[2]);
    }
}

//    public static void main(String[] args) {
//        int[] colores={0,1,1};
//        int[] nuevosColores={0,1,0};
//        colores=nuevosColores;
//        colores[0]=10;
//        nuevosColores[1]=20;
//        
//        System.out.println(colores[0]);
//        System.out.println(colores[1]);
//        System.out.println(colores[2]);
//    }

