package fpunidad4;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author paveg
 */
public class CuadradosSinArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int n1, n2, n3, izquierda, centro, derecha, n, n1f = 0, n2f = 0, n3f = 0;
        n = l.nextInt();
        n1 = l.nextInt();
        n2 = l.nextInt();
        n3 = l.nextInt();
        for (int j = 0; j < n; j++) {
            izquierda = n3;
            centro = n1;
            derecha = n2;
            if((izquierda==0 && centro==0 && derecha==1)||
                    (izquierda==0 && centro==1 && derecha==1)||
                    (izquierda==1 && centro==0 && derecha==1)||
                    (izquierda==1 && centro==1 && derecha==1)){
                n1f=1;
            }
            izquierda = n1;
            centro = n2;
            derecha = n3;
            if((izquierda==0 && centro==0 && derecha==1)||
                    (izquierda==0 && centro==1 && derecha==1)||
                    (izquierda==1 && centro==0 && derecha==1)||
                    (izquierda==1 && centro==1 && derecha==1)){
                n2f=1;
            }
            izquierda = n2;
            centro = n3;
            derecha = n1;
            if((izquierda==0 && centro==0 && derecha==1)||
                    (izquierda==0 && centro==1 && derecha==1)||
                    (izquierda==1 && centro==0 && derecha==1)||
                    (izquierda==1 && centro==1 && derecha==1)){
                n3f=1;
            }
            n1 = n1f;
            n2 = n2f;
            n3 = n3f;
            n1f = n2f = n3f = 0;
        }
        System.out.println(n1+" "+n2+" "+n3);
    }

}
