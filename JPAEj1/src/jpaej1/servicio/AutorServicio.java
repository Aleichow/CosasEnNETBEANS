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
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import jpaej1.entidades.Autor;
import static jpaej1.entidades.Autor_.nombre;
import jpaej1.entidades.Libro;

/**
 *
 * @author user
 */
public class AutorServicio {

    private EntityManagerFactory emf;

    public AutorServicio() {
        emf = Persistence.createEntityManagerFactory("JPAEj1PU");
    }

    public Autor crearAutor() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre del autor: ");
            String nombre = scanner.nextLine();

            // Verificar si el autor ya existe en la base de datos
            TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre", Autor.class);
            query.setParameter("nombre", nombre);
            List<Autor> autores = query.getResultList();

            if (!autores.isEmpty()) {
                System.out.println("El autor ya existe en la base de datos.");
                return autores.get(0);
            }

            // Crear el objeto Autor con los datos ingresados por el usuario
            Autor autor = new Autor();
            autor.setNombre(nombre);

            em.persist(autor);
            em.getTransaction().commit();
            return autor;
        } finally {
            em.close();

        }
    }

    public void editarAutor() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el ID del autor a editar: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            // Buscar el autor en la base de datos
            Autor autor = em.find(Autor.class, id);

            if (autor != null) {
                System.out.print("Ingrese el nuevo nombre del autor: ");
                String nuevoNombre = scanner.nextLine();

                // Actualizar el atributo del autor con el nuevo valor ingresado
                autor.setNombre(nuevoNombre);

                em.getTransaction().commit();
                System.out.println("El autor ha sido editado exitosamente.");
            } else {
                System.out.println("El autor con ID " + id + " no existe.");
            }
        } finally {
            em.close();
        }
    }

    public void eliminarAutor(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Autor autor = em.find(Autor.class, id);
        em.remove(autor);
        em.getTransaction().commit();
        em.close();
    }

    public Autor obtenerAutor(Integer id) {
        EntityManager em = emf.createEntityManager();
        Autor autor = em.find(Autor.class, id);
        em.close();
        return autor;
    }

    public Autor buscarAutorPorNombre() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {

            System.out.println("Que autor deseas buscar: ");
            Scanner scanner = new Scanner(System.in);

            String nombre = scanner.nextLine();

            TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre", Autor.class);
            query.setParameter("nombre", nombre);
            List<Autor> autores = query.getResultList();

            if (!autores.isEmpty()) {
                System.out.println("Tenemos un autor con ese nombre");
                return autores.get(0);
            }

        } finally {
            em.close();
        }
        System.out.println("Lo lamentamos pero no tenemos un Autor que coincida con ese nombre");
        return null;
    }

    // Otros métodos de consulta y operaciones CRUD
    public void cerrar() {
        emf.close();
    }

}
