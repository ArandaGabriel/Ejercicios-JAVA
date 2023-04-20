
package ejercicios.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

public class Ejercicio5Guia {

    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese un valor límite positivo");
        
        int num, suma=0, valorLim = leer.nextInt();
               
        System.out.println("Ingrese números");
        
        do {
        
        num = leer.nextInt();
        
        suma += num;
        
        } while (suma < valorLim );
        
        
        
        System.out.println("El valor de la sumatoria es: " + suma);               
    }
    
}
