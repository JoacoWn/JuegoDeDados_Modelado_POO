import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DadoTest {

    @Test
    public void testLanzarDadoDevuelveValoresValidos() {
        // Arrange
        Dado dado = new Dado();
        boolean valorEnRango = false;

        // Act
        for (int i = 0; i < 100; i++) {  // Realizamos múltiples lanzamientos
            dado.lanzarDado();
            int resultado = dado.getCaraVisible();

            // Assert
            assertTrue(resultado >= 1 && resultado <= 6,
                    "El valor del dado debe estar entre 1 y 6, pero fue: " + resultado);
        }
    }

}