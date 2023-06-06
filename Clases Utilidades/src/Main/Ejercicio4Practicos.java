package Main;

import Servicios.FechaService;

public class Ejercicio4Practicos {

    public static void main(String[] args) {
     
        FechaService FS1 = new FechaService();
        
       FS1.fechaNacimiento();
      
       FS1.fechaActual();
       FS1.diferencia(FS1.fechaActual().getTime(), FS1.fechaNacimiento().getTime());
        
        
    }

}
