package servicios;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {
    
    public ArrayList<Alumno> crearListaAlumnos(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<Alumno> alumnos = new ArrayList();
        boolean confirmacion = true;
        
        do{
            Alumno alumno = new Alumno();
            
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(leer.next());
            
            System.out.println("Ingrese las 3 notas del alumno");
            ArrayList<Integer> notas = new ArrayList();
            
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }
            
            alumno.setNotas(notas);
            alumnos.add(alumno);
            
            System.out.println("¿Desea ingresar otro alumno? S/N");
            if(leer.next().equalsIgnoreCase("N")){
                confirmacion = false;
            }
            
        } while (confirmacion);
        
        return alumnos;
    }
    
    public double notaFinal(Alumno alu){
        
        double sumaNotas= 0;
        for (Integer nota : alu.getNotas()) {
            
            sumaNotas += nota;
            
        }
        
        double promedio = sumaNotas /3;
        
        return promedio;
    }
    
    public double buscarAlumno(ArrayList <Alumno> alumnos){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el alumno que desea calcular la nota final:");
        String alumnoABuscar = leer.next();
        
        boolean aux = false;
        
        
        Iterator <Alumno> it = alumnos.iterator();
        
        while(it.hasNext()){
            Alumno alu = it.next();
            if(alu.getNombre().equalsIgnoreCase(alumnoABuscar)){
                aux = true;
                return notaFinal(alu);
            }
        } 
       
        if (aux == false) {
            System.out.println("No se encontró al alumno");
        }
        
        return 0;
        
    }
    
    
}
