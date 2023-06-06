package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

      public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList <String> razas = new ArrayList();
        
        boolean a = true;
        int opc;
        int i=0;
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
        
        int cantidad = razas.size();
                
        
        for (String raza1 : razas) {
            System.out.println(raza1);
        }
        
          System.out.println("Ingrese la raza de perro que desea buscar:");
          String razaBusqueda = leer.next();
          
          Iterator<String> it = razas.iterator();
          
          while (it.hasNext()) {
              String next = it.next();
              
              if (next.equalsIgnoreCase(razaBusqueda)) {
                  it.remove();
              } else {
                  i++;   
          } 
              
    }
          
          if (i == cantidad) {
          System.out.println("La raza ingresada no se encuentra en la lista.");   
          }
                    Collections.sort(razas);
                            for (String raza1 : razas) {
                            System.out.println(raza1);
                    }   

}
}
