package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in);
    
    
    public CuentaBancaria crearCuenta(){
        
        System.out.println("Ingrese su número de cuenta:");
        int numeroCuenta = leer.nextInt();
        
        System.out.println("Ingrese su Dni:");
        long dniCliente = leer.nextInt();
        
        System.out.println("Ingrese su saldo actual en la cuenta:");
        int saldoActual = leer.nextInt();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual); 
        
        
        
    }
    
    
    public void ingresarCuenta(int saldoActual){
        System.out.println("Ingrese la cantidad de dinero que desea ingresar:");
        int ingresoSaldo = leer.nextInt();
        saldoActual += ingresoSaldo;
    }
   
    
    public void retirarCuenta(int saldoActual){
        System.out.println("Ingrese la cantidad de dinero que desea retirar:");
        int retirarSaldo = leer.nextInt();
        
        if (retirarSaldo > saldoActual){
            retirarSaldo = saldoActual;
        }
        saldoActual -= retirarSaldo;
    }
    
    
    public void extraccionRapida(int saldoActual){
        System.out.println("Ingrese la cantidad de dinero que desea retirar de manera rápida:");
        int retirarSaldo = leer.nextInt();
        
        if (retirarSaldo <= saldoActual*0.20){
            saldoActual -= retirarSaldo;
        } else if (retirarSaldo > saldoActual*0.20){
            System.out.println("No se puede retirar tal cantidad de dinero en el modo Extracción Rápida");
        }
    }
    
    
    public void consultarSaldo(int saldoActual){
        System.out.println("Su saldo actual en la cuenta es:" + saldoActual);
    }
    
    
    public void consultarDatos(int numeroCliente, int dniCliente, int saldoActual){
        System.out.println("Su número de Cliente es: " + numeroCliente + ". Su DNI es: " + dniCliente + ". Su saldo Actual es: " + saldoActual + ".");
    }
    
    
    
    
    
}
