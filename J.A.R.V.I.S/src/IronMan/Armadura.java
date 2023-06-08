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
        if (!propulsores[0].daniado || !propulsores[1].daniado) {
            int consumo = propulsores[0].usar(Propulsor.INTENSIDAD_BASICA, tiempo);
            int consumo2 = propulsores[1].usar(Propulsor.INTENSIDAD_BASICA, tiempo);

            generador.consumirEnergia(consumo + consumo2);
        }
    }

    public void correr(int tiempo) {

        if (!propulsores[0].daniado || !propulsores[1].daniado) {
            int consumo = propulsores[0].usar(Propulsor.INTENSIDAD_NORMAL, tiempo) * 2;

            int consumo2 = propulsores[1].usar(Propulsor.INTENSIDAD_NORMAL, tiempo) * 2;

            generador.consumirEnergia(consumo + consumo2);
        }

    }

    public void propulsar(int tiempo) {
        if (!propulsores[0].daniado || !propulsores[1].daniado) {
            int consumo = propulsores[0].usar(Propulsor.INTENSIDAD_INTENSIVA, tiempo) * 3;
            int consumo2 = propulsores[1].usar(Propulsor.INTENSIDAD_INTENSIVA, tiempo) * 3;

            generador.consumirEnergia(consumo + consumo2);
        }
    }

    public void volar(int tiempo) {
        if (!propulsores[0].daniado || !propulsores[1].daniado || !repulsores[0].daniado || !repulsores[1].daniado) {
            int consumoBotas = (propulsores[0].usar(Propulsor.INTENSIDAD_INTENSIVA, tiempo)) + (propulsores[1].usar(Propulsor.INTENSIDAD_INTENSIVA, tiempo)) * 3;

            int consumoGuantes = (repulsores[0].usar(Repulsor.INTENSIDAD_NORMAL, tiempo)) + (repulsores[0].usar(Repulsor.INTENSIDAD_NORMAL, tiempo)) * 2;

            generador.consumirEnergia(consumoBotas + consumoGuantes);
        }

    }

    public void disparar(int tiempo) {
        if (!repulsores[0].daniado || !repulsores[1].daniado) {
            int consumo = repulsores[0].usar(Repulsor.INTENSIDAD_NORMAL, tiempo) * 3;
            int consumo2 = repulsores[1].usar(Repulsor.INTENSIDAD_NORMAL, tiempo) * 3;
            generador.consumirEnergia(consumo + consumo2);
        }

    }

    public void escribir(String mensaje) {
        if (!consola.daniado) {
            int consumo = consola.usar(Consola.INTENSIDAD_BASICA, mensaje);
            generador.consumirEnergia(consumo);
            System.out.println(mensaje);
        }

    }

    public void hablar(String mensaje) {
        if (sintetizador.daniado) {
            int consumo = sintetizador.usar(Sintetizador.INTENSIDAD_BASICA, mensaje);
            generador.consumirEnergia(consumo);
            System.out.println(mensaje);
        }

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

    public void revisarDispositivos() {
        System.out.println("Iniciando revisión de dispositivos...");

        boolean reparado;
        int intentos = 0;

        do {
            reparado = true; // Suponemos que todos los dispositivos están reparados inicialmente

            for (Propulsor propulsor : propulsores) {
                if (propulsor.daniado) {
                    while (!propulsor.estaReparado() && !propulsor.estaDestruido()) {
                        intentos++;
                        propulsor.reparar();
                        if (propulsor.estaReparado()) {
                            System.out.println("El propulsor ha sido reparado.");
                        } else if (propulsor.estaDestruido()) {
                            System.out.println("El propulsor ha sido destruido durante la reparación.");
                        } else {
                            System.out.println("El intento de reparación del propulsor ha sido fallido.");
                        }
                    }
                    reparado = false;
                }
            }

            for (Repulsor repulsor : repulsores) {
                if (repulsor.daniado) {
                    while (!repulsor.estaReparado() && !repulsor.estaDestruido()) {
                        intentos++;
                        repulsor.reparar();
                        if (repulsor.estaReparado()) {
                            System.out.println("El repulsor ha sido reparado.");
                        } else if (repulsor.estaDestruido()) {
                            System.out.println("El repulsor ha sido destruido durante la reparación.");
                        } else {
                            System.out.println("El intento de reparación del repulsor ha sido fallido.");
                        }
                    }
                    reparado = false;
                }
            }

            if (consola.daniado) {
                while (!consola.daniado && !consola.estaDestruido()) {
                    intentos++;
                    consola.reparar();
                    if (consola.estaReparado()) {
                        System.out.println("La consola ha sido reparada.");
                    } else if (consola.estaDestruido()) {
                        System.out.println("La consola ha sido destruida durante la reparación.");
                    } else {
                        System.out.println("El intento de reparación de la consola ha sido fallido.");
                    }
                }
                reparado = false;
            }

            if (sintetizador.daniado) {
                while (!sintetizador.estaReparado() && !sintetizador.estaDestruido()) {
                    intentos++;
                    sintetizador.reparar();
                    if (sintetizador.estaReparado()) {
                        System.out.println("El sintetizador ha sido reparado.");
                    } else if (sintetizador.estaDestruido()) {
                        System.out.println("El sintetizador ha sido destruido durante la reparación.");
                    } else {
                        System.out.println("El intento de reparación del sintetizador ha sido fallido.");
                    }
                }
                reparado = false;
            }

            if (!reparado && intentos % 10 == 0) {
                System.out.println("¡Advertencia! Llevamos " + intentos + " intentos de reparación sin éxito.");
            }
        } while (!reparado);

        if (intentos > 0) {
            System.out.println("Todos los dispositivos han sido revisados y reparados correctamente.");
        } else {
            System.out.println("No se encontraron dispositivos dañados durante la revisión.");
        }
    }

    public void agregarEnemigo() {
        consola.agregarEnemigo();
    }

    public void calcularDistanciaEnemigos() {
        consola.calcularDistanciaEnemigos();
    }
}
