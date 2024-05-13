package cod.mvc.view;

public class View {
    public static boolean muestraVelocidad(String matricula, Integer velocidad){
        System.out.println("El coche con matrícula " + matricula + " tiene una velocidad de " + velocidad+ " km/h");
        return true;
    }
}
