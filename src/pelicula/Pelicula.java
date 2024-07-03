package pelicula;

/**
 *
 * @author axeli
 */
public class Pelicula {

    private String titulo, genero, creador, year, duracion;
    private boolean visto;

    public Pelicula() {
        this.titulo = "default";
        this.creador = "default";
        this.genero = "default";
        this.year = "default";
        this.duracion = "default";
        this.visto = false;
    }

    public Pelicula(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        genero = "default";
        year = "default";
        duracion = "default";
        visto = false;
    }

    public Pelicula(String titulo, String genero, String creador, String year, String duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.year = year;
        this.duracion = duracion;
        this.visto = false;
    }

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String toString(){

        return ""; //modificar
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
