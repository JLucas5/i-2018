package com.github.jlucas5.es.integracao.classes;

public class Representacao {

    private String utilizacao;
    private String alternativa;

    /**
     *
     * @param utilizacao
     * @param alternativa
     */
    public Representacao(String utilizacao, String alternativa) {
        this.utilizacao = utilizacao;
        this.alternativa = alternativa;
    }

    public String getUtilizacao() {
        return utilizacao;
    }

    public void setUtilizacao(String utilizacao) {
        this.utilizacao = utilizacao;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }
}
