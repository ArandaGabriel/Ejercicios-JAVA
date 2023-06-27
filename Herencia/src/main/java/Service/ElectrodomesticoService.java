package Service;

import Entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoService {

    public void comprobarConsumoEnergetico(Electrodomestico E, char letra, Scanner leer){
        
        String l = Character.toString(letra) ;
        
        String[] cEnerg = {"A","B","C","D","E","F"};
        int j = 0;
       
        for (int i = 0; i < cEnerg.length; i++) {
            
            if (l.equalsIgnoreCase(cEnerg[i])) {
                E.setConsumoEnergetico(letra);
                j++;
            } 
            
            if (i == (cEnerg.length-1) && j==0) {
               E.setConsumoEnergetico('F');
            }
    
            
            }
            
            
        
            
        System.out.println(E.getConsumoEnergetico());
        
        
        
        
    }
    
}
