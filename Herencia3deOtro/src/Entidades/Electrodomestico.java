package Entidades;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Integer precio;
    protected String color;
    protected Integer peso;
    protected String letra;

    public Electrodomestico(Integer precio, String color, Integer peso, String letra) {
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.letra = letra;
    }

    public Electrodomestico() {
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "leer=" + leer + ", precio=" + precio + ", color=" + color + ", peso=" + peso + ", letra=" + letra + '}';
    }

    public void comprobarConsumoEnergetico(String letra) {

        if (letra.equals(this.letra)) {
            System.out.println("La letra es correcta");
        } else {
            this.letra = "F";
        }

    }

    public void comprobarColor(String color) {

        if (color.equals(this.color)) {
            System.out.println("El color es correcto");
        } else {
            this.color = "Blanco";
        }
    }

    public void crearElectrodomestico() {

        

        System.out.println("Colores disponibles\n"
                + "1.Rojo\n"
                + "2.Blanco\n"
                + "3.Negro\n"
                + "4.Azul\n"
                + "5.Gris");
        color = leer.next();
        
        

        System.out.println("Indique el consumo energetico\n"
                + "A\n"
                + "B\n"
                + "C\n"
                + "D\n"
                + "E\n"
                + "F");
        letra = leer.next().toUpperCase();

        System.out.println("Indique el peso de su electrodomestico\n"
                + "1.Entre 1 y 19kg\n"
                + "2.Entre 20 y 49kg\n"
                + "3.Entre 50 y 79kg\n"
                + "4.Mayor que 80kg");
        peso = leer.nextInt();

       

        System.out.println("El precio tiene un valor base de $1000");
        precio = 1000;
        
    }

    public int precioFinal() {
     int pre = precio;
          
        switch (letra) {
            case "A":
                pre += 1000;
                break;
            case "B":
                pre += 800;
                break;
            case "C":
                pre += 600;
                break;
            case "D":
                pre += 500;
                break;
            case "E":
                pre += 300;
                break;
            case "F":
                pre += 100;             
        }
        switch (peso) {
            case 1:
                pre += 100;
                break;
            case 2:
                pre += 500;
                break;
            case 3:
                pre += 800;
                break;
            case 4:
                pre += 1000;
            default:
                
        }
        return pre;
    }      
    
}