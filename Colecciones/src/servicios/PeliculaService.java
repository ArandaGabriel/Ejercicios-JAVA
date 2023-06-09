package servicios;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {

     public ArrayList<Pelicula> crearPelicula(){
         
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean confirmacion =true;
        ArrayList <Pelicula> Peliculas = new ArrayList();
        
        do{
        
        Pelicula p = new Pelicula();
         
        System.out.println("Ingrese el título de la pelicula:");
        p.setTitulo(leer.next());
        
        System.out.println("Ingrese el director de la pelicula:");
        p.setDirector(leer.next());
        
        System.out.println("Ingrese la duración de la pelicula en horas:");
        p.setDuracion(leer.nextDouble());
        
        Peliculas.add(p);
        
        System.out.println("Desea agregar otra pelicula? S/N");
        
            if (leer.next().equalsIgnoreCase("n")) {
                confirmacion = false;                
            }
            
        } while (confirmacion);
        
        return Peliculas;
     }
     
     
     
     public void mostrarPeliculas(ArrayList <Pelicula> Peliculas){
         
         System.out.println("");
         for (Pelicula Pelicula1 : Peliculas) {
             System.out.println(Pelicula1);
         }
         System.out.println("");
     }
     
     public void mostrarPeliculasDuracion(ArrayList <Pelicula> Peliculas){
         
         System.out.println("Las peliculas que tienen más de 1 hora de duracion son:");
         
         for (Pelicula Pelicula1 : Peliculas) {
         
             if (Pelicula1.getDuracion() >1) {
                 System.out.println(Pelicula1);
             }
             
             
         }
     }
     
     public void ordenarSegunDuracionMayorMenor(ArrayList <Pelicula> Peliculas){
         
         Peliculas.sort(Pelicula.compararDuracion);
         mostrarPeliculas(Peliculas);
     } 
    
     public void ordenarSegunDuracionMenorMayor(ArrayList <Pelicula> Peliculas){
         
         Peliculas.sort(Pelicula.compararDuracion);
         Collections.reverse(Peliculas);
         mostrarPeliculas(Peliculas);
     } 
     
     public void ordenarSegunTitulo(ArrayList <Pelicula> Peliculas){
         
         Peliculas.sort(Pelicula.compararTitulo);
         mostrarPeliculas(Peliculas);
     } 
     
     public void ordenarSegunDirector(ArrayList <Pelicula> Peliculas){
         
         Peliculas.sort(Pelicula.compararDirector);
         mostrarPeliculas(Peliculas);
     } 
}
