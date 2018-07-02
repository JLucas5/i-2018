package com.github.jlucas5.es.integracao.main;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.github.jlucas5.es.integracao.classes.Individuo;

public class nosqlmain {

    public static void main(String[] args) {

        ObjectContainer db = Db4o.openFile("database.db4o");
        db.close();

        Individuo individuo = new Individuo();


    }

    public static ObjectSet retrieveAll(ObjectContainer db){
        ObjectSet result = db.queryByExample(Individuo.class);
        return result;

    }

    public static void listResult(ObjectSet result) {
        System.out.println(result.size());
        while(result.hasNext()) {
            System.out.println(result.next());
        }
    }


    public static void searchIndividuo(String name, String nomeMae, String sexo, String data, ObjectContainer db){
        Individuo individuo = new Individuo();
        individuo.getNome().setNomes(name);
        individuo.getDadoDemografico().setNomeMae(nomeMae);
        individuo.getDadoDemografico().setSexo(sexo);
        ObjectSet result = db.queryByExample(individuo);
    }


    public void addToDb(Individuo individuo, ObjectContainer db){
     db.store(individuo);
        System.out.println("Individuo guardado com sucesso!");

    }


    public void searchdb(){

    };
}




