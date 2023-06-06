package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("/n");
    
    public Raices Ec = new Raices();

    
    public void ingresarDatos(){
        System.out.println("Ingrese el coeficiente A para realizar la ecuación de 2°Grado:");
        Ec.setA(leer.nextInt());
        System.out.println("Ingrese el coeficiente B para realizar la ecuación de 2°Grado:");
        Ec.setB(leer.nextInt());
        System.out.println("Ingrese el coeficiente C para realizar la ecuación de 2°Grado:");
        Ec.setC(leer.nextInt());
        
    }
    
    public void getDiscriminante(){
        
        Ec.setDiscriminante(Math.pow(Ec.getB(), 2)-(4*Ec.getA()*Ec.getC()));       
    }
    
    public boolean tieneRaices(){
        
        
        if(Ec.getDiscriminante()>=0){
            return true;
        } else { 
            return false;
        }
    }
    
    public boolean tieneRaiz(){
        
        if(Ec.getDiscriminante() == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public void obtenerRaices(){
        
       
        
        if(tieneRaices() == true){
            System.out.println("Las soluciones son: " + Ec.getDiscriminante() + ".");
        }
        
    }
    
    public void obtenerRaiz(){
        
        if(tieneRaiz() == true){
            System.out.println("Las soluciones son: " + Ec.getDiscriminante() + ".");
        }
        
        
    }
    
    public void calcular(){
        tieneRaices();
        tieneRaiz();
        
    }
    
    
    
}
