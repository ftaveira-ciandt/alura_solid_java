package br.com.alura.rh.service;

public class ValidacaoPeriocidadeReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
    LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
    LocalDate dataAtual = LocalDate.now();
    long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if(mesesDesdeUltimoReajuste< 6){
        throw new ValidacaoException("Intervalo entre reajustes nao pode ser menor do que 6 meses");
        }
    }
}
