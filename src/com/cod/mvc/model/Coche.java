package com.cod.mvc.model;

public class Coche {
    public String matricula;
    String modelo;
    public Integer velocidad;

    public Coche(String matricula, String modelo, Integer velocidad) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = velocidad;
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
}
