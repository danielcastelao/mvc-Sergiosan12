package cod.mvc;

import java.util.ArrayList;
public class Model {
    private static ArrayList<Coche> parking = new ArrayList<>();

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

    public static Integer getVelocidad(String matricula){
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche.getVelocidad();
            }
        }
        return null;
    }
}