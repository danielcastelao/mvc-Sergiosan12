package com.cod.mvc.model;

import com.cod.mvc.controller.Observer;

import java.util.ArrayList;

public class Model implements Observable {
    static ArrayList<Coche> parking = new ArrayList<>();

    private static final ArrayList<Observer> observers = new ArrayList<Observer>();


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Coche coche) {
        for (Observer observer : observers) {
            observer.update(coche);
        }
    }

    /**
     *
     * @param matricula identificador del coche
     * @param modelo del coche
     * @param velocidad del coche
     * @return el coche creado
     */
    public static Coche crearCoche(String matricula, String modelo, Integer velocidad){
        Coche coche = new Coche(matricula, modelo, velocidad);
        parking.add(coche);
        return coche;
    }

    /**
     *
     * @param matricula
     * @return coche si lo encuentra, null si no
     */
    public static Coche getCoche(String matricula){
        for (Coche coche : parking){
            if(coche.getMatricula().equals(matricula)){
                return coche;
            }
        }
        return null;
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula del coche a cambiar
     * @param velocidad nueva
     * @return la velocidad nueva si se ha cambiado, null si no se ha encontrado el coche
     */
    public static Integer cambiarVelocidad(String matricula, Integer velocidad){
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                coche.setVelocidad(velocidad);
                return velocidad;
            }
        }
        return null;
    }

    /**
     *
     * @param matricula del coche a buscar
     * @return la velocidad del coche si lo encuentra, null si no
     */
    public static Integer getVelocidad(String matricula){
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche.getVelocidad();
            }
        }
        return null;
    }
}