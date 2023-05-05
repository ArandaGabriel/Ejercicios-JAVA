package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    public Cafetera C1 = new Cafetera();
    
    private Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(){
        C1.setCapacidadMaxima(1000);
        C1.setCapacidadActual(C1.getCapacidadMaxima());
        System.out.println("Cafetera Completa.");
        System.out.println("");
  
    }
    
    public void servirTaza(){
        System.out.println("Ingrese el tamaño en ml de una taza vacía:");
        int tamañoTaza = leer.nextInt();
        int cantCafePT = tamañoTaza/15;
        int cantLiqPT;
        
        if(cantCafePT > C1.getCapacidadActual()) {
            cantLiqPT = C1.getCapacidadActual()*15;
            System.out.println("No se pudo llenar la taza a la capacidad máxima. Se pudo hacer: " + cantLiqPT + "ml. de café infusionado. Usando " + C1.getCapacidadActual() + "gr. de café molido.");
            C1.setCapacidadActual(0);
        }else {
            cantLiqPT = cantCafePT*15;
            System.out.println("Se pudo llenar la taza de café correctamente a la capacidad máxima. " + cantLiqPT + "ml. de café infusionado. Usando " + cantCafePT + "gr. de café molido.");
            C1.setCapacidadActual(C1.getCapacidadActual()-cantCafePT);
            
        }  
        System.out.println("");
      
        
    }
    
    public void vaciarCafetera(){
        C1.setCapacidadActual(0);
    }
    
    public int agregarCafe(){
        System.out.println("Ingrese la cantidad de café molido que desea agregar:");
        int agregarCafe = leer.nextInt();
        
        while((agregarCafe+C1.getCapacidadActual()) > C1.getCapacidadMaxima()) { 
        
            System.out.println("Se excedió de la capacidad de la cafetera. Vuelva a ingresar una cantidad menor de café molido:");
            agregarCafe =leer.nextInt();
        }
        System.out.println("");
        
        C1.setCapacidadActual(C1.getCapacidadActual()+agregarCafe);
        return agregarCafe;
      
        }
    
    public void menu(){
        System.out.println("Bienvenido. Elija la opción que desee realizar:");
        System.out.println("1. Llenar cafetera");
        System.out.println("2. Servir Taza");
        System.out.println("3. Vaciar Cafetera");
        System.out.println("4. Agregar Café");
        System.out.println("5. Ver cantidad de café");
        System.out.println("6. Salir");
        System.out.println("");
        
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1: llenarCafetera();
            menu();
            break;
            case 2: servirTaza();
            menu();
            break;
            case 3: vaciarCafetera();
            menu();
            break;
            case 4: agregarCafe();
            menu();
            break;
            case 5: verCafe();
            menu();
            break;
            case 6: 
                System.out.println("Está seguro que desea salir: s/n");
                String op = leer.next();
                if(op.equalsIgnoreCase("n") ){
                    menu();
                }
            break;
            default: System.out.println("La opcion ingresada es incorrecta.");
            menu();
            break;
            
        }
    }
    
    public void verCafe(){
        System.out.println("La cantidad de café molido disponible es: " + C1.getCapacidadActual());
        System.out.println("");
    }
        
    }
    
    
    
    
