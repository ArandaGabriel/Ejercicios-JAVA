package Main;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

public class Ejercicio5Practico {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
                
        PersonaService PS1 = new PersonaService();
        
        Persona P1 = PS1.crearPersona();
        
        PS1.calcularEdad(P1);
        System.out.println("Ingrese una edad que para comparar con la ingresada de la persona:");
        int edad = leer.nextInt();
        System.out.println("La edad ingresada es menor a la edad de la persona?: " + PS1.menorQue(P1, edad));
        
        PS1.mostrarPersona(P1);
    }

}
