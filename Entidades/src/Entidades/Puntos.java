package Entidades;

import static java.lang.Math.abs;
import java.util.Scanner;

public class Puntos {
    
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public double distanciaX;
    public double distanciaY;
    
    public Puntos(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public Puntos(){
        
    }
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de x1");
        this.x1 = leer.nextInt();
        System.out.println("Ingrese el valor de x2");
        this.x2 = leer.nextInt();
        System.out.println("Ingrese el valor de y1");
        this.y1 = leer.nextInt();
        System.out.println("Ingrese el valor de y2");
        this.y2 = leer.nextInt();
    }
    
    public void calcular(){
        this.distanciaX = abs(x2-x1);
        this.distanciaY = abs(y2-y1);
        
        System.out.println("La distancia entre el punto 1 y el punto 2 es: (" + Math.sqrt(Math.pow(distanciaX,2)+Math.pow(distanciaY,2)) + ").");
        
    }

    @Override
    public String toString() {
        return "Puntos{" + "distanciaX=" + distanciaX + ", distanciaY=" + distanciaY + '}';
    }
    
    
    
}


