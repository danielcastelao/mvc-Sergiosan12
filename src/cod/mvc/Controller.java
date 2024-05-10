package cod.mvc;

public class Controller {
    public static void main(String[] args) {
        // Creo un coche
        Model.crearCoche("1234ABC", "ModeloTest1", 100);

        // Cambiar la velocidad del coche
        Model.cambiarVelocidad("1234ABC", 150);

        // Obtener la velocidad del coche
        Integer velocidad = Model.getVelocidad("1234ABC");

        // Mostrar la velocidad del coche
        View.muestraVelocidad("1234ABC", velocidad);
    }
}