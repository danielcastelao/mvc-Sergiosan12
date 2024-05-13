package cod.mvc.controller;

import cod.mvc.model.Coche;

public interface Observer {
    //metodo que se ejecuta cuando el objeto observado cambia
    void update(Coche arg);
}
