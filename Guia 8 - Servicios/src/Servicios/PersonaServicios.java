package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicios {

    private Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese el nombre:");
        String nombre = leer.next();
        
        System.out.println("Ingrese la edad:");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese el sexo: (H para hombre, M para Mujer, O para otro");
        String sexo = leer.next();
        
        if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("O")){  
        }else{
            System.out.println("El sexo ingresado es incorrecto.");
        }
                
        System.out.println("Ingrese el peso:");
        int peso = leer.nextInt();
        
        System.out.println("Ingrese la altura:");
        String alturaStr = leer.next();
        
        alturaStr=alturaStr.replace(",", ".");
        float altura = Float.parseFloat(alturaStr);
        
        
        
        return new Persona(nombre, edad, sexo, peso, altura);
        
        
    }
    
    public boolean esMayorDeEdad(int edad){
        if(edad >= 18){
            return true ;
        } else {
            return false;
        }
    }
    
    public int calcularIMC(int peso, float altura){
        if ((peso/Math.pow(altura,2))<20){
            return -1;
        } else if ((peso/Math.pow(altura,2))>20 && (peso/Math.pow(altura,2))<=25) {
            return 0;
        } else if ((peso/Math.pow(altura,2))>25){
            return 1;
        }
        return 20;
    } 
    
}
