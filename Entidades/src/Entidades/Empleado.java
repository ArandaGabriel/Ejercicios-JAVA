package Entidades;

public class Empleado {

    public String nombre;
    public int edad;
    public double salario;    

public Empleado(String nombre, int edad, double salario){
    this.nombre=nombre;
    this.edad=edad;
    this.salario=salario;
            
    
}

public double calcular_aumento(){
    
    if(edad>30){
        this.salario = salario*1.10;  
        return salario;
    } else if (edad<30){
        this.salario = salario*1.05;
        return salario;
    }
        return 0;
}

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario= $" + salario + '}';
    }


    
    
}


