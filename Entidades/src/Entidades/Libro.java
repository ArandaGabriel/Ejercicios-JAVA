package Entidades;

public class Libro {
    
    public int ISBN, numeroPaginas;
    public String nombre, autor;
    
    public Libro(){
    }

    public Libro(int ISBN, int numeroPaginas, String nombre, String autor) {
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.nombre = nombre;
        this.autor = autor;
    }
    
    
}
