package Servicio;

import java.util.List;

import Entidad.Cancion;
import Interfaz.Reproductor;



public class ReproductorCancion implements Reproductor {

    @Override
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo la canción: " + cancion.getTitulo());
    }

    @Override
    public void pausar(Cancion cancion) {
        System.out.println("Pausando la canción: " + cancion.getTitulo());
    }

    @Override
    public void mostrarCanciones(list<Cancion> canciones) {
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
    public void agregarCancion(list<Cancion> canciones, Cancion cancion) {
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
                System.out.println("Canción encontrada: ");
                c.mostrarInfo();
               return;
            }
        }
       
            System.out.println("Canción no encontrada.");
        }
    }


