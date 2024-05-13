package cod.mvc.model;

import cod.mvc.model.Coche;

import java.util.Observer;

public interface Observable {
    //añade un observador
    void addObserver(Observer observer);
    //elimina un observador
    void removeObserver(Observer observer);
    //notifica a los observadores
    void notifyObservers(Coche coche);
}
