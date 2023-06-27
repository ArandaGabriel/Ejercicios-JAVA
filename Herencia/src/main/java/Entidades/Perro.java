package Entidades;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    
    
    @Override
    public void alimentarse(){
        System.out.println("Soy un perro y me estoy alimentando." );
    }
    
}
