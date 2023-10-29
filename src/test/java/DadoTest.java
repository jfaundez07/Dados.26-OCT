import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {
    Dado dado;

    @BeforeEach
    void setUp() {
        dado = new Dado();
    }

    @AfterEach
    void tearDown() {
        dado = null;
    }

    @Test
    void lanzarDado() {
        assertTrue(dado.lanzarDado() > 0 && dado.lanzarDado() < 7);
    }

}