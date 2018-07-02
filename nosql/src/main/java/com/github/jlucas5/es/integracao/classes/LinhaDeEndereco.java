package com.github.jlucas5.es.integracao.classes;

public class LinhaDeEndereco {

    private String ordem;
    private String linha;

    /**
     *
     * @param ordem
     * @param linha
     */
    public LinhaDeEndereco(String ordem, String linha) {
        this.ordem = ordem;
        this.linha = linha;
    }

    /**
     *
     * @return
     */
    public String getOrdem() {
        return ordem;
    }

    /**
     *
     * @param ordem
     */
    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    /**
     *
     * @return
     */
    public String getLinha() {
        return linha;
    }

    /**
     *
     * @param linha
     */
    public void setLinha(String linha) {
        this.linha = linha;
    }
}
