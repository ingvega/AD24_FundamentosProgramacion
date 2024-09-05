/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T1OmegaUp;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class FormulaGigante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double x, y, z, numerador, denominador;
        x = lector.nextDouble();
        y = lector.nextDouble();
        z = lector.nextDouble();
        //numerador=((2*x+y)/z)*(y*y*y-z);
        numerador = ((2 * x + y) / z) * (Math.pow(y, 3) - z);
        denominador = (x + 2 * y + 3 * z) / (z - 2 * y - 3 * x)
                + x * x + z * z;
        System.out.println(
                numerador / denominador);

//        double r=(((2*x+y)/z)*(Math.pow(y,3)-z))/
//        ((x+2*y+3*z)/(z-2*y-3*x)+
//                x*x+z*z);
    }

}
