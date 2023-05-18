/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioProducto {

    Scanner sc = new Scanner(System.in);
    private Map<String, Producto> productos;

    public ServicioProducto() {
        this.productos = new HashMap<>();
    }

    public void agregarProducto() {

        System.out.println("Ingresa el nombre del producto: ");
        sc.nextLine();
        String nombre = sc.nextLine();

        if (productos == null) {

            System.out.println("Dame el precio del producto: ");
            double precio = sc.nextDouble();

            Producto producto = new Producto(nombre, precio);
            productos.put(nombre, producto);

        } else if (productos != null) {

            if (productos.containsKey(nombre)) {
                System.out.println("Este producto ya se ingreso");
            } else {

                System.out.println("Dame el precio del producto: ");
                double precio = sc.nextDouble();

                Producto producto = new Producto(nombre, precio);
                productos.put(nombre, producto);
            }

        }

    }

    public void mostrarProductos() {

        if (productos.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            System.out.println("Lista de productos: ");
            for (Map.Entry<String, Producto> entry : productos.entrySet()) {
                String nombre = entry.getKey();
                double precio = entry.getValue().getPrecio();

                System.out.println("Producto: " + nombre + " Precio: " + precio + "$");

            }

        }

    }

    
    
    
    public void modificarPrecio(){
    
     System.out.println("Ingrese el nombre del producto que desea modificar:");
        String nombre = sc.nextLine();

        if (!productos.containsKey(nombre)) {
            System.out.println("El producto no existe en la lista.");
        } else {
            System.out.println("Ingrese el nuevo precio del producto:");
            double precio = sc.nextDouble();

            Producto producto = productos.get(nombre);
            producto.setPrecio(precio);

            System.out.println("El precio del producto ha sido modificado.");
        }
    }
    
    
    public void eliminarProducto() {
       

        System.out.println("Ingrese el nombre del producto que desea eliminar:");
        String nombre = sc.nextLine();

        if (!productos.containsKey(nombre)) {
            System.out.println("El producto no existe en la lista.");
        } else {
            productos.remove(nombre);

            System.out.println("El producto ha sido eliminado de la lista.");
        }
    }

    
    
    }

