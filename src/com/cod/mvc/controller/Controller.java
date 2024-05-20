package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

public class Controller{
    static Model miModelo;

    public static void main(String[] args) {

        // el patron Observer en java nos exige instanciar la clase observable
        miModelo = new Model();

        // instanciamos al observador
        ObserverVelocidad observoVelocidad = new ObserverVelocidad();
        miModelo.addObserver(observoVelocidad);

        // Crear tres coches y guardar las referencias
        Coche ferrari = Model.crearCoche("LaFerrari", "SBC 1234",30);
        Coche alpine = Model.crearCoche("Alpine", "HYU 4567",90);
        Coche astonMartin = Model.crearCoche("Aston Martin", "FGH 3333",80);

        // Verificar que los coches se crearon correctamente
        if (ferrari == null || alpine == null || astonMartin == null) {
            throw new RuntimeException("Error al crear los coches");
        }

        // modifica la velocidad usando las referencias a los coches
        miModelo.cambiarVelocidad(ferrari.getMatricula(), 30);

        // otro cambio de velocidad
        miModelo.cambiarVelocidad(alpine.getMatricula(), 100);
    }
}