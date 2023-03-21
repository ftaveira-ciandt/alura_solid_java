package br.com.alura.rh.model;

public class Terceirizado extends Funcionario {

    private DadosPessoais dadosPessoais;
    private  String empresa;

    public Terceirizado (String nome, String cpf, Cargo cargo, BigDecimal salario,) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
        this.empresa = empresa;
    }

    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
    }


    public void atualizarSalario(BigDecimal novoSalario) {
        super.atualizarSalario(novoSalario);

    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}

}