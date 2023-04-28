package Entidades;

public class Operacion {
    
    private int numero1;
    private int numero2;
    private int suma;
    private int resta;
    private int multiplicar;
    private int dividir;

    
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    
    public Operacion() {
    }
    
    
    public void setNumeros(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        
    }
    
    public int getNumero1(){
        return numero1;
    }
    
    public int getNumero2(){
        return numero2;
    }
    
    public void crearOperacion(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    
    public int sumar(){
        suma = numero1 + numero2;
        return suma;
    }
    
    public int restar(){
        resta = numero1 - numero2;
        return resta;
    }
    
    public int multiplicar(){
        if(numero1 == 0 || numero2 ==0){
            System.out.println("No se puede dividir por 0");
            return 0;
            
        } else {
             multiplicar = numero1 * numero2;
             return multiplicar;
    }
    }
    
    public int dividir(){
        if(numero1 ==0 || numero2==0){
            System.out.println("No se puede dividir por 0");
            return 0;
        } else {
            dividir = numero1 / numero2;
            return dividir; 
        }
            
       
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", suma=" + suma + ", resta=" + resta + ", multiplicar=" + multiplicar + ", dividir=" + dividir + '}';
    }
    
    
    
}
