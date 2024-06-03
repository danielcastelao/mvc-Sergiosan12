package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import com.cod.mvc.view.View;

public class ObserverVelocidad implements Observer {
    /**
     * Actualiza el observador con el coche y el modelo proporcionados.
     * Imprime un mensaje indicando si la velocidad del coche ha aumentado o disminuido.
     * @param arg el coche que ha cambiado su velocidad.
     * @param model el modelo que contiene al coche.
     */
    @Override
    public void update(Coche arg, Model model) {
        if (arg.getVelocidad() > arg.getVelocidadAnterior()) {
            System.out.println("[ObserverVelocidad] Se ha aumentado la velocidad del coche "+arg.getMatricula()+ " en: " + (arg.getVelocidad() - arg.getVelocidadAnterior()) + "km/hr");
        }else {
            System.out.println("[ObserverVelocidad] La velocidad del coche "+arg.getMatricula()+" ha disminuido en: " + (arg.getVelocidadAnterior() - arg.getVelocidad()) + "km/hr");
        }

        View.muestraVelocidad(arg.getMatricula(), arg.getVelocidad());
    }
}