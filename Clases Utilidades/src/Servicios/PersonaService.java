package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = leer.next();
        System.out.println("Ingrese el año de nacimiento");
        int anio = (leer.nextInt()-1900);
        System.out.println("Ingrese el mes de nacimiento");
        int mes = (leer.nextInt()-1);
        System.out.println("Ingrese el día de nacimiento");
        int dia = leer.nextInt();
        Date fecha = new Date(anio,mes,dia);
        Persona P = new Persona(nombre,fecha);
        P.setNombre(nombre);
        P.setFecha(fecha);
        
        
        return P;
    }
    
    public void calcularEdad(Persona P){
        Date fechaActual = new Date();
               
        if(fechaActual.getMonth()-P.getFecha().getMonth() >0){
            int edad = fechaActual.getYear() - P.getFecha().getYear();
            System.out.println("La persona tiene: " + edad + " años.");
            
        } else if (fechaActual.getMonth()-P.getFecha().getMonth() <0) {
            int edad = (fechaActual.getYear() - P.getFecha().getYear()-1);
            System.out.println("La persona tiene: " + edad + " años.");
            
        } else if(fechaActual.getMonth()-P.getFecha().getMonth() == 0){
            if(fechaActual.getDate()-P.getFecha().getDate()>0){
                int edad = fechaActual.getYear() - P.getFecha().getYear();
                System.out.println("La persona tiene: " + edad + " años.");
                
            } else if (fechaActual.getDate()-P.getFecha().getDate()<0){
                int edad = (fechaActual.getYear() - P.getFecha().getYear()-1);
                System.out.println("La persona tiene: " + edad + " años.");
                
            } else if (fechaActual.getDate()-P.getFecha().getDate()==0){
                 int edad = fechaActual.getYear() - P.getFecha().getYear();
                System.out.println("Hoy es su cumpleaños! La persona tiene: " + edad + " años.");;
            }
        }
        
        
    }
    
    public boolean menorQue(Persona P, int edad1){
        Date fechaActual = new Date();
               
       
        if(fechaActual.getMonth()-P.getFecha().getMonth() >0){
            int edad = fechaActual.getYear() - P.getFecha().getYear();
            return edad1 <edad;
        } else if (fechaActual.getMonth()-P.getFecha().getMonth() <0) {
            int edad = (fechaActual.getYear() - P.getFecha().getYear()-1);
            return edad1 <edad;
        } else if(fechaActual.getMonth()-P.getFecha().getMonth() == 0){
            if(fechaActual.getDate()-P.getFecha().getDate()>0){
                int edad = fechaActual.getYear() - P.getFecha().getYear(); 
                return edad1 <edad;
            } else if (fechaActual.getDate()-P.getFecha().getDate()<0){
                int edad = (fechaActual.getYear() - P.getFecha().getYear()-1); 
                return edad1 <edad;
            } else if (fechaActual.getDate()-P.getFecha().getDate()==0){
                 int edad = fechaActual.getYear() - P.getFecha().getYear();
                 return edad1 <edad;
          
                 
       
            }
            
        }
        
        return false;
       
    }
    
    
    public void mostrarPersona(Persona P){
        
        System.out.println("El nombre de la persona es: " +  P.getNombre());
        System.out.println("La fecha de nacimiento es: " + P.getFecha());
        
    }
    
    
    
}
