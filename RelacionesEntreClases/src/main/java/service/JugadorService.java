package service;

import Entidad.Jugador;
import Entidad.Revolver;

public class JugadorService {

     public void disparoRevolver(RevolverService rs, Revolver revolver, Jugador jugador){
        
        rs.siguienteChorro(revolver);
        if (rs.mojar(revolver)){
            jugador.setMojado(true);
        }
    }
    
}
