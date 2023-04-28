package Entidades;

public class Cancion {

    public String titulo;
    public String autor;
    
    
    public Cancion(){
        this.titulo = " ";
        this.autor = " ";
    }
    
    public Cancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = titulo;
           
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

 
      
}
