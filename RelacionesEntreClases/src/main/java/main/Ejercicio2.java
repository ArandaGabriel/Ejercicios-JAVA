/*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:


*/


package main;

import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.List;
import service.JuegoService;
import service.JugadorService;
import service.RevolverService;


public class Ejercicio2 {

    public static void main(String[] args) {
        
        JugadorService JS = new JugadorService();
        RevolverService RS = new RevolverService();
        JuegoService JS1 = new JuegoService();
        Jugador J = new Jugador();
        Revolver R = new Revolver();
        List<Jugador> jugadores = new ArrayList();
        
        
        
        JS1.llenarJuego(RS, jugadores, R);
        JS1.ronda(JS, RS, jugadores, R);
        
        
    }

}
