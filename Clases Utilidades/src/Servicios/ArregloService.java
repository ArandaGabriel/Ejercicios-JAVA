package Servicios;

import java.util.Arrays;

public class ArregloService {

    
    
    public void inicializarA(double[] A){
        
        for (int i = 0; i < 50 ; i++) {
            
            A[i] = Math.random();   
        }
    }
    
    public void mostrar(double[] A){
        
        for (int i = 0; i < 50; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.println("");
        System.out.println("");
    }
    
    public void ordenar(double[] A){
        
        Arrays.sort(A);
        
        for (int i = 0; i < 50; i++) {
            
            A[i] = A[49-i];
            
        }
    }
    
    public void inicializarB(double[] A, double[] B){
    
        for (int i = 0; i < 10; i++) {
            B[i] = A[i];
        }
        
        for (int i = 0; i < 10; i++) {
            B[10+i] = 0.5;
        }
    }
    
    public void mostrarAyB(double[] A, double[] B){
        
        System.out.println("El arreglo A:");
        for (int i = 0; i < 50; i++) {    
            System.out.println(A[i]);
        }
        System.out.println("");
        System.out.println("El arreglo B:");
        for (int i = 0; i < 20; i++) {
            System.out.println(B[i]);
        }
           
            
        }
}
    
    
    

