package servicios;

import entidad.Estudiante;
import java.util.Scanner;

public class EstudianteService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Estudiante crearEstudiantes(){
        
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre  = leer.next();
            System.out.println("Ingrese la nota del estudiante: ");
            double nota = leer.nextDouble();
            
            Estudiante E = new Estudiante(nombre, nota);
            
            return E;
            
        }
        
        
        
    }

