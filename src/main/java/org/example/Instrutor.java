package org.example;

public class Instrutor implements Pessoa {

    private int matricula;
    private String nome;
    private String especialidade;

    public Instrutor(int matricula, String nome, String especialidade) {
        this.matricula = matricula;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirInstrutor(this);
    }

}