package estructuras.de.control.y.repetitivas;

import java.util.Scanner;

public class Ejercicio6Guia {

  
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero");
        int num2 = leer.nextInt();
        int n=0;
        
        if(num1>25 && num2>25){
        System.out.println("Ambos números son mayores a 25");
        } else if (num1>25) {
             System.out.println("Solo el primer número es mayor a 25");
        } else if (num2>25) {
             System.out.println("Solo el segundo número es mayor a 25");
        } else {
             System.out.println("Ningún numero es mayor a 25");
        }            
        
    }
    
}
