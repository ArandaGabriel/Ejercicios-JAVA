package Servicios;

import Entidades.Ahorcado;

import java.util.Scanner;

public class AhorcadoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public int encontradas=0;
    public int faltantes=0;
    public int cantidadJug =0;
    
    public Ahorcado crearJuego(){
        
        System.out.println("Ingrese la palabra a buscar: ");
        String palabra = leer.next();
        String[] palabraVec = new String[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            
            palabraVec[i] = palabra.substring(i, i+1);
        }
        
        System.out.println("Ingrese la cantidad de jugadas máximas: ");
        int cant = leer.nextInt();
        
        
        Ahorcado A = new Ahorcado(palabraVec, palabra.length(), cant);
        faltantes = A.getPalabraABuscar().length;
        cantidadJug = A.getCantidadDeJugadasMax();
        return A;
        
    }
    
    public void longitud(Ahorcado A){
        
        int longitud = A.getPalabraABuscar().length;
        
        System.out.println("El largo de la palabra a buscar es: " + longitud);
    }
    
    public void buscarLetra(Ahorcado A){
        
        System.out.println("Ingrese una letra: ");
        String letra = leer.next();
               
        
        for (int i = 0; i < A.getPalabraABuscar().length; i++) {
            
            if(letra.equalsIgnoreCase(A.getPalabraABuscar()[i])){
                
                System.out.println("La letra ingresada SI está dentro de la palabra a buscar");
                
            } else {
            
                System.out.println("La letra ingresada NO está dentro de la palabra a buscar");
            }
        
        }
    }
    
    
    
    public boolean encontradas(Ahorcado A){
         
        System.out.println("Ingrese una letra: ");
        String letra = leer.next();
        System.out.println("Longitud de la palabra: " + A.getPalabraABuscar().length);
        for (int i = 0; i < A.getPalabraABuscar().length; i++) {
            //letra.equalsIgnoreCase(A.getPalabraABuscar()[i]
            if(letra.equalsIgnoreCase(A.getPalabraABuscar()[i])){
                faltantes --;
                encontradas ++;
                cantidadJug --;
                return true;
                
            } else {
                
                cantidadJug --;
                return false;       
            }
        }
        return false;
        
    }
    
    public void intentos(){
        
        System.out.println("La cantidad de oportunidades que les queda al jugador son: " + cantidadJug);
    }

    public void juego(Ahorcado A){
        
        do{
        if(encontradas(A) == true){
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
        }
        System.out.println("Número de letras encontradas: " + encontradas + " || Número de letras faltantes: " + faltantes);
        System.out.println("Número de oportunidades restantes: " + cantidadJug);
        
            
        
        } while (cantidadJug !=0 && faltantes != 0);
        
        
        if (faltantes == 0) {
                System.out.println("Usted ha ganado!");
            }
            
            if (cantidadJug == 0 && faltantes !=0) {
                System.out.println("Lo sentimos, no hay más oportunidades.");
            }
        
    }
}
