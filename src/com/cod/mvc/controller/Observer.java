package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;

public interface Observer {
    //metodo que se ejecuta cuando el objeto observado cambia
    void update(Coche arg);
}
