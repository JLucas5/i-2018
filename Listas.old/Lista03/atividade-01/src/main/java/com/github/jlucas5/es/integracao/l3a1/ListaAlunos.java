package com.github.jlucas5.es.integracao.l3a1;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@JsonPropertyOrder({"aluno"})
public class ListaAlunos {
    private ArrayList<Aluno> alunos;

    public ArrayList<Aluno> getAlunos(){
            return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos){
        this.alunos = alunos;
    }
}
