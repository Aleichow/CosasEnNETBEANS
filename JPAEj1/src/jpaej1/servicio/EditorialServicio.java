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
import jpaej1.entidades.Editorial;
import jpaej1.entidades.Libro;

/**
 *
 * @author user
 */
public class EditorialServicio {

    private EntityManagerFactory emf;

    public EditorialServicio() {
        emf = Persistence.createEntityManagerFactory("JPAEj1PU");
    }

    public Editorial crearEditorial() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre de la editorial: ");
            String nombre = scanner.nextLine();

            // Verificar si la editorial ya existe en la base de datos
            Query query = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre");
            query.setParameter("nombre", nombre);
            List<Editorial> editoriales = query.getResultList();

            if (!editoriales.isEmpty()) {
                System.out.println("La editorial ya existe en la base de datos.");
                return editoriales.get(0); // Devolver la primera editorial encontrada
            }

            // Crear el objeto Editorial con los datos ingresados por el usuario
            Editorial editorial = new Editorial();
            editorial.setNombre(nombre);

            em.persist(editorial);
            em.getTransaction().commit();
            return editorial;
        } finally {
            em.close();
        }
    }

    public void editarEditorial() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el ID de la editorial a editar: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            // Buscar la editorial en la base de datos
            Editorial editorial = em.find(Editorial.class, id);

            if (editorial != null) {
                System.out.print("Ingrese el nuevo nombre de la editorial: ");
                String nuevoNombre = scanner.nextLine();

                // Actualizar el atributo de la editorial con el nuevo valor ingresado
                editorial.setNombre(nuevoNombre);

                em.getTransaction().commit();
                System.out.println("La editorial ha sido editada exitosamente.");
            } else {
                System.out.println("La editorial con ID " + id + " no existe.");
            }
        } finally {
            em.close();
        }
    }

    public void eliminarEditorial(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Editorial editorial = em.find(Editorial.class, id);
        em.remove(editorial);
        em.getTransaction().commit();
        em.close();
    }

    public Editorial obtenerEditorial(Integer id) {
        EntityManager em = emf.createEntityManager();
        Editorial editorial = em.find(Editorial.class, id);
        em.close();
        return editorial;
    }

    // Otros métodos de consulta y operaciones CRUD
    public void cerrar() {
        emf.close();
    }

    public Editorial buscarEditorialPorNombre() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            System.out.println("¿Qué editorial deseas buscar?");
            Scanner scanner = new Scanner(System.in);
            String nombre = scanner.nextLine();

            TypedQuery<Editorial> query = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre", Editorial.class);
            query.setParameter("nombre", nombre);
            List<Editorial> editoriales = query.getResultList();

            if (!editoriales.isEmpty()) {
                System.out.println("Tenemos una editorial con ese nombre");
                return editoriales.get(0);
            }
        } finally {
            em.close();
        }

        System.out.println("Lo lamentamos, no tenemos una Editorial que coincida con ese nombre");
        return null;
    }

}
