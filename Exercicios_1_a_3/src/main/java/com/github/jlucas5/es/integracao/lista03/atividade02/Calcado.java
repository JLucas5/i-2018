package com.github.jlucas5.es.integracao.lista03.atividade02;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@JacksonXmlRootElement(localName = "calcados")
@XmlAccessorType(XmlAccessType.FIELD)
public class Calcado {

    @XmlElement
    private String marca;

    @XmlElement
    private float preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
