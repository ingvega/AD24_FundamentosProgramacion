/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T1OmegaUp;

import java.util.Scanner;

/**
 * @author paveg
 */
public class TiempoIncorrecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        lector.useDelimiter(":|\n");
        int h = lector.nextInt();
        int m = lector.nextInt();
        int s = lector.nextInt();
        int d,hCorrectas,mCorrectos,sCorrectos;
        
        //Identificar si en los segundos se pueden
        //obtener más minutos
        mCorrectos=m+s/60;
        //despues de haber obtenido los minutos
        //nos quedamos con los segundos que restan
        sCorrectos=s%60;
        
        //Identificar si en los minutos se pueden
        //obtener más horas
        hCorrectas=h+mCorrectos/60;
        //despues de haber obtenido las horas
        //nos quedamos con los minutos que restan
        mCorrectos=mCorrectos%60;
        //Obtener los días a partir de las horas
        d=hCorrectas/24;
        //despues de haber obtenido los días
        //nos quedamos con las horas que restan
        hCorrectas=hCorrectas%24;
        
        System.out.printf("%02d:%02d:%02d:%02d\n",
                d,hCorrectas,mCorrectos,sCorrectos);
        
        

    }

}
