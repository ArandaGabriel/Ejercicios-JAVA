package entidad;

import java.util.Comparator;

public class Pelicula {

    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duración=" + duracion + '}';
    }
    
    public static Comparator <Pelicula> compararDuracion = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2){
            return pelicula2.getDuracion().compareTo(pelicula1.getDuracion());
                    
                    }
    };
    
    public static Comparator <Pelicula> compararTitulo = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2){
            return pelicula1.getTitulo().compareTo(pelicula2.getTitulo());
                    
                    }
    };
    
    public static Comparator <Pelicula> compararDirector = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2){
            return pelicula1.getDirector().compareTo(pelicula2.getDirector());
                    
                    }
    };
    
}
