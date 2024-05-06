import cod.mvc.Coche;
import cod.mvc.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {


    @BeforeEach
    void setUp() {
        Model.crearCoche("1234ABC", "ModeloTest1", 100);
    }

    @Test
    void testCrearCoche() {
        Coche coche = Model.crearCoche("5678DEF", "ModeloTest2", 200);
        assertNotNull(coche);
        assertEquals("5678DEF", coche.getMatricula());
        assertEquals("ModeloTest2", coche.getModelo());
        assertEquals(200, coche.getVelocidad());
    }

    @Test
    void testGetCoche() {
        Coche coche = Model.getCoche("1234ABC");
        assertNotNull(coche);
        assertEquals("1234ABC", coche.getMatricula());
    }

    @Test
    void testCambiarVelocidad() {
        Integer nuevaVelocidad = Model.cambiarVelocidad("1234ABC", 150);
        assertEquals(150, nuevaVelocidad);
    }

    @Test
    void testGetVelocidad() {
        Integer velocidad = Model.getVelocidad("1234ABC");
        assertEquals(100, velocidad);
    }
}