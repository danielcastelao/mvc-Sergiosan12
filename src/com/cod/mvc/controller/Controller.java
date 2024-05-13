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



        // Crear tres coches

        Model.crearCoche("LaFerrari", "SBC 1234",0);
        Model.crearCoche("Alpine", "HYU 4567",0);
        Model.crearCoche("Aston Martin", "FGH 3333",0);

        Coche ferrari = Model.getCoche("SBC 1234");

        // modifica la velocidad
        miModelo.cambiarVelocidad("SBC 1234", 30);

        // otro cambio de velocidad
        miModelo.cambiarVelocidad("HYU 4567", 100);


    }

}