/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpunidad3;

/**
 *
 * @author paveg
 */
public class Division {
    public static void main(String[] args) {
        int dulces=50;
        int personas=10;
        for(int i=1;i<=dulces;i++){
            
            if(dulces<personas){
                System.out.println(i);
                break;
            }else{
                System.out.println(i);
            }
            dulces-=personas;
        }
        System.out.println(dulces);
    }
}
