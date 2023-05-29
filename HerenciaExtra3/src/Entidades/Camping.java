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
public class Camping extends Alojamiento {

    private int capacidadMaximaCarpas, cantidadBanios;

    private boolean tieneRestaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente, int capacidadMaximaCarpas,
            int cantidadBanios, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanios = cantidadBanios;
        this.tieneRestaurante = tieneRestaurante;
    }

    // Getters y setters
    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    // Implementación del método abstracto para calcular el precio de la habitación
    @Override
    public double getPrecioHabitaciones() {
        // El precio de las habitaciones en un camping no se calcula de acuerdo a la fórmula mencionada
        // en el enunciado, por lo que aquí se podría implementar otra lógica específica para el cálculo del precio.
        // En este caso, como no se proporciona esa información, el método simplemente devuelve 0.
        return 0;
    }

    // Otros métodos específicos de la clase Camping
    @Override
    public String toString() {
        return "Camping{"
                + "nombre='" + getNombre() + '\''
                + ", direccion='" + getDireccion() + '\''
                + ", localidad='" + getLocalidad() + '\''
                + ", gerente='" + getGerente() + '\''
                + ", capacidadMaximaCarpas=" + capacidadMaximaCarpas
                + ", cantidadBanios=" + cantidadBanios
                + ", tieneRestaurante=" + tieneRestaurante
                + '}';
    }
}
