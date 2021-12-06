/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO 2021
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        int edad;
        double estatura;
        String cadenaacumulativa = "";
        String cadenaacumulativa2 = "";
        String cadenaacumulativa3 = "";
        boolean bandera = true;
        String salida = " ";
        double promedad = 0;
        double promestat = 0;
        int contador = 0;
        double sumaedad = 0;
        double sumaestat = 0;
        do {
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            sumaedad = sumaedad + edad;
            sumaestat = sumaestat + estatura;
            contador = contador + 1;
            promedad = sumaedad / contador;
            promestat = sumaestat / contador;
            cadenaacumulativa = String.format("%s %d", cadenaacumulativa, edad);
            cadenaacumulativa2 = String.format("\n%s%s-%s-edad: %d,estatura: %.2f\n", cadenaacumulativa2, nombre, posicion, edad, estatura);
            cadenaacumulativa3 = String.format("%s\nPromedio de edades:%.2f\nPromedio de estaturas:%.2f", cadenaacumulativa2, promedad, promestat);
            entrada.nextLine();

            System.out.println("Ingrese (si) para continuar ingresando datos, caso contrario ingrese no");
            salida = entrada.nextLine();
            if ((salida.equals("si"))&&(salida.equals("SI"))&&(salida.equals("Si"))){
                bandera = false;
            } else {
                bandera = true;
            }
        } while (bandera == false);

        System.out.printf("%s", cadenaacumulativa3);
    }
}
