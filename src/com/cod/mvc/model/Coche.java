package com.cod.mvc.model;

/**
 * Clase Coche
 */
public class Coche {
    public String matricula;
    public String modelo;
    public Integer velocidad;
    public Integer velocidadAnterior;

    /**
     *
     * @param modelo del coche
     * @param matricula cel coche
     */
    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Devuelve la velocidad anterior del coche.
     * @return velocidad anterior del coche.
     */
    public Integer getVelocidadAnterior() {
        return velocidadAnterior;
    }

    /**
     * Establece la velocidad anterior del coche.
     * @param velocidadAnterior la velocidad anterior a establecer.
     */
    public void setVelocidadAnterior(Integer velocidadAnterior) {
        this.velocidadAnterior = velocidadAnterior;
    }
}
