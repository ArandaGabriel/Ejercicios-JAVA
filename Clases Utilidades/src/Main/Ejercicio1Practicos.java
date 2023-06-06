package Main;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

public class Ejercicio1Practicos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CadenaServicio CS1 = new CadenaServicio();
        Cadena c1 = CS1.ingresarFrase();
               
        
        CS1.menu(c1);
        
    }

}

