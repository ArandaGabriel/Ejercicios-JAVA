package Main;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

public class Ejercicio2Practico {

    public static void main(String[] args) {
        
        ParDeNumerosService PDNS1 = new ParDeNumerosService();
        ParDeNumeros Par = new ParDeNumeros();
        
        
        PDNS1.mostrarValores(Par.getNum1(), Par.getNum2());
        PDNS1.devolverMayor(Par.getNum1(), Par.getNum2());
        PDNS1.calcularPotencia(Par.getNum1(), Par.getNum2());
        PDNS1.calculaRaiz(Par.getNum1(), Par.getNum2());
        
        
    }

}
