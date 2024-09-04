//Comentario de linea
/*
Este ejercicio es para conocer como declarar 
variables e imprimirlas
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class AMiPrimerEjercicioConJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Hola mundo!");
        //Definir binario como entero
        int binario;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa el numero binario");
        //Leer binario
        binario = lector.nextInt();
        int binarioOriginal=binario;//respaldo del valor
        int decimal = 0;
        //Obtener el primer dígito
        int digito = binario % 2;
        //decimal=decimal+digito*(int)Math.pow(2,0);
        decimal = decimal + digito;//1=2^0-> digito*1=digito
        //Obtener la versión del decimal sin el dígito
        binario = binario / 10;

        //Obtener el segundo dígito
        digito = binario % 2;
        //decimal=decimal+digito*(int)Math.pow(2,1);
        decimal = decimal + digito * 2;//2=2^1-> digito*2
        //Obtener la versión del decimal sin el dígito
        binario = binario / 10;

        //Obtener el tercer dígito
        digito = binario % 2;
        //decimal=decimal+digito*(int)Math.pow(2,2);
        decimal = decimal + digito * (2 * 2);
        //Obtener la versión del decimal sin el dígito
        binario = binario / 10;

        //Obtener el cuarto dígito
        digito = binario % 2;
        decimal=decimal+digito*(int)Math.pow(2,3);
        //decimal = decimal + digito * (2 * 2 * 2);
        //Obtener la versión del decimal sin el dígito
        binario = binario / 10;
        //Escribir "El valor binario ", binario, " es equivalente en decimal a ",decimal
        System.out.println("El valor binario " + binarioOriginal
                + " es equivalente en decimal a " + decimal);
    }

}
