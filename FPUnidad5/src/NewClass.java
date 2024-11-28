/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class NewClass {
    public static void modificar(int numero){
        numero=numero+1;
    }
    public static void modificar(String cadena){
        cadena=cadena+"a";
    }
    public static void modificar(int[] valores){
        valores=new int[2];
        for (int i = 0; i < valores.length; i++) {
            valores[i]++;
        }
    }
    public static void main(String[] args) {
        int numero=5;
        modificar(numero);
        System.out.println(numero); //5
        String cadena="Hola";
        modificar(cadena);
        System.out.println(cadena);//Hola
        int numeros[]={1,2,3,4};
        modificar(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]); //1 2 3 4
        }
        
//        int n1,n2;
//        pares(n1,n2,3);
//        pares(1,2)
        /*int[] arreglo={1,2,3,4,5};
        int[] arreglo2=new int[]{1,2,3,4,5};
        int[] arreglo3=new int[5];
        arreglo[0]=1;
        arreglo[1]=2;
        arreglo[2]=3;
        arreglo[3]=4;
        arreglo[4]=5;
        
        int[][] matriz=new int[3][3];
        matriz[0][0]=3;
        matriz[1][1]=3;
        matriz[2][2]=3;
        
        int[][] matriz=new int[3][3];
        for (int i = 0; i < 3; i++) {
            matriz[i][i]=3;
        }

        int[][] matriz=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][i]=3;
                //matriz[i][j]=3;
            }
        }
        
        int[][] matriz={
            {3,0,0},
            {0,3,0},
            {0,0,3}
        };
        */
        NewClass objeto=new NewClass();
        objeto.imprimir();

    }
    
    public static int pares(int param1, int param2){
        return 0;
    }
    void imprimir(){
        
    }




    
}
