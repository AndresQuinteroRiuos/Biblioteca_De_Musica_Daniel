package Servicio;

import Entidad.Cancion;
import Interfaz.Reproductor;
import java.util.List;



public class ReproductorCancion implements Reproductor {

    @Override
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo la cancioon: " + cancion.getTitulo());
    }

    @Override
    public void pausar(Cancion cancion) {
        System.out.println("Pausando la cancion: " + cancion.getTitulo());
    }

    @Override
    public void mostrarCanciones(List<Cancion> canciones) {
        if ( canciones.isEmpty()) {
            System.out.println("No hay canciones disponibles.");
            
        }else{
        
         for (int i=0; i<canciones.size(); i ++){
            System.out.println( ( i+ 1) + ". " );
            canciones.get(i).mostrarInfo();
        }
    }
    }

    @Override
    public void agregarCancion(List<Cancion> canciones, Cancion cancion) {
        canciones.add(cancion);
        System.out.println("Canción agregada: " + cancion.getTitulo());
    }

    @Override
    public void eliminarCancion(List<Cancion> canciones, String titulo) {
       canciones.removeIf(c -> c.getTitulo().equalsIgnoreCase(titulo));
       System.out.println("Canción eliminada: " );
    }

    @Override
    public void buscarCancion(List<Cancion> canciones, String titulo) {
        
        for (Cancion c : canciones) {
            if (c.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Cancion encontrada: ");
                c.mostrarInfo();
               return;
            }
        }
       
            System.out.println("Cancion no encontrada.");
        }
    }
