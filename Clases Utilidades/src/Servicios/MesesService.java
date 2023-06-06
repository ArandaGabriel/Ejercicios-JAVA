package Servicios;

import Entidades.Meses;
import java.util.Scanner;

public class MesesService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void acertarMes(){
        
        Meses M = new Meses();
        String mesSecreto;
        
        do{
            System.out.println("Adivine el mes secreto. Introduzca el nombre del mes: ");
            mesSecreto = leer.next();
            
            if(M.getMesSecreto().equals(mesSecreto.toLowerCase())){
                System.out.println("Ha acertado!");
            } else {
                System.out.println("No ha acertado. Intente nuevamente con otro mes.");
                System.out.println("");
            }
            
            
        } while (!M.getMesSecreto().equals(mesSecreto.toLowerCase()));
               
    }
        
    }
    
