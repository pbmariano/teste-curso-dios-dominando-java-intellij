package br.com.dio.model;

import java.util.Objects;

public class Gato {

    private String NOME;
    private String cor;
    private String idade;

    public Gato() {}

    public Gato(String NOME, String cor, String idade) {
        this.NOME = NOME;
        this.cor = cor;
        this.idade = idade;
    }


    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(NOME, gato.NOME) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NOME, cor, idade);
    }


    @Override
    public String toString() {
        return "Gato{" +
                "NOME='" + NOME + '\'' +
                ", cor='" + cor + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
