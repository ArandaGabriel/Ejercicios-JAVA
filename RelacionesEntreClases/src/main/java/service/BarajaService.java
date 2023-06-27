package service;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BarajaService {

    int cont=0;
    
    public void crearBaraja(Baraja b){
        
        //Baraja b = new Baraja();
        ArrayList<Carta> m  = new ArrayList();
        //Carta c = new Carta();
        Random random = new Random();
        
        int[] numero = {1,2,3,4,5,6,7,10,11,12};
        String[] palo = {"espada","basto","oro","copa"};

        
        for (int i = 0; i < 40; i++) {
            
            int indiceAleatorio = random.nextInt(numero.length);
            int indiceAleatorioPalo = random.nextInt(palo.length);
            Integer valorAleatorio = numero[indiceAleatorio];
            String paloAleatorio = palo[indiceAleatorioPalo];
            Carta c = new Carta(valorAleatorio, paloAleatorio);
            
            m.add(c);
            b.setMazo(m);
            
                 }
        }
    
    public void siguienteCarta(Baraja b, Scanner leer){
        
        
        
        for (Carta c : b.getMazo()) {
            System.out.println(c);
            cont++;
            System.out.println("Desea otra carta? S/N");
            if (leer.next().equalsIgnoreCase("n")) {
                break;
            } 
            
            if (cont == 39) {
                System.out.println("No hay más cartas");
                break;
            }
            
        }
        
    }
    
    public void cartasDisponibles(){
         System.out.println("La cantidad de cartas que aún se pueden repartir son: " + (40-cont));
    }
        
    public void darCartas(Baraja b, Scanner leer){
        
        System.out.println("¿Cuantas cartas desea pedir?");
        int c = leer.nextInt();
        
        if (c <= (40-cont) ) {
            for (int i = 0; i < c; i++) {
                System.out.println(b.getMazo().get(cont+i));
        }
        } else{
            System.out.println("No hay la cantidad suficiente de cartas.");
        }
        
        cont += c; 
    }
    
    public void cartasMonton(Baraja b, Scanner leer){
        
        System.out.println("Las cartas que ya han salido son:");
        
        for (int i = 0; i < cont; i++) {
            System.out.println(b.getMazo().get(i));
            
        }
        
    }
    
    public void mostrarBaraja(Baraja b){
        System.out.println("Las cartas que todavían faltan salir son: ");
        for (int i = 0; i < 40-cont; i++) {
            System.out.println(b.getMazo().get(cont+i));
        }
        }
        
}

