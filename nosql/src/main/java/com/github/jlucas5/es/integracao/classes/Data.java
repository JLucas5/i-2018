package com.github.jlucas5.es.integracao.classes;

public class Data {

    private String data;
    private String acuracia;

    /**
     *
     * @param data
     * @param acuracia
     */
    public Data(String data, String acuracia) {
        this.data = data;
        this.acuracia = acuracia;
    }

    /**
     *
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     *
     * @return
     */
    public String getAcuracia() {
        return acuracia;
    }

    /**
     *
     * @param acuracia
     */
    public void setAcuracia(String acuracia) {
        this.acuracia = acuracia;
    }
}
