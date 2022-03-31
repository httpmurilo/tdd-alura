package io.murilo.service;

import io.murilo.model.Desempenho;
import io.murilo.model.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal percentualReajuste = desempenho.percentualReajuste();
        BigDecimal reajuste = funcionario.getSalario().multiply(percentualReajuste);
        funcionario.reajustarSalario(reajuste);
    }
}
