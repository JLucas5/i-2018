package com.github.jlucas5.es.integracao.classes;

import java.util.List;

public class Nome {

    private String surrogateKey;
    private List<String> titulos;
    private List<String> nomes;
    private List<String> sobrenomes;
    private List<String> sufixos;
    private String preferido;
    private String usoCondicional;

    /**
     *
     * @param surrogateKey
     * @param titulos
     * @param nomes
     * @param sobrenomes
     * @param sufixos
     * @param preferido
     * @param usoCondicional
     * @param utilizacao
     * @param representacao
     */
    public Nome(String surrogateKey, List<String> titulos, List<String> nomes, List<String> sobrenomes,
                List<String> sufixos, String preferido, String usoCondicional, Utilizacao utilizacao,
                Representacao representacao) {
        this.surrogateKey = surrogateKey;
        this.titulos = titulos;
        this.nomes = nomes;
        this.sobrenomes = sobrenomes;
        this.sufixos = sufixos;
        this.preferido = preferido;
        this.usoCondicional = usoCondicional;
        this.utilizacao = utilizacao;
        this.representacao = representacao;
    }

    private Utilizacao utilizacao;
    private Representacao representacao;

    public String getSurrogateKey() {
        return surrogateKey;
    }

    public void setSurrogateKey(String surrogateKey) {
        this.surrogateKey = surrogateKey;
    }

    public List<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<String> titulos) {
        this.titulos = titulos;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes.add(nomes);
    }

    public List<String> getSobrenomes() {
        return sobrenomes;
    }

    public void setSobrenomes(List<String> sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    public List<String> getSufixos() {
        return sufixos;
    }

    public void setSufixos(List<String> sufixos) {
        this.sufixos = sufixos;
    }

    public String getPreferido() {
        return preferido;
    }

    public void setPreferido(String preferido) {
        this.preferido = preferido;
    }

    public String getUsoCondicional() {
        return usoCondicional;
    }

    public void setUsoCondicional(String usoCondicional) {
        this.usoCondicional = usoCondicional;
    }

    public Utilizacao getUtilizacao() {
        return utilizacao;
    }

    public void setUtilizacao(Utilizacao utilizacao) {
        this.utilizacao = utilizacao;
    }

    public Representacao getRepresentacao() {
        return representacao;
    }

    public void setRepresentacao(Representacao representacao) {
        this.representacao = representacao;
    }
}
