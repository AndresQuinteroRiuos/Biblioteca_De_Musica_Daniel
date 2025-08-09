package Interfaz;

import java.util.List;

import Entidad.Cancion;

public interface Reproductor {

    void reproducir(Cancion cancion);
    void pausar(Cancion cancion);
    void mostrarCanciones(List<Cancion> canciones);
    void agregarCancion(List<Cancion> canciones, Cancion cancion);
    void eliminarCancion(List<Cancion> canciones, String titulo);
    void buscarCancion(List<Cancion> canciones, String titulo);

}
