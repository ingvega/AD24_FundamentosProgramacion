/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fpunidad4.t2;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Display {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][][] display={
            {
                {1,1,1},
                {1,0,1},
                {1,0,1},
                {1,0,1},
                {1,1,1}
            },{
                {1},
                {1},
                {1},
                {1},
                {1}
            },{
                {1,1,1},
                {0,0,1},
                {1,1,1},
                {1,0,0},
                {1,1,1}
            },{
                {1,1,1},
                {0,0,1},
                {1,1,1},
                {0,0,1},
                {1,1,1}
            },{
                {1,0,1},
                {1,0,1},
                {1,1,1},
                {0,0,1},
                {0,0,1}
            },{
                {1,1,1},
                {1,0,0},
                {1,1,1},
                {0,0,1},
                {1,1,1}
            },{
                {1,1,1},
                {1,0,0},
                {1,1,1},
                {1,0,1},
                {1,1,1}
            },{
                {1,1,1},
                {0,0,1},
                {1,1,1},
                {0,0,1},
                {0,0,1}
            },{
                {1,1,1},
                {1,0,1},
                {1,1,1},
                {1,0,1},
                {1,1,1}
            },{
                {1,1,1},
                {1,0,1},
                {1,1,1},
                {0,0,1},
                {1,1,1}
            }
        };
        Scanner lector=new Scanner(System.in);
        String numero=lector.next();
        String caracter=lector.next();
        int n;
        for (int fila = 0; fila < 5; fila++) {
            for (int i = 0; i < numero.length(); i++) {
                n=numero.charAt(i)-48;
                for (int columna = 0; columna < display[n][fila].length; columna++) {
                    if(display[n][fila][columna]==1)
                        System.out.print(caracter);
                    else
                        System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}
