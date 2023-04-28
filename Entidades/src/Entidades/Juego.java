package Entidades;

import java.util.Scanner;

public class Juego {

    public int num1, num2;
    
    public void iniciar_juego(){
        
        Scanner leer = new Scanner(System.in);
        
        int i=0, j=0, k=1, G1=0, G2=0;
        String rta;
        
        while(k==1) {
        
        System.out.println("Ingrese un número el jugador 1:");
         
        num1 = leer.nextInt();
         
        System.out.println("Ahora el número 2 intente adivinarlo. Tiene 5 intentos: ");
              
        do{
            
            num2 = leer.nextInt();
            
            if(num2 != num1){
                if(num2 > num1 && i<4     ){
                    System.out.println("Más bajo!");
                } else if (num2 < num1 && i<4) {
                    System.out.println("Más alto");
                }
                
            } else j=1;
            
            i += 1;
          
            
        } while (i!=5 && j!=1);
        
        if(num2 ==num1){
            System.out.println("Felicitaciones! Usted ha ganado en el intento n°:  " + i);
            G2+=1;
        } else if (num1 != num2){
            System.out.println("Ha perdido!");
            G1+=1;
        }
        
            System.out.println("Desea seguir jugando? (s/n):");
            rta = leer.next();
            
            if (rta.equalsIgnoreCase("n")) {
                k=0;
            } else if (rta.equalsIgnoreCase("s")){
             i=0;
             j=0;
            }
        
        }
        
        System.out.println("Gracias por jugar a este juego! Vuelva pronto.");
        System.out.println("El jugador 1 ganó: " + G1 + " veces. Y el ganador 2 ganó: " + G2 + " veces.");
    }
        
}
