package br.com.alura.rh.service;

public class ReajusteService {

    public void reajustarSalarioDoFuncionario(Funcioanrio funcioanrio, BigDecimal aumento) {
        BigDecimal salarioAtual = funcioanrio.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
        BigDecimal salarioReajustado = salarioAtual.add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
    }
}