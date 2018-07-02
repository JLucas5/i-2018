package com.github.jlucas5.es.integracao.classes;

public class DadoDemografico {

    private String Sexo;
    private String nomeMae;
    private String nomePai;
    private String situacaoFamiliar;
    private String raca;
    private String comentario;
    private String fonteNotObito;
    private String nascPluralidade;
    private String nascOrdem;
    private String nascSeguimento;


    private Data data;
    private Nacionalidade nacionalidade;
    /**
     *
     * @param sexo
     * @param nomeMae
     * @param nomePai
     * @param situacaoFamiliar
     * @param raca
     * @param comentario
     * @param fonteNotObito
     * @param nascPluralidade
     * @param nascOrdem
     * @param nascSeguimento
     * @param data
     * @param nacionalidade
     */
    public DadoDemografico(String sexo, String nomeMae, String nomePai, String situacaoFamiliar, String raca,
                           String comentario, String fonteNotObito, String nascPluralidade, String nascOrdem,
                           String nascSeguimento, Data data, Nacionalidade nacionalidade) {
        Sexo = sexo;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.situacaoFamiliar = situacaoFamiliar;
        this.raca = raca;
        this.comentario = comentario;
        this.fonteNotObito = fonteNotObito;
        this.nascPluralidade = nascPluralidade;
        this.nascOrdem = nascOrdem;
        this.nascSeguimento = nascSeguimento;
        this.data = data;
        this.nacionalidade = nacionalidade;
    }

    /**
     *
     * @return
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     *
     * @param sexo
     */
    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    /**
     *
     * @return
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     *
     * @param nomeMae
     */
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    /**
     *
     * @return
     */
    public String getNomePai() {
        return nomePai;
    }

    /**
     *
     * @param nomePai
     */
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    /**
     *
     * @return
     */
    public String getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    /**
     *
     * @param situacaoFamiliar
     */
    public void setSituacaoFamiliar(String situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    /**
     *
     * @return
     */
    public String getRaca() {
        return raca;
    }

    /**
     *
     * @param raca
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     *
     * @return
     */
    public String getComentario() {
        return comentario;
    }

    /**
     *
     * @param comentario
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     *
     * @return
     */
    public String getFonteNotObito() {
        return fonteNotObito;
    }

    /**
     *
     * @param fonteNotObito
     */
    public void setFonteNotObito(String fonteNotObito) {
        this.fonteNotObito = fonteNotObito;
    }

    /**
     *
     * @return
     */
    public String getNascPluralidade() {
        return nascPluralidade;
    }

    /**
     *
     * @param nascPluralidade
     */
    public void setNascPluralidade(String nascPluralidade) {
        this.nascPluralidade = nascPluralidade;
    }

    /**
     *
     * @return
     */
    public String getNascOrdem() {
        return nascOrdem;
    }

    /**
     *
     * @param nascOrdem
     */
    public void setNascOrdem(String nascOrdem) {
        this.nascOrdem = nascOrdem;
    }

    /**
     *
     * @return
     */
    public String getNascSeguimento() {
        return nascSeguimento;
    }

    /**
     *
     * @param nascSeguimento
     */
    public void setNascSeguimento(String nascSeguimento) {
        this.nascSeguimento = nascSeguimento;
    }

    /**
     *
     * @return
     */
    public Data getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     *
     * @return
     */
    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    /**
     *
     * @param nacionalidade
     */
    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
