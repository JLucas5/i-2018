package com.github.jlucas5.es.integracao.l3a1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVNomeEmail {

    public static void main(String[] path) throws IOException {

        String csvPath = "D:\\arquivo.csv";
        String xmlPath = csvPath.replace(".csv",".xml");
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(csvPath));
            String[] studentLines = {};


            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                studentLines = line.split("\n");

                for (String person : studentLines) {

                    Aluno aluno = new Aluno();
                    String[] studentData = person.split(";");

                    aluno.setName(studentData[0]);
                    aluno.setEmail(studentData[1]);
                    System.out.println(studentData[0]);

                    System.out.println(studentData[1]);
                    alunos.add(aluno);

                }
            }
            ListaAlunos lista = new ListaAlunos();
            lista.setAlunos(alunos);

            ObjectMapper objectMapper = new XmlMapper();

            File xml = new File(xmlPath);

            objectMapper.writeValue(xml,lista);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
