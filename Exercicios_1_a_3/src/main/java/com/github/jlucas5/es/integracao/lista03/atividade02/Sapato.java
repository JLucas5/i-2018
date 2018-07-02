package com.github.jlucas5.es.integracao.lista03.atividade02;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;


@JacksonXmlRootElement(localName = "sapato")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sapato extends Calcado {

    @XmlElement
    private int red;

    @XmlElement
    private int green;

    @XmlElement
    private int blue;

    public Sapato(String marca, float preco, int red, int green, int blue){
        this.setMarca(marca);
        this.setPreco(preco);
        this.red = red;
        this.green = green;
        this.blue = blue;
        }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    @Override
    public String toString(){
        return "Tenis de marca " + this.getMarca() + " - " +
                this.getPreco() + " reais - Cores > Azul: " +
                this.blue + " Vermelho: "  + this.red + " Verde: "
                + this.green;
    }
}
