package ejercicios.estructuras.de.control.y.repetitivas;

import java.util.Scanner;


public class Ejercicio4Guia {

    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra");
         
        String frase = leer.next();
        
        
        if ((frase.substring(0,1)).equalsIgnoreCase("A")) {
            
        System.out.println("CORRECTO");
    } else {
        System.out.println("INCORRECTO");
        
         
        
         
             
    }        
       
    }
    
}
