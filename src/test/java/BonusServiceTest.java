import io.murilo.model.Funcionario;
import io.murilo.service.BonusService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BonusServiceTest {

    @Test
    @DisplayName(value = "calcularBonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto")
    void resultadoDeveraSerZeroCasoSalarioMuitoAlto() {
        BonusService service = new BonusService();
        assertThrows(IllegalArgumentException.class, () ->service.calcularBonus(new Funcionario("João", LocalDate.now(), new BigDecimal("25000"))));
    }

    @Test
    @DisplayName(value = "calcularBonusDeveriaSer10PorCentoDoSalario")
    void resultadoDeveraSerCalculado() {
        BonusService service = new BonusService();
        BigDecimal resultado = service.calcularBonus(new Funcionario("João", LocalDate.now(), new BigDecimal("2500")));
        assertEquals(new BigDecimal("250.0"), resultado);

    }

    @Test
    @DisplayName(value = "calcularBonusDoSalarioDe10MilReaisDeveraSerMil")
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamenteDezMilReais() {
        BonusService service = new BonusService();
        BigDecimal resultado = service.calcularBonus(new Funcionario("João", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.0"), resultado);

    }
}
