package main;

import Entidad.Perro;
import Entidad.Persona;

public class Ejercicio1 {

    public static void main(String[] args) {
  
        Persona[] personas = new Persona[2];
        Perro[] perros = new Perro[2];
        
        personas[0] = new Persona("Gabriel", "Aranda", 32, 35650414, null );
        personas[1] = new Persona("Romina", "San Miguel", 31, 36739602, null);
        perros[0] = new Perro("Ruah", "Bulldog", 2, "Mediano");
        perros[1] = new Perro("Carola", "Pitbull", 1, "Grande");
        
        
        for (int i = 0; i < personas.length; i++) {
            personas[i].setPerro(perros[i]);
        }
        
        for (Persona persona : personas) {
            
            System.out.println(persona.toString());
            
        }
   
    
    
    }
}
