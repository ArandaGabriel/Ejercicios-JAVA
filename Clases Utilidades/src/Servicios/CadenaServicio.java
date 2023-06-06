package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Cadena ingresarFrase(){
        Cadena c = new Cadena();
        System.out.println("Ingrese una frase: ");
        String frase = leer.next();
        c.setFrase(frase);
        c.setLongitud(frase.length());
        
        return c;
        
    }
    
    public void mostrarVocales(Cadena c){
        
        
        int vocal=0;
        c.setFrase(c.getFrase().toLowerCase());
        
        for (int i = 0; i < c.getLongitud(); i++) {
        
            switch(c.getFrase().substring(i, i+1)) {
                case "a":  vocal++;
                break;
                case "e": vocal++;
                break;
                case "i": vocal++;
                break;
                case "o": vocal++;
                break;
                case "u": vocal++;
                break;
            }
            
        }
        
        System.out.println("La cantidad de vocales fueron: " + vocal);
        
    }
    
    public void invertirFrase(Cadena c){
        String[] nuevaFrase = new String[c.getLongitud()];
        System.out.print("La frase invertida es: <<  " );
        for (int i = 0; i < c.getLongitud(); i++) {
            
            nuevaFrase[i]= c.getFrase().substring(c.getLongitud()-(i+1), c.getLongitud()-i);
            
            System.out.print(nuevaFrase[i]);
            
        }
        System.out.print("  >>");
        System.out.println("");
    }
    
    public void vecesRepetido(String letra, Cadena c){
        int j=0;
        for (int i = 0; i < c.getLongitud(); i++) {
            
            if (letra.equalsIgnoreCase(c.getFrase().substring(i,i+1))){
               j++;
            }
        }
        System.out.println("Las veces que se repitió la letra: " + letra + "fueron: " + j + " veces.");
    }
    
    public void compararLongitud(String frase, Cadena c){
        
        Integer entero1= frase.length();
        Integer entero2 = c.getLongitud();
        if (entero1.compareTo(entero2) == 0){
            System.out.println("Las longitudes son iguales.");
        } else {
            System.out.println("Las longitudes NO son iguales.");
        }
        
    }
    
    public void unirFrases(String frase, Cadena c){
        String fraseResultante;
        
        fraseResultante = c.getFrase().concat(frase);
        System.out.println(fraseResultante);
                                
    }
    
    public void reemplazar(String letra, Cadena c){
        
        String[] fraseReemp = new String[c.getLongitud()];
        
        for (int i = 0; i < c.getLongitud(); i++) {
            if(c.getFrase().substring(i,i+1).equalsIgnoreCase("a")){
                fraseReemp[i] = letra;
            } else {
                fraseReemp[i] = (c.getFrase().substring(i,i+1));   
            }
            
            System.out.print(fraseReemp[i]);
        }
        System.out.println("");
    }
    
    public void contiene(String letra, Cadena c){
        int k = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            
        if(c.getFrase().substring(i,i+1).equalsIgnoreCase(letra)){
            k++;
        }     
    }
        if (k > 0) {
            System.out.println("Es verdadero");
            
        } else {
            System.out.println("Es falso");
        }
       
    }    
    
    public void menu(Cadena c){
        System.out.println("");
                
        System.out.println("Bienvenido. Elija la opción que desee realizar:");
        System.out.println("1. Mostrar Vocales");
        System.out.println("2. Invertir Frase");
        System.out.println("3. Veces Repetido");
        System.out.println("4. Comparar Longitud");
        System.out.println("5. Unir Frases");
        System.out.println("6. Reemplazar letra");
        System.out.println("7. Ver si contiene letra");
        System.out.println("8. Salir");
        System.out.println("");
        
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1: mostrarVocales(c);
            menu(c);
            break;
            case 2: invertirFrase(c);
            menu(c);
            break;
            case 3:
            System.out.println("Ingrese la letra que desea ver cuantas veces se repitió: ");
            String le = leer.next();
            vecesRepetido(le, c);
            menu(c);
            break;
            case 4: 
            System.out.println("Ingrese una frase para poder comparar la longitud de la misma con la longitud de la frase anteriormente ingresada: ");
            String frLong = leer.next();    
            compararLongitud(frLong, c);
            menu(c);
            break;
            case 5: 
            System.out.println("Ingrese una frase para unir con la anteriormente ingresada: ");
            String frConc = leer.next();    
            unirFrases(frConc, c);
            menu(c);
            break;
            case 6: 
            System.out.println("Ingrese la letra que desea reemplazar por las -a- de la frase: ");
            String l = leer.next();    
            reemplazar(l, c);
            menu(c);   
            break;
            case 7: 
            System.out.println("Ingrese la letra que desea ver si contiene la frase: ");
            String lCont = leer.next();    
            contiene(lCont, c);
            menu(c);    
            break;
            case 8: 
                System.out.println("Está seguro que desea salir: s/n");
                String op = leer.next();
                if(op.equalsIgnoreCase("n") ){
                   menu(c);
                }
            break;
            default: System.out.println("La opcion ingresada es incorrecta.");
            menu(c);
            break;
            
        }
        System.out.println("");
    }
    
}
