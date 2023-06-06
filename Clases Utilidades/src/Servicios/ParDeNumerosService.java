package Servicios;

public class ParDeNumerosService {

        
    public void mostrarValores(double num1, double num2){
        System.out.println("El número 1 es: " + num1);
        System.out.println("El número 2 es: " + num2);
    } 
    
    public void devolverMayor(double num1, double num2){
        
        if(num1 > num2){
            System.out.println("El mayor de los dos números es: " + num1);
        } else if (num1<num2){
            System.out.println("El mayor de los dos números es: " + num2);
        } else { 
            System.out.println("Los números son iguales.");
        }
    }
    
    public void calcularPotencia(double num1, double num2){
        
        if(num1 >= num2){
            double pot = Math.pow(Math.round(num1), Math.round(num2));
            System.out.println("El resultado de la potencia es: " + pot);
            
        } else if (num1<num2){
            double pot = Math.pow(Math.round(num2), Math.round(num1));
            System.out.println("El resultado de la potencia es: " + pot);
        } 
    }
    
    public void calculaRaiz(double num1, double num2){
        if(num1 <= num2){
            double raiz = Math.sqrt(Math.abs(num1));
            System.out.println("El resultado de la raiz cuadrada es: " + raiz);
            
        } else if (num1 > num2){
            double raiz = Math.sqrt(Math.abs(num2));
            System.out.println("El resultado de la raiz cuadrada es: " + raiz);
        } 
    }
        
        
        
    
 
    
    
    
}
