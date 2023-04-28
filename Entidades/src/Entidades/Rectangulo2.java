package Entidades;

public class Rectangulo2 {
    
    public int lado1;
    public int lado2;
    public int area;
    
    
    public Rectangulo2(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    
    public void calcular_area(){
        this.area = lado1*lado2;
        System.out.println("El área del rectangulo es: " + area);
    }

       
}
