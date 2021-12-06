/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author USUARIO 2021
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int limite = 15;
        int numerador = 1;
        int denominador = 3;
        String signo = "";
        String cadena = "";
        String slash = "/";
        int numero1 = 10;
        int numero2 = 20;
        int numero3;
int contador = 0;
String cadena2= "1";
        do {           
            if ((denominador == 3)||(denominador == 7)||(denominador == 11)||(denominador == 15)){
                signo = "-";
            } else{           
                    signo = "+";          
            }
            cadena = String.format("%s %s%d%s%d", 
                    cadena,
                    signo,
                    numerador, 
                    slash,
                    denominador);
            denominador = denominador + 2;

        } while (denominador <= limite);

        System.out.printf("%s%s",cadena2,cadena);

    }
}
    