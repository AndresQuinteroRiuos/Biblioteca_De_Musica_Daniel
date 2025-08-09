import java.util.ArrayList;
import java.util.Scanner;

import Entidad.Cancion;
import Interfaz.Reproductor;
import Servicio.ReproductorCancion;

import java.util.List;


public class Principal {
    public static void main(String[] args)  {
   
        Scanner sc = new Scanner(System.in);
        List<Cancion> canciones = new ArrayList<>(); 
        Reproductor  reproductor = new ReproductorCancion();
      
        Boolean continuar = true;


        while (continuar) {
            System.out.println("\n =========================  ");
            System.out.println("\n ===||Menu biblioteca||===  ");
            System.out.println("\n =========================  ");
            System.out.println("1. Agregar cancion");
            System.out.println("2. Mostrar canciones");
            System.out.println("3. Buscar cancion");
            System.out.println("4. Eliminar cancion");
            System.out.println("5. Reproducir cancion");
            System.out.println("6. pausar cancion");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opcion: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                   
                     System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    reproductor.agregarCancion(canciones, new Cancion(titulo, artista, duracion));
                   
                    break;
                case 2:
                    reproductor.mostrarCanciones(canciones);
                    break;
                case 3:
                    System.out.print("Título de canción a buscar: ");
                    String buscar = sc.nextLine();
                    reproductor.buscarCancion(canciones, buscar);
                    break;
                case 4:
                    System.out.print("Título a eliminar: ");
                    String eliminar = sc.nextLine();
                    reproductor.eliminarCancion(canciones, eliminar);
                    break;
                case 5:
                    System.out.print("numero de la cancion a reproducir: ");
                    int n1 = sc.nextInt();
                    if ( n1 >0 && n1 <= canciones.size()) {
                        reproductor.reproducir(canciones.get(n1 - 1));
                    } else {
                        System.out.println("Cancion no encontrada");
                    }
                    break;
                    
                case 6:
                    System.out.print("Numero de la cancion : ");
                    int n2 = sc.nextInt();
                    if ( n2 >0 && n2 <= canciones.size()) {
                        reproductor.pausar(canciones.get(n2 - 1));
                    } else {
                        System.out.println("Cancion no encontrada");
                    }
                    break;
                    
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    
            }
        }

        sc.close();
        System.out.println("gracias por usar la aplicacion");
    }
}