import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDeComprasTest {

    private final CalculadoraDeCompra calculadora = new CalculadoraDeCompra();

    @Test
    void probarSubtotal() {
        assertEquals(300.0, calculadora.calcularSubtotal(100.0, 3), 0.001);
    }

    @Test
    void probarCompraValida() {
        assertTrue(calculadora.esCompraValida(100.0, 2));
        assertFalse(calculadora.esCompraValida(0.0, 2));
    }

    @Test
    void probarDescuento() {
        assertEquals(0.0, calculadora.calcularDescuento(500.0), 0.001);
        assertEquals(100.0, calculadora.calcularDescuento(1000.0), 0.001);
    }

    @Test
    void probarPrecioFinal() {
        assertEquals(900.0, calculadora.calcularPrecioFinal(1000.0), 0.001);
    }
}
