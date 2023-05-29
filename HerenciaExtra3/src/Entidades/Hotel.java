/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author user
 */
public class Hotel extends Alojamiento {

    private int cantidadHabitaciones, numeroCamas, cantidadPisos, capacidadRestaurante;

    private String gimnasio, nombreRestaurante;

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas,
            int cantidadPisos, String gimnasio, String nombreRestaurante, int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

   

    // Getters y setters
    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    // Implementación del método abstracto para calcular el precio de la habitación
    @Override
    public double getPrecioHabitaciones() {
        double valorAgregadoRestaurante = 0;
        double valorAgregadoGimnasio = 0;
        double valorAgregadoLimosinas = 0;

        // Calcular valor agregado por restaurante
        if (capacidadRestaurante < 30) {
            valorAgregadoRestaurante = 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            valorAgregadoRestaurante = 30;
        } else {
            valorAgregadoRestaurante = 50;
        }

        // Calcular valor agregado por gimnasio
        if (gimnasio.equals("A")) {
            valorAgregadoGimnasio = 50;
        } else if (gimnasio.equals("B")) {
            valorAgregadoGimnasio = 30;
        }

        // Calcular valor agregado por limosinas
        valorAgregadoLimosinas = 15;

        // Calcular precio de la habitación
        double precioHabitacion = 50 + (1 * cantidadHabitaciones) + valorAgregadoRestaurante
                + valorAgregadoGimnasio + (valorAgregadoLimosinas * 0); // No se proporciona la cantidad de limosinas

        return precioHabitacion;
    }

    // Otros métodos específicos de la clase Hotel
    @Override
    public String toString() {
        return "Hotel{"
                + "nombre='" + getNombre() + '\''
                + ", direccion='" + getDireccion() + '\''
                + ", localidad='" + getLocalidad() + '\''
                + ", gerente='" + getGerente() + '\''
                + ", cantidadHabitaciones=" + cantidadHabitaciones
                + ", numeroCamas=" + numeroCamas
                + ", cantidadPisos=" + cantidadPisos
                + ", gimnasio='" + gimnasio + '\''
                + ", nombreRestaurante='" + nombreRestaurante + '\''
                + ", capacidadRestaurante=" + capacidadRestaurante
                + '}';
    }
}
