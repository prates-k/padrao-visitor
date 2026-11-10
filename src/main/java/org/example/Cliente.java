package org.example;

public class Cliente implements Pessoa {

    private int matricula;
    private String nome;
    private Plano plano;

    public Cliente(int matricula, String nome, Plano plano) {
        this.matricula = matricula;
        this.nome = nome;
        this.plano = plano;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getNomePlano() {
        return this.plano.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCliente(this);
    }

}