package Ejercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ej3 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String fraseMinusc = "hola como andas?";
        String fraseMayusc;
        
        System.out.println("Ingrese una frase en minusculas:");
        
        fraseMinusc = leer.nextLine();
        fraseMayusc = fraseMinusc.toUpperCase();
        
        System.out.println("La frase en mayúsculas es: " + fraseMayusc );
        
        
        
        
        
  }  
}
