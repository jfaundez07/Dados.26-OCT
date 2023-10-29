import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimularLanzamientoTest {

    int num1;
    int num2;

    SimularLanzamiento simularLanzamiento;

    @BeforeEach
    void setUp() {
        num1 = 7;
        num2 = 1;
        simularLanzamiento = new SimularLanzamiento();
    }

    @AfterEach
    void tearDown() {
        num1 = 0;
        num2 = 0;
        simularLanzamiento = null;
    }

    @Test
    void validarGanar() {
        assertTrue(simularLanzamiento.validarGanar(num1));
        assertFalse(simularLanzamiento.validarGanar(num2));
    }
}