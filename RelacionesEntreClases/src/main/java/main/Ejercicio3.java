package main;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import service.BarajaService;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        BarajaService CS = new BarajaService();
        Baraja b = new Baraja();
        List<Carta> m = new ArrayList();
        
        CS.crearBaraja(b);
        CS.siguienteCarta(b, leer);
        System.out.println("------------------------");
        CS.cartasDisponibles();
        System.out.println("------------------------");
        CS.darCartas(b, leer);
        System.out.println("------------------------");
        CS.cartasDisponibles();
        System.out.println("------------------------");
        CS.cartasMonton(b, leer);
        System.out.println("------------------------");
        CS.mostrarBaraja(b);
        
    
    }

}
