package Entidad;

import java.util.List;

public class Juego {

    private List<Jugador> jugadores;
    private Revolver rev;

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, Revolver rev) {
        this.jugadores = jugadores;
        this.rev = rev;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRev() {
        return rev;
    }

    public void setRev(Revolver rev) {
        this.rev = rev;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", rev=" + rev + '}';
    }
    
    
    
    
}
