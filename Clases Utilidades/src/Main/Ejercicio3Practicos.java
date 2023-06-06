package Main;


import Servicios.ArregloService;

public class Ejercicio3Practicos {

    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        //Arrays A1 = new Arrays(arregloA, arregloB);
        ArregloService AS1 = new ArregloService();
        
        AS1.inicializarA(arregloA);
        AS1.mostrar(arregloA);
        AS1.ordenar(arregloA);
        AS1.inicializarB(arregloA, arregloB);
        AS1.mostrarAyB(arregloA, arregloB);
        
        
    }

}


