package Main;

import Entidades.Ahorcado;
import Servicios.AhorcadoService;

public class Ejercicio2Extra {

    public static void main(String[] args) {
        
        AhorcadoService AS1 = new AhorcadoService();
        Ahorcado A1 = AS1.crearJuego();
        AS1.longitud(A1);
        
        AS1.juego(A1);
        
        
    }

}
