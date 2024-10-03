
package Programa;
import java.util.Scanner;
public class Programa02 {
 public static void main (String []args){
     int sumaTotal = 0;
        int numero;
     Scanner lectura = new Scanner (System.in);
        System.out.print("Ingrese la cantidad de números : ");
        int n = lectura.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = lectura.nextInt();
            sumaTotal += numero; 
        }
        double promedio = (double) sumaTotal / n;
        
        System.out.println("Total = " + sumaTotal);
        System.out.println("Promedio = " + promedio);  
 }   
}
