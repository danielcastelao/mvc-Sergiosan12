
import cod.mvc.Coche;
import cod.mvc.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    private Model model;
    private String matricula;
    private String modelo;
    private Integer velocidad;

    @BeforeEach
    void setUp() {
        model = new Model();
        matricula = "1234ABC";
        modelo = "ModeloTest";
        velocidad = 100;
        model.crearCoche(matricula, modelo, velocidad);
    }

    @Test
    void testCrearCoche() {
        Coche coche = model.crearCoche("5678DEF", "ModeloTest2", 200);
        assertEquals("5678DEF", coche.getMatricula());
        assertEquals("ModeloTest2", coche.getModelo());
        assertEquals(200, coche.getVelocidad());
    }


    @Test
    void testCambiarVelocidad() {
        Integer nuevaVelocidad = 150;
        model.cambiarVelocidad(matricula, nuevaVelocidad);
        Coche coche = model.getCoche();
        assertEquals(nuevaVelocidad, coche.getVelocidad());
    }

    @Test
    void testGetVelocidad() {
        Integer velocidadObtenida = model.getVelocidad(matricula);
        assertEquals(velocidad, velocidadObtenida);
    }
}