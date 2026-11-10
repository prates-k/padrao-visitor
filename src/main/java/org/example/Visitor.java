package org.example;

public interface Visitor {

    String exibirCliente(Cliente cliente);
    String exibirInstrutor(Instrutor instrutor);
    String exibirFuncionario(Funcionario funcionario);

}