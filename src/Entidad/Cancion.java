package Entidad;

public class Cancion {

    private String titulo;
    private String artista;
    private int duracion;
    
    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Cancion [titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + "]";
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void mostrarInfo() {
        System.out.println(
            "Titulo: " + titulo + 
            ", Artista: " + artista + 
            ", Duracion: (" + duracion + "s)"
        );
    }
}
