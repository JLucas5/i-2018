package com.github.jlucas5.es.integracao.lista03.atividade02;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.codehaus.stax2.XMLInputFactory2;
import org.codehaus.stax2.XMLStreamReader2;

import javax.xml.stream.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws XMLStreamException, IOException {
        Path arquivoXML = Paths.get(args[0]);
        BufferedReader br = Files.newBufferedReader(arquivoXML, Charset.forName("UTF-8"));
        StringBuilder builder = new StringBuilder();

        XMLInputFactory2 f = (XMLInputFactory2) XMLInputFactory2.newFactory();
        XMLStreamReader2 sr = (XMLStreamReader2) f.createXMLStreamReader(new FileInputStream(args[0]));
        XmlMapper objectMapper = new XmlMapper();

        Calcado c = null;

        sr.next();//Aponta para o Elemento raiz
        sr.next();//Aponta para o Elemento abaixo do raiz

        while(!sr.isEndElement()) {

            try {
                if (sr.getLocalName().equals("tenis")) {
                    c = objectMapper.readValue(sr, Tenis.class);
                } else {
                    c = objectMapper.readValue(sr, Sapato.class);
                }
            } catch(UnrecognizedPropertyException e) {
                System.out.println("Não foi possível percorrer o arquivo, verifique-o e tente novamente");
            }

            System.out.println(c.toString());

            sr.next();
        }
    }
}
