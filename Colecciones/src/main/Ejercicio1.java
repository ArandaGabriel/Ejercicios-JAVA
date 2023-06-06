package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
                     
                
        ArrayList <String> razas = new ArrayList();
        
        boolean a = true;
        int opc;
        String raza;
        
        while(a == true){
            
            System.out.println("Ingrese una raza de perro:");
            raza = leer.next();
            razas.add(raza);
            
            System.out.println("¿Desea ingresar otra raza? 1-Si / 2-No");
            opc = leer.nextInt();
            
            if (opc == 2) {
                a= false;
            } else if (opc != 1 && opc != 2){
                System.out.println("La opción es incorrecta.");
                a=false;
        }
        }
        
        for (String raza1 : razas) {
            System.out.println(raza1);
        }
        
        
    }

}
