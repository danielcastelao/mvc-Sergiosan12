package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.view.View;

public class ObserverVelocidad implements Observer {
    public void update(Coche arg){
        System.out.println("Se ha cambiado la velociad del coche con matricula: " + arg.getMatricula() + " a " + arg.getVelocidad() + " km/h");
        View.muestraVelocidad(arg.getMatricula(), arg.getVelocidad());
    }

}
