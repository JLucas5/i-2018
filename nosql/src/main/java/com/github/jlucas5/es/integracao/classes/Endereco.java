package com.github.jlucas5.es.integracao.classes;

public class Endereco {

    private String surrogateKey;
    private String bairro;
    private String distrito;
    private String codigoMunicipio;
    private String estado;
    private String cep;
    private String caixaPostal;
    private String pais;
    private String tipo;

    private LinhaDeEndereco linhaDeEndereco;

    /**
     *
     * @return
     */
    public String getSurrogateKey() {
        return surrogateKey;
    }

    /**
     *
     * @param surrogateKey
     */
    public void setSurrogateKey(String surrogateKey) {
        this.surrogateKey = surrogateKey;
    }

    /**
     *
     * @return
     */
    public String getBairro() {
        return bairro;
    }

    /**
     *
     * @param bairro
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     *
     * @return
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     *
     * @param distrito
     */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /**
     *
     * @return
     */
    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     *
     * @param codigoMunicipio
     */
    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    /**
     *
     * @return
     */
    public String getEstado() {
        return estado;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     *
     * @return
     */
    public String getCep() {
        return cep;
    }

    /**
     *
     * @param cep
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     *
     * @return
     */
    public String getCaixaPostal() {
        return caixaPostal;
    }

    /**
     *
     * @param caixaPostal
     */
    public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    /**
     *
     * @return
     */
    public String getPais() {
        return pais;
    }

    /**
     *
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public LinhaDeEndereco getLinhaDeEndereco() {
        return linhaDeEndereco;
    }

    /**
     *
     * @param linhaDeEndereco
     */
    public void setLinhaDeEndereco(LinhaDeEndereco linhaDeEndereco) {
        this.linhaDeEndereco = linhaDeEndereco;
    }
}
