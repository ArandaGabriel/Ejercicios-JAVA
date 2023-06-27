/*Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)


Métodos:


*/

package service;

import Entidad.Revolver;
import java.util.Random;

public class RevolverService {
    
    public void llenarRevolver(Revolver revolver){
        Random random = new Random();
                
        revolver.setPosicionAgua(random.nextInt(6));
        revolver.setPosicionActual(random.nextInt(6));
    }
    
    public boolean mojar(Revolver revolver){
        
        boolean verif = false;
        
        if (revolver.getPosicionActual() == revolver.getPosicionAgua()) {
            verif = true;
        }
        
        return verif;
    }
    
    public void siguienteChorro(Revolver revolver){
        
        if (revolver.getPosicionActual() == 5) {
            revolver.setPosicionActual(0);
            
        } else {
        
        revolver.setPosicionActual(revolver.getPosicionActual()+1);
        
        }
    }
    
    public void toString(Revolver revolver){
        
        System.out.println(revolver.toString());
        
    }
    
/*Métodos:
    
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
*/

   
    
    
                        
        
    }
    
    
    

