/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaej1.servicio;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import jpaej1.entidades.Autor;
import jpaej1.entidades.Editorial;
import jpaej1.entidades.Libro;

/**
 *
 * @author user
 */
public class LibroServicio {

    private EntityManagerFactory emf;

    public LibroServicio() {
        emf = Persistence.createEntityManagerFactory("JPAEj1PU");
    }

    public void crearLibro() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el ISBN del libro: ");
            long isbn = scanner.nextLong();
            if (em.find(Libro.class, isbn) == null) {
                scanner.nextLine(); // Consumir la nueva línea

                System.out.print("Ingrese el título del libro: ");
                String titulo = scanner.nextLine();

                System.out.print("Ingrese el año del libro: ");
                int anio = scanner.nextInt();

                System.out.print("Cuantos ejemplares se prestaron: ");
                int prestados = scanner.nextInt();

                System.out.print("Cuantos ejemplares quedan: ");
                int restantes = scanner.nextInt();

                AutorServicio autor = new AutorServicio();

                EditorialServicio editorial = new EditorialServicio();

// Crear el objeto Libro con los datos ingresados por el usuario
                Libro libro = new Libro();
                libro.setIsbn(isbn);
                libro.setTitulo(titulo);
                libro.setAnio(anio);
                libro.setAlta(true);
                libro.setEjemplaresRestantes(restantes);
                libro.setEjemplaresPrestados(prestados);
                int ejemplares = prestados + restantes;
                libro.setEjemplares(ejemplares);

                libro.setAutor(autor.crearAutor());
                libro.setEditorial(editorial.crearEditorial());

                em.persist(libro);
                em.getTransaction().commit();
            } else {
                Libro libro2 = em.find(Libro.class, isbn);
                if (isbn == libro2.getIsbn()) {
                    System.out.println("Ese libro ya existe");
                    libro2.setEjemplares(libro2.getEjemplares() + 1);
                } else {
                    scanner.nextLine(); // Consumir la nueva línea

                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Ingrese el año del libro: ");
                    int anio = scanner.nextInt();

                    System.out.print("Cuantos ejemplares se prestaron: ");
                    int prestados = scanner.nextInt();

                    System.out.print("Cuantos ejemplares quedan: ");
                    int restantes = scanner.nextInt();

                    AutorServicio autor = new AutorServicio();
                    autor.crearAutor();

                    EditorialServicio editorial = new EditorialServicio();
                    editorial.crearEditorial();

// Crear el objeto Libro con los datos ingresados por el usuario
                    Libro libro = new Libro();
                    libro.setIsbn(isbn);
                    libro.setTitulo(titulo);
                    libro.setAnio(anio);
                    libro.setEjemplaresRestantes(restantes);
                    libro.setEjemplaresPrestados(prestados);
                    libro.setEjemplares(restantes + prestados);
                    libro.setAutor(autor.crearAutor());
                    libro.setEditorial(editorial.crearEditorial());

                    em.persist(libro);
                    em.getTransaction().commit();
                }
            }

        } finally {
            em.close();
        }
    }

    public void editarLibro() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el ISBN del libro a editar: ");
            long isbn = scanner.nextLong();
            scanner.nextLine(); // Consumir la nueva línea

            // Buscar el libro en la base de datos
            Libro libro = em.find(Libro.class, isbn);

            if (libro != null) {
                System.out.print("Ingrese el nuevo título del libro: ");
                String nuevoTitulo = scanner.nextLine();

                System.out.print("Ingrese el nuevo año del libro: ");
                int nuevoAnio = scanner.nextInt();

                // Actualizar los atributos del libro con los nuevos valores ingresados
                libro.setTitulo(nuevoTitulo);
                libro.setAnio(nuevoAnio);

                em.getTransaction().commit();
                System.out.println("El libro ha sido editado exitosamente.");
            } else {
                System.out.println("El libro con ISBN " + isbn + " no existe.");
            }
        } finally {
            em.close();
        }
    }

    public void eliminarLibro(Long isbn) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Libro libro = em.find(Libro.class, isbn);
        em.remove(libro);
        em.getTransaction().commit();
        em.close();
    }

    public Libro obtenerLibro(Long isbn) {
        EntityManager em = emf.createEntityManager();
        Libro libro = em.find(Libro.class, isbn);
        em.close();
        return libro;
    }

    // Otros métodos de consulta y operaciones CRUD
    public void cerrar() {
        emf.close();
    }

    public void buscarLibroPorNombre() {
        EntityManager em = emf.createEntityManager();

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre del libro a buscar: ");
            String nombre = scanner.nextLine();

            // Crear una consulta para buscar libros por nombre
            String jpql = "SELECT l FROM Libro l WHERE l.titulo LIKE :nombre";
            TypedQuery<Libro> query = em.createQuery(jpql, Libro.class);
            query.setParameter("nombre", "%" + nombre + "%");

            List<Libro> libros = query.getResultList();

            if (!libros.isEmpty()) {
                System.out.println("Resultados de la búsqueda:");
                libros.stream().map((libro) -> {
                    System.out.println("ISBN: " + libro.getIsbn());
                    return libro;
                }).map((libro) -> {
                    System.out.println("Título: " + libro.getTitulo());
                    return libro;
                }).map((libro) -> {
                    System.out.println("Año: " + libro.getAnio());
                    return libro;
                }).forEachOrdered((_item) -> {
                    System.out.println("-------------");
                });
            } else {
                System.out.println("No se encontraron libros con el nombre " + nombre);
            }
        } finally {
            em.close();
        }
    }

    public void buscarLibroPorNombreAutor() {
        EntityManager em = emf.createEntityManager();

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre del autor: ");
            String nombreAutor = scanner.nextLine();

            // Crear una consulta para buscar libros por nombre del autor
            String jpql = "SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombreAutor";
            TypedQuery<Libro> query = em.createQuery(jpql, Libro.class);
            query.setParameter("nombreAutor", "%" + nombreAutor + "%");

            List<Libro> libros = query.getResultList();

            if (!libros.isEmpty()) {
                System.out.println("Resultados de la búsqueda:");
                libros.stream().map((libro) -> {
                    System.out.println("ISBN: " + libro.getIsbn());
                    return libro;
                }).map((libro) -> {
                    System.out.println("Título: " + libro.getTitulo());
                    return libro;
                }).map((libro) -> {
                    System.out.println("Año: " + libro.getAnio());
                    return libro;
                }).map((libro) -> {
                    System.out.println("Autor: " + libro.getAutor().getNombre());
                    return libro;
                }).forEachOrdered((_item) -> {
                    System.out.println("-------------");
                });
            } else {
                System.out.println("No se encontraron libros del autor " + nombreAutor);
            }
        } finally {
            em.close();
        }
    }

    public void imprimirListaLibros() {
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l", Libro.class);
            List<Libro> libros = query.getResultList();

            if (!libros.isEmpty()) {
                System.out.println("Lista de libros:");
                for (Libro libro : libros) {
                    System.out.println("ISBN: " + libro.getIsbn());
                    System.out.println("Título: " + libro.getTitulo());
                    System.out.println("Año: " + libro.getAnio());
                    System.out.println("Ejemplares: " + libro.getEjemplares());
                    System.out.println("Ejemplares Prestados: " + libro.getEjemplaresPrestados());
                    System.out.println("Ejemplares Restantes: " + libro.getEjemplaresRestantes());
                    System.out.println("Alta: " + libro.getAlta());
                    System.out.println("Autor: " + libro.getAutor().getNombre());
                    System.out.println("Editorial: " + libro.getEditorial().getNombre());
                    System.out.println("------------------------");
                }
            } else {
                System.out.println("No se encontraron libros.");
            }
        } finally {
            em.close();
        }
    }

    public void buscarLibroPorNombreEditorial() {
        EntityManager em = emf.createEntityManager();
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre de la editorial: ");
            String nombreEditorial = scanner.nextLine();

            // Crear una consulta para buscar libros por nombre de la editorial
            String jpql = "SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :nombreEditorial";
            TypedQuery<Libro> query = em.createQuery(jpql, Libro.class);
            query.setParameter("nombreEditorial", "%" + nombreEditorial + "%");

            List<Libro> libros = query.getResultList();

            if (!libros.isEmpty()) {
                System.out.println("Resultados de la búsqueda:");
                libros.forEach(libro -> {
                    System.out.println("ISBN: " + libro.getIsbn());
                    System.out.println("Título: " + libro.getTitulo());
                    System.out.println("Año: " + libro.getAnio());
                    System.out.println("Editorial: " + libro.getEditorial().getNombre());
                    System.out.println("-------------");
                });
            } else {
                System.out.println("No se encontraron libros de la editorial " + nombreEditorial);
            }
        } finally {
            em.close();
        }
    }

    public Libro buscarLibroPorISBN() {
        EntityManager em = emf.createEntityManager();
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el ISBN del libro: ");
            long isbn = scanner.nextLong();

            // Realizar una consulta para buscar el libro por su ISBN
            Libro libro = em.find(Libro.class, isbn);

            if (libro != null) {
                System.out.println("Libro encontrado:");
                System.out.println("ISBN: " + libro.getIsbn());
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Año: " + libro.getAnio());
                System.out.println("Autor: " + libro.getAutor().getNombre());
                System.out.println("Editorial: " + libro.getEditorial().getNombre());
                return libro;
            } else {
                System.out.println("No se encontró ningún libro con el ISBN: " + isbn);
                return null;
            }
        } finally {
            em.close();
        }
    }

    public Libro buscarLibroPorTitulo() {
        EntityManager em = emf.createEntityManager();
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();

            // Realizar una consulta para buscar un libro por su título
            String jpql = "SELECT l FROM Libro l WHERE l.titulo LIKE :titulo";
            TypedQuery<Libro> query = em.createQuery(jpql, Libro.class);
            query.setParameter("titulo", "%" + titulo + "%");

            List<Libro> libros = query.getResultList();

            if (!libros.isEmpty()) {
                return libros.get(0);
            } else {
                System.out.println("No se encontró un libro con el título: " + titulo);
                return null;
            }
        } finally {
            em.close();
        }
    }

}

// ...

