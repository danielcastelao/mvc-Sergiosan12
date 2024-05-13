package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

import java.util.Observer;

public class Controller {
    static Model miModelo;
    public static void main(String[] args) {
        miModelo = new Model();

        // instanciamos al observador
        ObserverVelocidad observoVelocidad = new ObserverVelocidad();
        miModelo.addObserver((Observer) observoVelocidad);

        // Crear tres coches

        miModelo.crearCoche("LaFerrari", "SBC 1234",0);
        miModelo.crearCoche("Alpine", "HYU 4567",0);
        miModelo.crearCoche("Aston Martin", "FGH 3333",0);

        Coche ferrari = Model.getCoche("SBC 1234");
        // modifica la velocidad
        miModelo.cambiarVelocidad("SBC 1234", 30);

        // otro cambio de velocidad
        miModelo.cambiarVelocidad("HYU 4567", 100);


    }
}