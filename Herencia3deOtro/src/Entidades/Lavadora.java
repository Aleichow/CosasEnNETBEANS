package Entidades;

/**
 *
 * @author franco
 */
public class Lavadora extends Electrodomestico {

    protected Integer carga;

    public Lavadora(Integer carga, Integer precio, String color, Integer peso, String letra) {
        super(precio, color, peso, letra);
        this.carga = carga;
    }

    public Lavadora() {
        super();
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

    public void crearLavadora() {
        crearElectrodomestico();
        System.out.println("Indique la carga de la lavadora en kg");
        carga = leer.nextInt();
    }

    @Override
    public int precioFinal() {

        int p = super.precioFinal();
        if (carga > 30) {
            p += 500;
        }
        return p;
    }

}
