import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDadosTest {

    @Test
    public void testSumarDadosValorMaximo(){

        CalculadoraDados calculadoraDados = new CalculadoraDados();
        int resultado = calculadoraDados.sumarDados(6,6);
        assertEquals(12, resultado);
    }

}