
import java.time.LocalTime;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author paveg
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Invocar método
        Scanner l = new Scanner(System.in);
//        int resultado=l.nextInt();
//        l.next();
        System.out.println();

        saludoSimple();
        saludoCompleto("Juan Perez");
        String resultado = calcularTiempo(10);
        System.out.println(resultado);
        resultado = calcularTiempo2();
        System.out.println(resultado);

    }

    static void saludoSimple() {
        String resultado = calcularTiempo2();
        if (resultado.equals("dias")) {
            resultado = "buenos " + resultado;
        } else {
            resultado = "buenas " + resultado;
        }
        System.out.println("Hola" + resultado);
    }

    static void saludoCompleto(String nombre) {
        saludoSimple();
        System.out.println(nombre);
    }

    static String calcularTiempo(int hora) {
        if (hora < 12) {
            return "dias";
        } else if (hora < 19) {
            return "tardes";
        }
        return "noches";
    }

    static String calcularTiempo2() {
        LocalTime horaActual = LocalTime.now();
        if (horaActual.getHour() < 12) {
            return "dias";
        } else if (horaActual.getHour() < 19) {
            return "tardes";
        }
        return "noches";
    }
}
