/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IronMan;

/**
 *
 * @author user
 */
public class Armadura {

    private String colorPrimario;
    private String colorSecundario;
    private Propulsor[] propulsores;
    private Repulsor[] repulsores;
    private String resistencia;
    private int salud;
    private Generador generador;
    private Consola consola;
    private Sintetizador sintetizador;

    public Armadura(String colorPrimario, String colorSecundario) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.resistencia = "100HRC";
        this.salud = 100;
        propulsores = new Propulsor[2];
        propulsores[0] = new Propulsor();
        propulsores[1] = new Propulsor();
        repulsores = new Repulsor[2];
        repulsores[0] = new Repulsor();
        repulsores[1] = new Repulsor();
        this.generador = new Generador();
        this.consola = new Consola();
        this.sintetizador = new Sintetizador();
    }

    public void caminar(int tiempo) {
        int consumo = propulsores[0].usar(Propulsor.INTENSIDAD_BASICA, tiempo);
        int consumo2 = propulsores[1].usar(Propulsor.INTENSIDAD_BASICA, tiempo);

        generador.consumirEnergia(consumo + consumo2);

    }

    public void correr(int tiempo) {
        int consumo = propulsores[0].usar(Propulsor.INTENSIDAD_NORMAL, tiempo) * 2;
        int consumo2 = propulsores[1].usar(Propulsor.INTENSIDAD_NORMAL, tiempo) * 2;

        generador.consumirEnergia(consumo + consumo2);
    }

    public void propulsar(int tiempo) {
        int consumo = propulsores[0].usar(Propulsor.INTENSIDAD_INTENSIVA, tiempo) * 3;
        generador.consumirEnergia(consumo);
    }

    public void volar(int tiempo) {
        int consumoBotas = propulsores[0].usar(Propulsor.INTENSIDAD_INTENSIVA, tiempo) * 3;
        int consumoGuantes = repulsores[0].usar(Repulsor.INTENSIDAD_NORMAL, tiempo) * 2;
        generador.consumirEnergia(consumoBotas + consumoGuantes);
    }

    public void usarGuantesComoArmas(int tiempo) {
        int consumo = repulsores[0].usar(Repulsor.INTENSIDAD_NORMAL, tiempo) * 3;
        generador.consumirEnergia(consumo);
    }

    public void escribir(String mensaje) {
        int consumo = consola.usar(Consola.INTENSIDAD_BASICA, mensaje);
        generador.consumirEnergia(consumo);
         System.out.println(mensaje);
    }

    public void hablar(String mensaje) {
        int consumo = sintetizador.usar(Sintetizador.INTENSIDAD_BASICA, mensaje);
        generador.consumirEnergia(consumo);
        System.out.println(mensaje);
    }

    // Getters y Setters
    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void mostrarEstado() {
        System.out.println("Estado de la Armadura:");
        System.out.println("Color primario: " + colorPrimario);
        System.out.println("Color secundario: " + colorSecundario);
        System.out.println("Nivel de resistencia: " + resistencia);
        System.out.println("Nivel de salud: " + salud);
        System.out.println("Generador - Nivel de energía: " + generador.mostrarEstadoBateria());
        System.out.println("Consola - Consumo: " + consola.getConsumo());
        System.out.println("Sintetizador - Consumo: " + sintetizador.getConsumo());

        for (int i = 0; i < propulsores.length; i++) {
            System.out.println("Propulsor " + (i + 1) + " - Consumo: " + propulsores[i].getConsumo());
        }

        for (int i = 0; i < repulsores.length; i++) {
            System.out.println("Repulsor " + (i + 1) + " - Consumo: " + repulsores[i].getConsumo());
        }
    }

}
