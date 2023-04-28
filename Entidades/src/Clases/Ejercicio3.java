package Clases;

import Entidades.Operacion;

public class Ejercicio3 {

    public static void main(String[] args) {
        
    Operacion Op = new Operacion(200, 300);
    
    Op.sumar();
    Op.restar();
    Op.multiplicar();
    Op.dividir();
    
    System.out.println(Op);
    
    
}
}