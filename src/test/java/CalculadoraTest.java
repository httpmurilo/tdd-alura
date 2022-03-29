import io.murilo.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void somarDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(10, 155);
        Assertions.assertEquals(165, resultado);
    }
}
