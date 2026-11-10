package org.example;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "Cliente{" +
                "matricula=" + cliente.getMatricula() +
                ", nome='" + cliente.getNome() + '\'' +
                ", plano=" + cliente.getNomePlano() +
                '}';
    }

    @Override
    public String exibirInstrutor(Instrutor instrutor) {
        return "Instrutor{" +
                "matricula=" + instrutor.getMatricula() +
                ", nome='" + instrutor.getNome() + '\'' +
                ", especialidade='" + instrutor.getEspecialidade() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }
}