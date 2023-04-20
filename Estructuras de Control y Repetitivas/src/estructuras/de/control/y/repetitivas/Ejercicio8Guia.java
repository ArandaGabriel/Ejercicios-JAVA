package estructuras.de.control.y.repetitivas;

import java.util.Scanner;

public class Ejercicio8Guia {

 
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingrese la nota");
         
         int nota = leer.nextInt();
         
         while (nota <=0 || nota>10){
        
             System.out.println("Ingrese nuevamente la nota");
             nota = leer.nextInt();  
    }
         System.out.println("La nota es: " + nota);
    }
    
}
