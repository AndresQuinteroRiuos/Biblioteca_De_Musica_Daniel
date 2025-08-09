package interfaz;

import java.util.List;

import entidad.Cancion;

public interface Reproductor {

Void reproducir(Cancion cancion);
Void pausar(Cancion cancion);
Void mostrarCanciones(list<Cancion> canciones);
void agregarCancion(list<Cancion> canciones, Cancion cancion);
Void eliminarCancion(list<Cancion> canciones, String titulo);
Void buscarCancion(list<Cancion> canciones, String titulo);

}
