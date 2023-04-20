package Ejercicios;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int tempCentigrados;
        
        System.out.println("Ingrese una temperatura en grados centigrados:");
        tempCentigrados = leer.nextInt();
        
        int tempFahrenheit = 32 + (9*tempCentigrados/5);
        
        System.out.println("La temperatura en fahrenheit es: " + tempFahrenheit);
        
    }
    
}
