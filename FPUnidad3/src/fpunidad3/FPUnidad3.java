/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fpunidad3;

/**
 *
 * @author paveg
 */
public class FPUnidad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Normalmente se usa cuando sabemos cuantas veces queremos hacer algo
//        int numero=5;
//        for(int i=1;i<=10;i++){
//            System.out.println(numero+"x"+i+"="+numero*i);
//        }
//        while(){
//        }
//        do{
//        }while();
        //int i=0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        int i=1;
        while(i<=100){
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
        
        for (i = 100; i >= 5; i -= 5) {
            System.out.println(i);
        }
    }

}
