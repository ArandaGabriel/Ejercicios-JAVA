package ejercicios.estructuras.de.control.y.repetitivas;

import java.util.Scanner;


public class Ejercicio6Guia {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos valores enteros positivos");
        
        int num1 =leer.nextInt(), num2=leer.nextInt(),opcion,i=0;
        String respuesta;
        
        do {
                
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija opción");
        
        opcion = leer.nextInt();
        
        switch (opcion){
            case 1: System.out.println("La suma de ambos números es: " + (num1+num2));
            break;
            case 2: System.out.println("La resta de ambos números es: " + (num1-num2));
            break;
            case 3: System.out.println("La multiplicación de ambos números es: " + (num1*num2));
            break;
            case 4: System.out.println("La división de ambos números es: " + (num1/num2));
            break;
            case 5: System.out.println("¿Está seguro que desea salir del programa (s/n)?");
            respuesta = leer.next();
            
            if (respuesta.equalsIgnoreCase("s")){
                i=1;
            }
            break;
        }
        
        } while (i!=1);
        
        System.out.println("Gracias por usar nuestra calculadora");
        
    }
    
}
