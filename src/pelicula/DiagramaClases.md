```
classDiagram
    class Pelicula {
        -titulo: String
        -genero: String
        -creador: String
        -visto: boolean
        -year: int
        -duracion: int
        +Pelicula()
        +Pelicula(titulo: String, creador: String)
        +Pelicula(titulo: String, genero: String, creador: String, year: int, duracion: int)
        +getTitulo(): String
        +setTitulo(titulo: String): void
        +getGenero(): String
        +setGenero(genero: String): void
        +getCreador(): String
        +setCreador(creador: String): void
        +getYear(): int
        +setYear(year: int): void
        +getDuracion(): int
        +setDuracion(duracion: int): void
        +toString(): String
        +marcarVisto(): void
        +esVisto(): boolean
        +tiempoVisto(): int
    }

    class Serie {
        -noTemporadas: int
        +Serie()
        +Serie(titulo: String, creador: String)
        +Serie(titulo: String, genero: String, creador: String, year: int, noTemporadas: int, duracion: int)
        +getNoTemporadas(): int
        +setNoTemporadas(noTemporadas: int): void
        +toString(): String
    }

    class Visualizable<<interface>> {
        +marcarVisto(): void
        +esVisto(): boolean
        +tiempoVisto(): int
    }

    Pelicula ..|> Visualizable : implements
    Serie --|> Pelicula : extends

```