package main;

import Entidades.Electrodomestico;
import Service.ElectrodomesticoService;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Electrodomestico E = new Electrodomestico();
        ElectrodomesticoService ES = new ElectrodomesticoService();
        
        System.out.println("Ingrese el Consumo Energético del Electrodoméstico (A ~ F)");
        char l = leer.next().charAt(0);
        ES.comprobarConsumoEnergetico(E, l, leer);
        
        
    }

}
