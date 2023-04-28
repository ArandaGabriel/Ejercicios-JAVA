package Clases;

import Entidades.Empleado;

public class Ejercicio5Extra {

    public static void main(String[] args) {
        
        Empleado E1 = new Empleado("Gabriel", 31, 150000);
        
        E1.calcular_aumento();
        
        System.out.println(E1.toString());
        
    }

}
