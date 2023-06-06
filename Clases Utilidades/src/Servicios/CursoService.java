package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
     public String[] cargarAlumnos(){
        
        System.out.println("Ingrese la cantidad de alumnos que asisten a las clases:");
        int cant = leer.nextInt();
        
        
        String[] alumnos = new String[cant];
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el alumno n°: "+ (i+1));
            alumnos[i] = leer.next();
            
            
        }
        return alumnos;
        
    }
    
     public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso: ");
        String nombreCurso = leer.next();
        System.out.println("Ingrese la cantidad de horas por día que da en este curso: ");
        double horas = leer.nextDouble();
        System.out.println("Ingrese la cantidad de dias por semana que da en este curso: ");
        int dias = leer.nextInt();
        System.out.println("Ingrese en que turno da clases a este curso: ");
        char turno = leer.next().charAt(0);
        System.out.println("Ingrese el precio por hora de la clase a este curso:");
        int precioPorHora = leer.nextInt();
        
             
        
        Curso C = new Curso(nombreCurso, horas, dias, turno, precioPorHora, cargarAlumnos());
      
        return C;
    }
     
     public void calcularGananciaSemana(Curso C){
         
         
         
         int cant = C.getAlumnos().length;
         System.out.println(cant);
         
         double ganancias = C.getPrecioPorHora()*C.getCantidadHorasPorDia()*cant*C.getCantidadDiasPorSemana();
         System.out.println("La ganancia en una semana por curso es de: $" + ganancias);
         
     }
    
    
   
   
    
   
    
    
}
