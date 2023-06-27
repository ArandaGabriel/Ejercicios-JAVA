package main;

import Entidades.AnimalEJ;
import Entidades.GatoEJ;
import Entidades.PerroEJ;
import java.util.ArrayList;

public class EjercicioAnimalGuia {

    public static void main(String[] args) {
     
        ArrayList <AnimalEJ> animales = new ArrayList();
        
        AnimalEJ a = new AnimalEJ();
        AnimalEJ b = new PerroEJ();
        AnimalEJ c = new GatoEJ();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (AnimalEJ animale : animales) {
            animale.hacerRuido();
        }
        
        
    }

}
