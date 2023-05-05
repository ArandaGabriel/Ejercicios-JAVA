package Main;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class Ejercicio1Practico {

    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
        
    CuentaBancariaServicio CBS1 = new CuentaBancariaServicio();
    CuentaBancaria CB1 = new CuentaBancaria();
    
    CBS1.crearCuenta();
    CBS1.ingresarCuenta(CB1.getSaldoActual());
    CBS1.consultarSaldo(CB1.getSaldoActual());
    
    
            
                
     
        
        

        
        
    }

}
