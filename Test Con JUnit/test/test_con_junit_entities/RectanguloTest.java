package test_con_junit_entities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import test_con_junit_services.RectanguloService;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    RectanguloService rs = new RectanguloService();

    @Test
    void deberiaInicializarConColor() {

        Rectangulo r = new Rectangulo(10, 10);

        assertNotNull(0, r.getColor());
    }

    @Test
    void deberiaCalcularArea() {

        assertEquals(100, rs.calcularArea(new Rectangulo(10, 10)), 0);

        assertEquals(20, rs.calcularArea(new Rectangulo(4, 5)), 0);

        assertEquals(1, rs.calcularArea(new Rectangulo(1, 1)), 0);
    }
    @Test
    void deberiaCalcularPerimetro() {

        assertEquals(40, rs.calcularPerimetro(new Rectangulo(10, 10)), 0);

        assertEquals(100, rs.calcularPerimetro(new Rectangulo(20, 30)), 0);

        assertEquals(30, rs.calcularPerimetro(new Rectangulo(5, 10)), 0);
    }

    @Test
    void deberiaActivarODesactivar() {

        Rectangulo r = new Rectangulo(5, 5);
        assertFalse(r.isActive());
        r.setActive(true);
        assertTrue(r.isActive());
    }
}