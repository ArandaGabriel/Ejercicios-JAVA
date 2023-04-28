package Clases;

import Entidades.Rectangulo2;
import java.util.Scanner;

public class Ejercicio6Extra {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese el valor del lado 1 del rectangulo:");
        int lado1 = leer.nextInt();
        System.out.println("Ingrese el valor del lado 2 del rectangulo:");
        int lado2 = leer.nextInt();
        
        Rectangulo2 rectangulo1 = new Rectangulo2(lado1, lado2);
        
        rectangulo1.calcular_area();
        
        
        
    }

}
