
import java.util.ArrayList;

/**
 *
 * @author axeli
 */
/**
 * Este programa representa una aplicación de visualización de películas y
 * series. La clase Pelicula implementa la interfaz Visualizable y representa
 * una película con atributos como título, género, creador, año y duración. La
 * clase Serie extiende la clase Pelicula y agrega el atributo noTemporadas para
 * representar el número de temporadas de una serie. La interfaz Visualizable
 * define los métodos marcarVisto(), esVisto() y tiempoVisto() que deben ser
 * implementados por las clases que la implementan. El programa crea un arreglo
 * de películas y un arreglo de series, y luego marca las primeras 3 películas y
 * series como vistas. Luego muestra las películas y series vistas, y encuentra
 * la serie con más temporadas y la película más reciente.
 */
public class Pelicula implements Visualizable {

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
        return "Título: " + titulo + "\nGénero: " + genero + "\nCreador: " + creador + "\nAño: " + year + "\nDuración: " + duracion + " minutos";
    }

    @Override
    public void marcarVisto() {
        this.visto = true;
    }

    @Override
    public boolean esVisto() {
        return this.visto;
    }

    @Override
    public int tiempoVisto() {
        return this.duracion;
    }

    // -----------------Main  -------------------
    public static void main(String[] args) {

        try {
            ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
            ArrayList<Serie> series = new ArrayList<Serie>();

            peliculas.add(new Pelicula("Titanic", "Drama", "James Cameron", 1997, 195));
            peliculas.add(new Pelicula("El Padrino", "Drama", "Francis Ford Coppola", 1972, 175));
            peliculas.add(new Pelicula("El Señor de los Anillos", "Fantasía", "Peter Jackson", 2001, 178));
            peliculas.add(new Pelicula("Harry Potter", "Fantasía", "J.K. Rowling", 2001, 152));
            peliculas.add(new Pelicula("El Rey León", "Animación", "Roger Allers", 1994, 88));

            series.add(new Serie("Breaking Bad", "Drama", "Vince Gilligan", 2008, 5, 62));
            series.add(new Serie("Game of Thrones", "Fantasía", "David Benioff", 2011, 8, 60));
            series.add(new Serie("The Walking Dead", "Drama", "Frank Darabont", 2010, 10, 45));
            series.add(new Serie("Stranger Things", "Ciencia Ficción", "Hermanos Duffer", 2016, 3, 50));
            series.add(new Serie("Black Mirror", "Ciencia Ficción", "Charlie Brooker", 2011, 5, 60));

            for (int i = 0; i < 3; i++) {
                peliculas.get(i).marcarVisto(); // nada mas marcara como visto las primeras 3 peliculas
                series.get(i).marcarVisto(); // nada mas marcara como visto las primeras 3 series
            }

            System.out.println("-------Películas visualizadas:");
            for (Pelicula pelicula : peliculas) {
                if (pelicula.esVisto()) {
                    System.out.println("- " + pelicula.toString() + " (Vista)");
                } else {
                    System.out.println("- " + pelicula.toString() + " (No vista)");
                }
                System.out.println();
            }

            System.out.println();

            System.out.println("-------Series visualizadas:");
            for (Serie serie : series) {
                if (serie.esVisto()) {
                    System.out.println("- " + serie.toString() + " (Vista)" + " \nTemporadas: " + serie.getNoTemporadas());
                } else {
                    System.out.println("- " + serie.toString() + " (No vista)" + " \nTemporadas: " + serie.getNoTemporadas());
                }
                System.out.println();
            }

            // buscar la serie con mas temporadas
            Serie serieMasTemporadas = series.get(0);
            for (int i = 1; i < series.size(); i++) {
                if (series.get(i).getNoTemporadas() > serieMasTemporadas.getNoTemporadas()) {
                    serieMasTemporadas = series.get(i);
                }
            }

            // buscar la pelicula mas reciente
            Pelicula peliculaMasReciente = peliculas.get(0);
            for (int i = 1; i < peliculas.size(); i++) {
                if (peliculas.get(i).getYear() > peliculaMasReciente.getYear()) {
                    peliculaMasReciente = peliculas.get(i);
                }
            }

            System.out.println("\n-------Serie con más temporadas:");
            System.out.println(serieMasTemporadas.toString() + " \nTemporadas: " + serieMasTemporadas.getNoTemporadas());

            System.out.println("\n-------Película del año más reciente:");
            System.out.println(peliculaMasReciente.toString());
        } catch (Exception e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
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

    public Serie(String titulo, String genero, String creador, int year, int noTemporadas, int duracion) {
        super(titulo, genero, creador, year, duracion);
        this.noTemporadas = noTemporadas;
    }

    @Override
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

    @Override
    public void marcarVisto() {
        super.marcarVisto();
    }

    @Override
    public boolean esVisto() {
        return super.esVisto();
    }

    @Override
    public int tiempoVisto() {
        return super.tiempoVisto();
    }
}

interface Visualizable {

    public void marcarVisto();

    public boolean esVisto();

    public int tiempoVisto();

}
