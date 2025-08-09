#  Proyecto Java – **Reto: Gestor de Biblioteca de Videojuegos** 

##  Descripción del Proyecto

¡Bienvenido al reto definitivo para amantes del código y los videojuegos!  
Tu misión es construir una aplicación tipo consola que permita al usuario gestionar su **biblioteca personal de videojuegos**, crear **colecciones temáticas**, y buscar juegos por categoría o plataforma.

Esta aplicación deberá estar organizada en capas (entidad, interfaz, servicio y vista), utilizar exclusivamente `List`, y aplicar todos los principios de programación orientada a objetos que has aprendido.

---

##  Estructura del Proyecto

Organiza tu código en los siguientes paquetes:

src/
├── entidad/
│ ├── Videojuego.java
│ └── ColeccionJuegos.java

├── interfaz/
│ ├── GestorJuegos.java
│ └── GestorColecciones.java

├── servicio/
│ ├── GestorJuegosImpl.java
│ └── GestorColeccionesImpl.java

└── app/
└── Principal.java


---

##  Clases y Funcionalidades Requeridas

###  `entidad.Videojuego`

- Atributos:
  - `String titulo`
  - `String genero` (ej: aventura, RPG, shooter)
  - `String plataforma` (ej: PC, PlayStation, Xbox, Switch)
  - `int horasJuego`

- Métodos:
  - Getters y setters
  - `mostrarInfo()`: imprime los datos del videojuego

---

###  `entidad.ColeccionJuegos`

- Atributos:
  - `String nombreColeccion`
  - `List<Videojuego> juegos`

- Métodos:
  - `agregarJuego(Videojuego juego)`
  - `eliminarJuegoPorTitulo(String titulo)`
  - `mostrarColeccion()`

---

###  `interfaz.GestorJuegos`

- Métodos:
  - `void agregarJuego(List<Videojuego> biblioteca, Videojuego juego)`
  - `void eliminarJuego(List<Videojuego> biblioteca, String titulo)`
  - `void mostrarBiblioteca(List<Videojuego> biblioteca)`
  - `void buscarPorGenero(List<Videojuego> biblioteca, String genero)`
  - `void buscarPorPlataforma(List<Videojuego> biblioteca, String plataforma)`

---

###  `interfaz.GestorColecciones`

- Métodos:
  - `void crearColeccion(List<ColeccionJuegos> colecciones, String nombre)`
  - `void agregarJuegoAColeccion(List<ColeccionJuegos> colecciones, String nombreColeccion, Videojuego juego)`
  - `void mostrarColecciones(List<ColeccionJuegos> colecciones)`
  - `void mostrarJuegosEnColeccion(List<ColeccionJuegos> colecciones, String nombreColeccion)`

---

###  `servicio.GestorJuegosImpl`
- Implementa `GestorJuegos` con la lógica respectiva

###  `servicio.GestorColeccionesImpl`
- Implementa `GestorColecciones` y administra colecciones usando solo `List`

---

###  `app.Principal`

El menú principal debe ofrecer estas opciones al usuario:

1. Agregar videojuego a la biblioteca  
2. Mostrar toda la biblioteca  
3. Buscar juegos por género o plataforma  
4. Eliminar juego por título  
5. Crear colección de juegos  
6. Agregar juego a una colección  
7. Ver todas las colecciones  
8. Ver juegos dentro de una colección  
9. Salir del programa

---

##  Requisitos Técnicos

- Separar las capas adecuadamente
- Validación básica de entradas del usuario
- Código organizado y comentado
- Estilo limpio, claro y comprensible

---

##  Retos Opcionales

- Ordenar los juegos por número de horas jugadas (de mayor a menor)
- Mostrar estadísticas por colección (cantidad de juegos, horas totales)
- Crear un modo "Top 3 juegos más jugados"

---

##  Objetivos de Aprendizaje


- Reforzar la arquitectura modular en Java
- Implementar una interfaz con múltiples implementaciones
- Crear aplicaciones organizadas, escalables y mantenibles

---

¡Sube de nivel como programador y completa este desafío!  
 ¡Que empiece la partida!

