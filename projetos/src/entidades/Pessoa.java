package entidades;

import java.util.Date;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private Date dtNascimento;
    private Endereco endereco;
    private String CPF;

    public Pessoa(){};
    public Pessoa(String nome, Date dtNascimento, Endereco endereco, String CPF) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equals(pessoa.nome) && CPF.equals(pessoa.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, CPF);
    }
}
