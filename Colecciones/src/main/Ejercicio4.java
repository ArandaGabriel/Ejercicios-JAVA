package main;

import entidad.Pelicula;
import java.util.ArrayList;
import servicios.PeliculaService;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        PeliculaService PS = new PeliculaService();
        
        ArrayList <Pelicula> Peliculas = PS.crearPelicula();
        
        PS.mostrarPeliculas(Peliculas);
        PS.mostrarPeliculasDuracion(Peliculas);
        PS.ordenarSegunDuracionMayorMenor(Peliculas);
        PS.ordenarSegunDuracionMenorMayor(Peliculas);
        PS.ordenarSegunTitulo(Peliculas);
        PS.ordenarSegunDirector(Peliculas);
        
        
        
        
        
        
        
    }   

}
