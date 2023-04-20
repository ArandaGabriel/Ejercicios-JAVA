package Ejercicios;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numEntero;
        
        System.out.println("Ingrese un número entero:");
        numEntero = leer.nextInt();
        
        int numTriple = numEntero*3;
        float numRaizC = (float) sqrt(numEntero);
        
        
        
        System.out.println("El número que ingreso es: " + numEntero + ". El triple es: " + numTriple + ". Y la raiz cuadrada es: " + numRaizC );
    }
    
}
