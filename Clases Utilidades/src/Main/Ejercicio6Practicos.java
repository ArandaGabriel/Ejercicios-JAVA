package Main;

import Entidades.Curso;
import Servicios.CursoService;

public class Ejercicio6Practicos {

    public static void main(String[] args) {
        
        CursoService CS1 = new CursoService();
        
        Curso C1 = CS1.crearCurso();
        CS1.calcularGananciaSemana(C1);
    }

}
