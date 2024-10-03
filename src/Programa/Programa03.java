
package Programa;
import java.util.Scanner;
public class Programa03 {
 public static void main (String []args){
     int sumatoriaNegativos = 0;
        int sumatoriaPositivos = 0;
        int contadorPositivos = 0;
     Scanner lectura = new Scanner (System.in);       
        for (int i = 1; i <= 6; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = lectura.nextInt();
            
            if (numero < 0) {
                sumatoriaNegativos += numero; 
            } else if (numero > 0) {
                sumatoriaPositivos += numero; 
                contadorPositivos++; 
            }
        }       
        System.out.println("Sumatoria de los números negativos: " + sumatoriaNegativos);       
        if (contadorPositivos > 0) {
            double promedioPositivos = (double) sumatoriaPositivos / contadorPositivos;
            System.out.println("Promedio de los números positivos: " + promedioPositivos);
        } else {
            System.out.println("No se ingresaron números positivos, no se puede calcular el promedio.");
 }   
}
}
