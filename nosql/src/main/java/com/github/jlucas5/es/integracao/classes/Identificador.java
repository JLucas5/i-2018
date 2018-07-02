package com.github.jlucas5.es.integracao.classes;

public class Identificador {

    private String surrogateKey;
    private String designacao;
    private String area;
    private String emissor;
    private String data;
    private String tipo;

    private CTPS ctps;
    private Certidao certidao;
    private TituloEleitoral tituloEleitoral;

    /**
     *
     * @param surrogateKey
     * @param designacao
     * @param area
     * @param emissor
     * @param data
     * @param tipo
     * @param ctps
     * @param certidao
     * @param tituloEleitoral
     */
    public Identificador(String surrogateKey, String designacao, String area, String emissor, String data, String tipo,
                         CTPS ctps, Certidao certidao, TituloEleitoral tituloEleitoral) {
        this.surrogateKey = surrogateKey;
        this.designacao = designacao;
        this.area = area;
        this.emissor = emissor;
        this.data = data;
        this.tipo = tipo;
        this.ctps = ctps;
        this.certidao = certidao;
        this.tituloEleitoral = tituloEleitoral;
    }

    public String getSurrogateKey() {
        return surrogateKey;
    }

    public void setSurrogateKey(String surrogateKey) {
        this.surrogateKey = surrogateKey;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public CTPS getCtps() {
        return ctps;
    }

    public void setCtps(CTPS ctps) {
        this.ctps = ctps;
    }

    public Certidao getCertidao() {
        return certidao;
    }

    public void setCertidao(Certidao certidao) {
        this.certidao = certidao;
    }

    public TituloEleitoral getTituloEleitoral() {
        return tituloEleitoral;
    }

    public void setTituloEleitoral(TituloEleitoral tituloEleitoral) {
        this.tituloEleitoral = tituloEleitoral;
    }
}
