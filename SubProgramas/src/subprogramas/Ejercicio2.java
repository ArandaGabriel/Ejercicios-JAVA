package subprogramas;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
             
        funcion();
    }
    
    public static void funcion(){
        
        Scanner leer = new Scanner(System.in);
        
        int i=0;
        
        do {
            
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese la edad de la persona");
        int edad = leer.nextInt();
        
        System.out.println("El nombre de la persona es: " + nombre + " y la edad es: " + edad);
        System.out.println(" "); 
        System.out.println("Quiere seguir ingresando más datos de personas (s/n)"); 
        System.out.println(" "); 
        String opcion = leer.next();
        
        if (opcion.equalsIgnoreCase("n")) {
            i=1;
            
        }
        
        } while (i!=1);
        
       
        System.out.println("Gracias!"); 
        
        

}
    
}
