package com.github.jlucas5.es.integracao.lista03.atividade01;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvToXml {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));

        String separacao = ";";
        String data;
        String xmlData = "<alunos>\n";

        while((data = br.readLine()) != null) {

            String[] aluno = data.split(separacao);


            //Faz a junção manual do xml
            xmlData += "<aluno>\n";
            xmlData += "<nome>" + aluno[0] + "</nome>\n";
            xmlData += "<email>" + aluno[1] + "</email>\n";
            xmlData += "</aluno>\n";
        }

        xmlData += "</alunos>";

        FileOutputStream fos = new FileOutputStream(args[0].substring(0, args[0].length() - 3) + "xml");

        fos.write(xmlData.getBytes());

        br.close();
        fos.close();
    }
}
