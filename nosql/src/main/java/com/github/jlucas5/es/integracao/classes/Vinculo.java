package com.github.jlucas5.es.integracao.classes;

public class Vinculo {

    private String relacionamento;
    private String dataInicio;
    private String dataFinal;

    /**
     *
     * @param relacionamento
     * @param dataInicio
     * @param dataFinal
     */
    public Vinculo(String relacionamento, String dataInicio, String dataFinal) {
        this.relacionamento = relacionamento;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public String getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }
}
