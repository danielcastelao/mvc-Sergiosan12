package cod.mvc;

import java.util.ArrayList;
public class Model {
    private static ArrayList<Coche> parking = new ArrayList<>();

    public static Coche crearCoche(String matricula, String modelo, Integer velocidad){
        Coche coche = new Coche(matricula, modelo, velocidad);
        parking.add(coche);
        return coche;
    }

    public static Coche getCoche(){
        return parking.get(0);
    }

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