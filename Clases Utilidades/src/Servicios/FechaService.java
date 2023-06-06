package Servicios;


import java.util.Date;
import java.util.Scanner;


public class FechaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNacimiento(){
        
        System.out.println("Ingrese un día: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese un mes: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese un anio: ");
        int anio = leer.nextInt();
        //GregorianCalendar Cal = new GregorianCalendar();
        Date fecha = new Date(anio,mes,dia);
        long fec= fecha.getTime();
        
        System.out.println(fecha);
        System.out.println(fec);
        
        return fecha;
    }
    
    public Date fechaActual(){
        
        //GregorianCalendar Cal2 = new GregorianCalendar();
        Date fechaActual = new Date();
        long fec2 = fechaActual.getTime();
        
        System.out.println(fechaActual);
        System.out.println(fec2);
        
        //Cal2.setTime(fechaActual);
        
        return fechaActual;
    }
    
    public void diferencia(long fec2, long fec1){
        
        long fec3 = fec2-fec1;
         
        System.out.println(fec3);
                
        Date fechaD = new Date ();
        fechaD.setTime(fec3);
        
        System.out.println("La diferencia entre las dos fechas es:" + fechaD);
    }
    
    
    
}
