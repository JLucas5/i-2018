package com.github.jlucas5.es.integracao.lista03.atividade02;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@JacksonXmlRootElement(localName = "tenis")
@XmlAccessorType(XmlAccessType.FIELD)
public class Tenis extends Calcado {

    @XmlElement
    private String esporte;


    public Tenis(String marca, float preco, String esporte){

        this.setMarca(marca);
        this.setPreco(preco);
        this.esporte = esporte;

    }

    @Override
    public String toString(){
        return "Tenis de marca " + this.getMarca() + " - " +
                this.getPreco() + " reais - Para jogar " + this.esporte;
    }
}
