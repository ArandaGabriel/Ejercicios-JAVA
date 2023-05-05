package Main;

import Entidades.Persona;
import Servicios.PersonaServicios;

public class Ejercicio3Practico {

    public static void main(String[] args) {
        
        
        PersonaServicios PS1 = new PersonaServicios();
        
        Persona P2 = new Persona();
        PersonaServicios PS2 = new PersonaServicios();
        
        Persona P3 = new Persona();
        PersonaServicios PS3 = new PersonaServicios();
        
        Persona P4 = new Persona();
        PersonaServicios PS4 = new PersonaServicios();
        
        
        Persona P1 = PS1.crearPersona();
        System.out.println(P1.toString());
        
                
        if(PS1.esMayorDeEdad(P1.getEdad())==true){
            System.out.println("La persona 1 es mayor de edad.");
        } else {
            System.out.println("La persona 1 NO es mayor de edad.");
        }
        
        
        switch (PS1.calcularIMC(P1.getPeso(), P1.getEdad())) {
            case -1:
                System.out.println("La persona 1 está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("La persona 1 está en su peso ideal.");
                break;
            case 1:
                System.out.println("La persona 1 tiene sobrepeso.");
                break;
            default:
                break;
        }
        
        System.out.println(P1.getPeso()/Math.pow(P1.getAltura(),2));
        
        /*PS2.crearPersona();
        PS2.esMayorDeEdad(0);
        PS2.calcularIMC(0, 0);
        
        PS3.crearPersona();
        PS3.esMayorDeEdad(0);
        PS3.calcularIMC(0, 0);
        
        PS4.crearPersona();
        PS4.esMayorDeEdad(0);
        PS4.calcularIMC(0, 0);
        
        */
        
        
        
    }

}
