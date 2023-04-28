package Entidades;

public class Circunferencia {
    
    private double radio;
    private double area;
    private double perimetro;
    
    public Circunferencia(double radio){
        this.radio=radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
        
    }

    public double getRadio(){
        return radio;
    }
    
    public double crearCircunferencia(double radio){
        this.radio= radio;
        return radio;
    }
    
    public double area(){
        this.area=(double) ((Math.PI)*(Math.pow(radio,2)));
        return area;
    }
    
    public double perimetro(){
        this.perimetro=(double) (2*(Math.PI)*radio);
        return perimetro;
        
       
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

 
    
    
}
