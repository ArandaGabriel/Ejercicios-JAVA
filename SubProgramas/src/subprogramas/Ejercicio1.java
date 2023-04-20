package subprogramas;

import java.util.Scanner;

public class Ejercicio1 {
  
    
    public static void main(String[] args) {
  
        Scanner leer = new Scanner(System.in);
         
        System.out.println("Ingrese dos valores enteros positivos");
        
        int num1 =leer.nextInt(), num2=leer.nextInt();
        
        operaciones(num1,num2);
        
        
        
    }
    
    
    public static void operaciones(int num1, int num2) {
        
        Scanner leer = new Scanner(System.in);
        
        int opcion, i=0;
        double division = num1/num2;
        String respuesta;
        
        
        do {
                
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija opción");
        
        opcion = leer.nextInt();
        
        switch (opcion){
            case 1: System.out.println("La suma de ambos números es: " + 
                    (num1+num2));
            break;
            case 2: System.out.println("La resta de ambos números es: " + 
                    (num1-num2));
            break;
            case 3: System.out.println("La multiplicación de ambos números es: " 
                    + (num1*num2));
            break;
            case 4: System.out.println("La división de ambos números es: " + 
                    division);
            break;
            case 5: System.out.println("¿Está seguro que desea salir del "
                    + "programa (s/n)?");
            respuesta = leer.next();
            
            if (respuesta.equalsIgnoreCase("s")){
                i=1;
            }
            break;
        }
        
        } while (i!=1);
        
        System.out.println("Gracias. Vuelva pronto.");

        
        
    }
    
}
