package Clases;

import Entidades.Libro;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
        Libro l1 = new Libro(16581, leer.nextInt(), "El Señor de los Anillos", "JR");
        
        System.out.println(l1.ISBN+" "+l1.numeroPaginas+" "+l1.nombre+" "+l1.autor+"." );
        
        
        
        
        
    }
    
}
