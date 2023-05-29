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
public class Residencia extends Alojamiento {

    private int cantidadHabitaciones;
    private boolean descuentosGremios;
    private boolean tieneCampoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
            boolean descuentosGremios, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    // Getters y setters
    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentosGremios() {
        return descuentosGremios;
    }

    public void setDescuentosGremios(boolean descuentosGremios) {
        this.descuentosGremios = descuentosGremios;
    }

    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    // Implementación del método abstracto para calcular el precio de la habitación
    @Override
    public double getPrecioHabitaciones() {
        // El precio de las habitaciones en una residencia no se calcula de acuerdo a la fórmula mencionada
        // en el enunciado, por lo que aquí se podría implementar otra lógica específica para el cálculo del precio.
        // En este caso, como no se proporciona esa información, el método simplemente devuelve 0.
        return 0;
    }

    // Otros métodos específicos de la clase Residencia
    @Override
    public String toString() {
        return "Residencia{"
                + "nombre='" + getNombre() + '\''
                + ", direccion='" + getDireccion() + '\''
                + ", localidad='" + getLocalidad() + '\''
                + ", gerente='" + getGerente() + '\''
                + ", cantidadHabitaciones=" + cantidadHabitaciones
                + ", descuentosGremios=" + descuentosGremios
                + ", tieneCampoDeportivo=" + tieneCampoDeportivo
                + '}';
    }
}
