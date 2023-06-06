package Main;

import Entidades.Persona;
import Servicios.PersonaServicios;

public class Ejercicio3Practico {

    public static void main(String[] args) {
        
        
        PersonaServicios PS = new PersonaServicios();
        
        System.out.println("Ingrese los datos de la Persona n°1:");
        Persona P1 = PS.crearPersona();
        System.out.println("");
        System.out.println("Ingrese los datos de la Persona n°2:");
        Persona P2 = PS.crearPersona();
        System.out.println("");
        System.out.println("Ingrese los datos de la Persona n°3:");
        Persona P3 = PS.crearPersona();
        System.out.println("");
        System.out.println("Ingrese los datos de la Persona n°4:");
        Persona P4 = PS.crearPersona();
        System.out.println("");
        
        
       // System.out.println(P1.toString());
        
                
        if(PS.esMayorDeEdad(P1.getEdad())==true){
            System.out.println("La persona 1 es mayor de edad.");
        } else {
            System.out.println("La persona 1 NO es mayor de edad.");
        }
        
        if(PS.esMayorDeEdad(P2.getEdad())==true){
            System.out.println("La persona 2 es mayor de edad.");
        } else {
            System.out.println("La persona 2 NO es mayor de edad.");
        }
        
        if(PS.esMayorDeEdad(P3.getEdad())==true){
            System.out.println("La persona 3 es mayor de edad.");
        } else {
            System.out.println("La persona 3 NO es mayor de edad.");
        }
        
        if(PS.esMayorDeEdad(P4.getEdad())==true){
            System.out.println("La persona 4 es mayor de edad.");
        } else {
            System.out.println("La persona 4 NO es mayor de edad.");
        }
        
        switch (PS.calcularIMC(P1.getPeso(), P1.getAltura())) {
            case -1:
                System.out.println("La persona 1 está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("La persona 1 está en su peso ideal.");
                break;
            case 1:
                System.out.println("La persona 1 tiene sobrepeso.");
                break;
            default:
                break;
        }
        
        switch (PS.calcularIMC(P2.getPeso(), P2.getAltura())) {
            case -1:
                System.out.println("La persona 2 está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("La persona 2 está en su peso ideal.");
                break;
            case 1:
                System.out.println("La persona 2 tiene sobrepeso.");
                break;
            default:
                break;
        }
        
        switch (PS.calcularIMC(P3.getPeso(), P3.getAltura())) {
            case -1:
                System.out.println("La persona 3 está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("La persona 3 está en su peso ideal.");
                break;
            case 1:
                System.out.println("La persona 3 tiene sobrepeso.");
                break;
            default:
                break;
        }
        
        switch (PS.calcularIMC(P4.getPeso(), P4.getAltura())) {
            case -1:
                System.out.println("La persona 4 está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("La persona 4 está en su peso ideal.");
                break;
            case 1:
                System.out.println("La persona 4 tiene sobrepeso.");
                break;
            default:
                break;
        }
        

        int[] IMC = new int[4];
        int[] mayorEdad = new int[4];
        int mEdad = 0;
        int MEdad = 0;
        int debPeso = 0;
        int pIdeal = 0;
        int sobrep = 0;
        
        IMC[0] = PS.calcularIMC(P1.getPeso(), P1.getAltura());
        IMC[1] = PS.calcularIMC(P2.getPeso(), P2.getAltura());
        IMC[2] = PS.calcularIMC(P3.getPeso(), P3.getAltura());
        IMC[3] = PS.calcularIMC(P4.getPeso(), P4.getAltura());
        
        if(PS.esMayorDeEdad(P1.getEdad())==true){
            mayorEdad[0]=1;
        } else {
            mayorEdad[0]=0;
        }
        
        if(PS.esMayorDeEdad(P2.getEdad())==true){
            mayorEdad[1]=1;
        } else {
            mayorEdad[1]=0;
        }
        
        if(PS.esMayorDeEdad(P3.getEdad())==true){
            mayorEdad[2]=1;
        } else {
            mayorEdad[2]=0;
        }
        
        if(PS.esMayorDeEdad(P4.getEdad())==true){
            mayorEdad[3]=1;
        } else {
            mayorEdad[3]=0;
        }
        
        for (int i = 0; i < 4; i++) {
            if(mayorEdad[i]==0){
            mEdad +=1;
        } else {
            MEdad +=1;
        }
        }
        
        for (int i = 0; i < 4; i++) {
            if (IMC[i]==1) {
                sobrep += 1;
            } else if (IMC[i] ==0) {
                pIdeal += 1;
            } else {
                debPeso +=1;
            }
                
        }
        
        System.out.println("El porcentaje de mayores del grupo de personas es: " + MEdad*100/4 + "%. Y el porcentaje de menores del grupo es: " + mEdad*100/4 + "%.");
        System.out.println("El porcentaje de personas que están por debajo de su peso es: " + debPeso*100/4 + "%. El porcentaje de personas que están en su peso ideal es: " + pIdeal*100/4 + "%. Y el porcentaje de personas que están con sobrepeso es: " + sobrep*100/4 + "%.");
        
    }

}
