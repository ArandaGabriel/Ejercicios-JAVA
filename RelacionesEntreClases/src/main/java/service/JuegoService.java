/*
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
*/


package service;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.List;
import java.util.Scanner;

public class JuegoService {

    public void llenarJuego (RevolverService RS, List<Jugador> Jugadores, Revolver rev){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean confirmacion = true;
        Juego j = new Juego();
        Jugador ju = new Jugador();
        
        do{
            
            System.out.println("Ingrese el nombre del jugador: ");
            ju.setNombre(leer.next());
            
            System.out.println("Ingrese el ID del jugador:");
            ju.setId(leer.nextInt());
            
            Jugadores.add(ju);
            j.setJugadores(Jugadores);
            
            RS.llenarRevolver(rev);
            
            System.out.println("Desea agregar otro jugador? S/N");
            
            if(leer.next().equalsIgnoreCase("n")){
            confirmacion = false;
            
            }
            
            
        } while (confirmacion);
    
    }
    
    public void ronda(JugadorService JS, RevolverService RS, List<Jugador> Jugadores, Revolver rev){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean juego=true;
        
        do {            
            for (Jugador Jugadore : Jugadores) {
                        
            JS.disparoRevolver(RS, rev, Jugadore);
                System.out.println("Continuar:");
                leer.next();
            
            if(Jugadore.isMojado()){
                System.out.println("Finalizó el juego, el jugador " + Jugadore + " se mojó.");
                juego = false;
                break;
            } else {
                System.out.println("Zafaste.. por ahora....");
            }
        }
        } while (juego);
        
        
        
    }
    
}
