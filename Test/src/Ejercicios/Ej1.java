package Ejercicios;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1;
       int num2;
       System.out.println("Ingresa número1:");
       num1 = leer.nextInt();
       System.out.println("Ingresa número2:");
       num2 = leer.nextInt();
       System.out.println("El número 1 es: " + num1 + " y el número 2 es: " + num2 + ".");
    }
    
}
