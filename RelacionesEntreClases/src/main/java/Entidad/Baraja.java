package Entidad;

import java.util.ArrayList;

public class Baraja {

    private ArrayList<Carta> mazo;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }
    
}
