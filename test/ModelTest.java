// En ModelTest.java
import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    Model model;

    @BeforeEach
    void setUp() {
        model = new Model();
    }

    @Test
    void testCrearCoche() {
        Coche coche = model.crearCoche("LaFerrari", "1234ABC");
        assertNotNull(coche);
        assertEquals("1234ABC", coche.getMatricula());
        assertEquals("LaFerrari", coche.getModelo());
        assertEquals(0, coche.getVelocidad());
    }

    @Test
    void testGetCoche() {
        model.crearCoche("LaFerrari", "1234ABC");
        Coche coche = model.getCoche("1234ABC");
        assertNotNull(coche);
        assertEquals("1234ABC", coche.getMatricula());
    }

    @Test
    void testCambiarVelocidad() {
        model.crearCoche("LaFerrari", "1234ABC");
        model.cambiarVelocidad("1234ABC", 180);
        Integer velocidad = model.getVelocidad("1234ABC");
        assertEquals(180, velocidad);
    }

    @Test
    void testGetVelocidad() {
        model.crearCoche("LaFerrari", "1234ABC");
        Integer velocidad = model.getVelocidad("1234ABC");
        assertEquals(0, velocidad);
    }

    @Test
    public void subirVelocidad() {
        model.crearCoche("CochePrueba", "1234");
        model.subirVelocidad("1234", 50);
        Coche coche = model.getCoche("1234");
        assertEquals(50, coche.getVelocidad());
    }
}