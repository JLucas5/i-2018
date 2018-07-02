package com.github.jlucas5.es.integracao.classes;

public class Individuo {

    private String surrogateKey;
    private Endereco endereco;
    private DadoDemografico dadoDemografico;
    private Nome nome;
    private Identificador identificador;
    private Vinculo vinculo;

    public Individuo(){
        this.surrogateKey = "";
        this.endereco = new Endereco();
        this.dadoDemografico = new DadoDemografico();
        this.nome = new Nome();
        this.identificador = new Identificador();
        this.vinculo = new Vinculo();
    }

    /**
     *
     * @param surrogateKey
     * @param endereco
     * @param dadoDemografico
     * @param nome
     * @param identificador
     * @param vinculo
     */

    public Individuo(String surrogateKey, Endereco endereco, DadoDemografico dadoDemografico, Nome nome,
                     Identificador identificador, Vinculo vinculo) {
        this.surrogateKey = surrogateKey;
        this.endereco = endereco;
        this.dadoDemografico = dadoDemografico;
        this.nome = nome;
        this.identificador = identificador;
        this.vinculo = vinculo;
    }

    public String getSurrogateKey() {
        return surrogateKey;
    }

    public void setSurrogateKey(String surrogateKey) {
        this.surrogateKey = surrogateKey;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public DadoDemografico getDadoDemografico() {
        return dadoDemografico;
    }

    public void setDadoDemografico(DadoDemografico dadoDemografico) {
        this.dadoDemografico = dadoDemografico;
    }

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public Identificador getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Identificador identificador) {
        this.identificador = identificador;
    }

    public Vinculo getVinculo() {
        return vinculo;
    }

    public void setVinculo(Vinculo vinculo) {
        this.vinculo = vinculo;
    }
}
