
package Programa;
import java.util.Scanner;
public class Programa01 {
 public static void main (String []args){
    int sumaTotal = 0;
        int numero;
  Scanner lectura = new Scanner(System.in);  
  
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = lectura.nextInt();
            sumaTotal += numero; 
        }
        System.out.println("La suma total es: " + sumaTotal); 
        
 }   
}
