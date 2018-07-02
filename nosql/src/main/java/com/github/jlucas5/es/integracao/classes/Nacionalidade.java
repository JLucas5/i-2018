package com.github.jlucas5.es.integracao.classes;

public class Nacionalidade {

    private String municipio;
    private String estado;
    private String pais;
    private String dataDeEntradaPais;


    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDataDeEntradaPais() {
        return dataDeEntradaPais;
    }

    public void setDataDeEntradaPais(String dataDeEntradaPais) {
        this.dataDeEntradaPais = dataDeEntradaPais;
    }
}
