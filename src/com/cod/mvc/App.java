package com.cod.mvc;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Model;

/**
 * Clase principal
 */
public class App {


    public static void main(String[] args) {
        // Inicializamos la app
        // instanciamos el modelo
        Model miModel = new Model();
        // instanciamos el controlador
        // le pasamos el Model instanciado
        Controller miController = new Controller(miModel);

        // Crear tres coches
        miController.crearCoche("BMW", "SPQ 5432");
        miController.crearCoche("Audi", "JFK 9876");
        miController.crearCoche("Mercedes", "MNO 8546");

        //subimos la velocidad
        miController.subirVelocidad("SPQ 5432",20);

    }
}