package Entidades;

public class Ahorcado {

    private String[] palabraABuscar;
    private int cantidadDeLetras;
    private int cantidadDeJugadasMax;

    public Ahorcado(String[] palabraABuscar, int cantidadDeLetras, int cantidadDeJugadasMax) {
        this.palabraABuscar = palabraABuscar;
        this.cantidadDeLetras = cantidadDeLetras;
        this.cantidadDeJugadasMax = cantidadDeJugadasMax;
    }

    public Ahorcado() {
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public int getCantidadDeLetras() {
        return cantidadDeLetras;
    }

    public int getCantidadDeJugadasMax() {
        return cantidadDeJugadasMax;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public void setCantidadDeLetras(int cantidadDeLetras) {
        this.cantidadDeLetras = cantidadDeLetras;
    }

    public void setCantidadDeJugadasMax(int cantidadDeJugadasMax) {
        this.cantidadDeJugadasMax = cantidadDeJugadasMax;
    }
    
    
}
