/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author paveg
 */
public class Burbuja {
    public static void main(String[] args) {
        int datos[]={2,29,1,5,10}, respaldo;
        for (int i = 0; i <datos.length; i++) {
            for (int j = 0; j < datos.length-1; j++) {
                if(datos[j]>datos[j+1]){
                    System.out.println(datos[j]+"-"+datos[j+1]);
                    respaldo=datos[j];
                    datos[j]=datos[j+1];
                    datos[j+1]=respaldo;
                    
                }   
            }
        }
    }
}
