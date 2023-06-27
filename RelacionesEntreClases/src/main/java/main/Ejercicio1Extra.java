package main;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1Extra {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList <Persona> personas = new ArrayList();
        ArrayList <Perro> perros = new ArrayList();
        ArrayList<String> perroVerif = new ArrayList();
        
        boolean confirmacionPerro= true;
        boolean confirmacionPersona= true;
        
        do{
            System.out.println("Ingrese el nombre del perro:");
            String nombre = leer.next();
            System.out.println("Ingrese la raza del perro:");
            String raza = leer.next();
            System.out.println("Ingrese la edad del perro:");
            Integer edad = leer.nextInt();
            System.out.println("Ingrese el tamaño del perro:");
            String tamanio = leer.next();
            
            Perro p = new Perro(nombre, raza, edad, tamanio);
            perros.add(p);
            
            System.out.println("Desea agregar otro perro? S/N");
            if (leer.next().equalsIgnoreCase("n")) {
                confirmacionPerro=false;
            }            
        }while(confirmacionPerro);
    
        do {
            System.out.println("Ingrese el nombre de la persona:");
            String nombre = leer.next();
            System.out.println("Ingrese el apellido de la persona:");
            String apellido = leer.next();
            System.out.println("Ingrese la edad de la persona:");
            Integer edad = leer.nextInt();
            System.out.println("Ingrese el documento de la persona:");
            Integer documento = leer.nextInt();
            System.out.println("Ingrese el nombre del perro que desea adoptar:");
            String nombrePerro = leer.next();
            
            for (String perr : perroVerif) {
                    if (perr.equalsIgnoreCase(nombrePerro)) {
                        System.out.println("No puede adoptar ese perro porque ya está adoptado.");
                        break;            
                    }
                }
            
            perroVerif.add(nombrePerro);
            
            int i =0;
            
            for (Perro perro : perros) {
                
                if (nombrePerro.equalsIgnoreCase(perro.getNombre())) {
                    Persona p = new Persona(nombre, apellido, edad, documento, perro);
                    personas.add(p);      
                } else {
                    i++;
                }
                }
            
            if (i == perros.size()) {
                    System.out.println("No se pudo encontrar el nombre del perro que ingresó.");
                }
            
            System.out.println("Desea agregar otra persona? S/N");
            if (leer.next().equalsIgnoreCase("n")) {
                confirmacionPersona=false;
            
            }
            } while (confirmacionPersona);  
            
                        
            for (Persona p : personas) {
                System.out.println(p);
        }
            
        
     
    }    
        
        
    }


