package com.cod.mvc;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

import javax.swing.*;

/**
 * Clase principal
 */
public class App {

    public static void main(String[] args) {
        // Inicializamos la app
        // obtenemos la instancia única del modelo
        Model miModel = Model.getInstance();
        // instanciamos el controlador
        // le pasamos el Model instanciado
        Controller miController = new Controller(miModel);

        // Crear tres coches
        miController.crearCoche("BMW", "SPQ 5432");
        miController.crearCoche("Audi", "JFK 9876");
        miController.crearCoche("Mercedes", "MNO 8546");

        // Cambiar la velocidad de un coche
        miController.cambiarVelocidad("SPQ 5432", 50);

        // otro cambio de velocidad
        // sobrepasando la velocidad máxima
        miController.cambiarVelocidad("JFK 9876", 140);

        // Buscar un coche por su matrícula
        String matricula = JOptionPane.showInputDialog("Introduce la matricula del coche a buscar");
        Coche cocheEncontrado = miController.buscarCoche(matricula);
        // Mostrar el coche encontrado con sus datos, si no se ha encontrado mostrar un mensaje
        if (cocheEncontrado != null) {
            System.out.println("Coche encontrado: " + cocheEncontrado.modelo + " " + cocheEncontrado.matricula + " " + cocheEncontrado.velocidad);
        } else {
            System.out.println("Coche no encontrado");
        }
    }
}
