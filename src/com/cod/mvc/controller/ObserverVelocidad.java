package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.view.View;

public class ObserverVelocidad implements Observer {
    public void update(Coche arg){
        System.out.println("Se ha cambiado la velocidad: " + String.valueOf(arg.velocidad));
        // le comunicamos a la vista que muestre la velocidad
        View.muestraVelocidad(arg.matricula, arg.velocidad);
    }

}
