
package br.ufjf.dcc171.modelo;


public class Pessoa {
    private String nome;
    private Integer anoNascimento;// Integer aceita null

    public Pessoa(String nome, Integer anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public Pessoa() {
        this(null,null);
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return   nome +  anoNascimento;
    }
    
    
}
