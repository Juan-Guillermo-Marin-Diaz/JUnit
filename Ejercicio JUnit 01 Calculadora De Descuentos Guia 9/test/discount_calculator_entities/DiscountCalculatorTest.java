package discount_calculator_entities;

import discount_calculator_services.DiscountCalculatorService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void probandoElPrecioYElDescuento() {

        //Instanciamos el objeto dc para hacer el Test de el precio y el descuento
        DiscountCalculator dc = new DiscountCalculator(100, 0.1);

        assertEquals(100, 100, 0.001);
        assertEquals(0.1, 0.1, 0.001);
    }
    @Test
    void debeDevolverLaCantidadDeDescuento() {

        DiscountCalculatorService dcs = new DiscountCalculatorService();

        assertEquals(10, dcs.calcularCantidadDeDescuento(new DiscountCalculator(100, 0.1)));
    }

    @Test
    void debeDevolverCeroDescuento() {

        DiscountCalculatorService dcs = new DiscountCalculatorService();

        assertEquals(0, dcs.calcularCantidadDeDescuento(new DiscountCalculator(100, 0.0)));
    }

    @Test
    void debeDevolverElDescuentoMaximo() {

        DiscountCalculatorService dcs = new DiscountCalculatorService();

        assertEquals(50, dcs.calcularCantidadDeDescuento(new DiscountCalculator(100, 0.5)));
    }
}