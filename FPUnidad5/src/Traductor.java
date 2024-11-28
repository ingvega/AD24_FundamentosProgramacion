/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] numeros={"cero","uno","dos","tres","cuatro","cinco","seis",
            "siete","ocho","nueve"};
        
        int n=3674;
        String numero=n+"";
        for (int i = 0; i < numero.length(); i++) {
            int digito=numero.charAt(i)-'0'; //48 49 50 51
            System.out.print(numeros[digito] +" ");
            //int digito=numero.charAt(i)-48; //48 49 50 51
//            char digito=numero.charAt(i);
//            switch (digito) {
//                case '0':
//                    System.out.print("cero ");
//                    break;
//                case '1':
//                    System.out.print("uno ");
//                    break;
//                case '2':
//                    System.out.print("dos ");
//                    break;
//                case '3':
//                    System.out.print("tres ");
//                    break;
//                case '4':
//                    System.out.print("cuatro ");
//                    break;
//                case '5':
//                    System.out.print("cinco ");
//                    break;
//                case '6':
//                    System.out.print("seis ");
//                    break;
//                case '7':
//                    System.out.print("siete ");
//                    break;
//                case '8':
//                    System.out.print("ocho ");
//                    break;
//                case '9':
//                    System.out.print("nueve ");
//                    break;
//            }
            
        }
    }
    
}
