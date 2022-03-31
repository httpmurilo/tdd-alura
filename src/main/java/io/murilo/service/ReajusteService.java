package io.murilo.service;

import io.murilo.model.Desempenho;
import io.murilo.model.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {

        if (desempenho == Desempenho.A_DESEJAR) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
            funcionario.reajustarSalario(reajuste);
        } else if (desempenho == Desempenho.BOM) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
        } else {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.2"));
        }
    }
}
