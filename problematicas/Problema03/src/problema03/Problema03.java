/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author USUARIO 2021
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 3;
        int limite = 37;
        int num = 2;
        String cadena;
cadena=String.format("%d",num);
        do {
            num = num + contador;

            contador = contador + 2;
cadena = String.format("%s %d",cadena,num);
            
        } while (num < limite);
System.out.println(cadena);
    }
}
