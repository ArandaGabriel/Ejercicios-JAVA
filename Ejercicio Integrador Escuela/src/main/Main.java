package main;

import entidad.Estudiante;
import servicios.EstudianteService;

public class Main {

    public static void main(String[] args) {
        
        EstudianteService ES1 = new EstudianteService();
        double sumatoriaNotas=0;
      
        Estudiante estudiantes[] = new Estudiante[8];
               
        for (int i = 0; i < 8 ; i++) {
        
            estudiantes[i] = ES1.crearEstudiantes();    
            sumatoriaNotas += estudiantes[i].getNota();
            
        }
        
        double promedioNotas = sumatoriaNotas/8;
        String[] alumnosMejores = new String[8];
        
        System.out.println("El promedio de todas las notas de los estudiantes es: " + promedioNotas);
        System.out.println("Los alumnos que recibieron mejores notas fueron: ");
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            
            if(estudiantes[i].getNota()>promedioNotas){
                
                alumnosMejores[i] = estudiantes[i].getNombre();
                 System.out.println(alumnosMejores[i]);     
                
            }
            
           
                    
       
            
        }
        
        
        
    }

}
