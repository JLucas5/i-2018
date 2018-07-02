package com.github.jlucas5.es.integracao.classes;

public class Certidao {

    private String tipo;
    private String catorio;
    private String livro;
    private String folha;
    private String termo;

    /**
     * @param tipo
     * @param catorio
     * @param livro
     * @param folha
     * @param termo
     */
    public Certidao(String tipo, String catorio, String livro, String folha, String termo) {
        this.tipo = tipo;
        this.catorio = catorio;
        this.livro = livro;
        this.folha = folha;
        this.termo = termo;
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
    public String getCatorio() {
        return catorio;
    }

    /**
     *
     * @param catorio
     */
    public void setCatorio(String catorio) {
        this.catorio = catorio;
    }

    /**
     *
     * @return
     */
    public String getLivro() {
        return livro;
    }

    /**
     *
     * @param livro
     */
    public void setLivro(String livro) {
        this.livro = livro;
    }

    /**
     *
     * @return
     */
    public String getFolha() {
        return folha;
    }

    /**
     *
     * @param folha
     */
    public void setFolha(String folha) {
        this.folha = folha;
    }

    /**
     *
     * @return
     */
    public String getTermo() {
        return termo;
    }

    /**
     *
     * @param termo
     */
    public void setTermo(String termo) {
        this.termo = termo;
    }
}
