package main;

import entidad.Alumno;
import java.util.ArrayList;
import servicios.AlumnoService;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        AlumnoService AS1 = new AlumnoService();
        ArrayList <Alumno> alumnos = AS1.crearListaAlumnos();
        
        System.out.println(alumnos.toString());
        
        AS1.buscarAlumno(alumnos);
    }

}
