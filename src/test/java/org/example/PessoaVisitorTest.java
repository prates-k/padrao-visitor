package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirCliente() {
        Cliente cliente = new Cliente(1, "Ana", new Plano("Plano Premium"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Cliente{matricula=1, nome='Ana', plano=Plano Premium}", visitor.exibir(cliente));
    }

    @Test
    void deveExibirInstrutor() {
        Instrutor instrutor = new Instrutor(1, "Maria", "Musculação");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Instrutor{matricula=1, nome='Maria', especialidade='Musculação'}", visitor.exibir(instrutor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=1, nome='Pedro', salario=5000.0}", visitor.exibir(funcionario));
    }

}