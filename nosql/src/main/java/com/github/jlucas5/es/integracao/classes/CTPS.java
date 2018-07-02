package com.github.jlucas5.es.integracao.classes;

public class CTPS {

    private String serie;
    private String estado;

    /**
     *
     * @param serie
     * @param estado
     */
    public CTPS(String serie, String estado) {
        this.serie = serie;
        this.estado = estado;
    }

    /**
     *
     * @return
     */
    public String getSerie() {
        return serie;
    }

    /**
     *
     * @param serie
     */
    public void setSerie(String serie) {
        this.serie = serie;
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
}
