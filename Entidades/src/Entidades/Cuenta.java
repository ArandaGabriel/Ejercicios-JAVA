package Entidades;

import java.util.Scanner;



public class Cuenta {
    
 int saldo;
 String titular;
 int extraccion;
 

 public Cuenta () {
 }

    public Cuenta (int saldo, String titular, int extraccion) { 
        this.saldo = saldo;
        this.titular = titular;
        this.extraccion = extraccion;
    }    

   public void RetirarDinero() {
    Scanner leer = new Scanner(System.in);
   
   
   System.out.println("Ingrese su saldo actual");
   saldo = leer.nextInt();
   System.out.println("Ingrese el importe a retirar");
   extraccion = leer.nextInt();
       if (saldo > extraccion) {
         System.out.println("Ud retiró : " +extraccion );
         System.out.println("Su nuevo saldo es : " +(saldo - extraccion));
       } 
        if   (saldo < extraccion || saldo <= 0) {
       System.out.println("Lo sentimos su saldo es insuficiente");      
      
   
     
    }
   }
}
