package fpunidad5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class MetodoEstatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto="un texto de ejemplo";
        char c='o';
        //Scanner l=new Scanner(System.in);
        //System.out.println(Caracteres.buscar(c, texto));
        Caracteres objeto=new Caracteres();
        System.out.println(objeto.buscar(c, texto));
        System.out.println((int)'a');
        System.out.println((int)'z');
    }
    
}
