package pelicula;

/**
 *
 * @author axeli
 */
public class Pelicula {

    private String titulo, genero, creador;
    private boolean visto;
    private int year, duracion;

    public Pelicula() {
        this.titulo = "default";
        this.creador = "default";
        this.genero = "default";
        this.year = 0;
        this.duracion = 0;
        this.visto = false;
    }

    public Pelicula(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        genero = "default";
        year = 0;
        duracion = 0;
        visto = false;
    }

    public Pelicula(String titulo, String genero, String creador, int year, int duracion) {
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String toString() {

        return ""; //modificar
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}

class Serie extends Pelicula {

    private int noTemporadas;

    public Serie() {
        super(); // accede al constructor de la clase Pelicula
        noTemporadas = 1;
    }

    public Serie(String titulo, String creador) {
        super(titulo, creador);
        noTemporadas = 1;
    }

    public Serie(String titulo, String genero, String creador, int year, int duracion, int noTemporadas) {
        super(titulo, genero, creador, year, duracion);
        this.noTemporadas = noTemporadas;
    }

    public String toString() {
        return super.toString();
    }

    // Getters and Setters
    public int getNoTemporadas() {
        return noTemporadas;
    }

    public void setNoTemporadas(int noTemporadas) {
        this.noTemporadas = noTemporadas;
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    @Override
    public String getGenero() {
        return super.getGenero();
    }

    @Override
    public void setGenero(String genero) {
        super.setGenero(genero);
    }

    @Override
    public String getCreador() {
        return super.getCreador();
    }

    @Override
    public void setCreador(String creador) {
        super.setCreador(creador);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public int getDuracion() {
        return super.getDuracion();
    }

    @Override
    public void setDuracion(int duracion) {
        super.setDuracion(duracion);
    }
}
