package com.github.jlucas5.es.integracao.main;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.github.jlucas5.es.integracao.classes.Individuo;

public class nosqlmain {
    /**
     * Para adicionar um individuo: @param add nome nomeMae sexo dataNascimento
     * Para pesquisar um indivíduo: @param find nome nomeMae sexo dataNascimento
     * Para listar todos os indivíduos: @param list
     * @param args
     */
    public static void main(String[] args) {

        ObjectContainer db = Db4o.openFile("database.db4o");

        if(args[0].equals("add")){
            //Adiciona o indivíduo
            addToDb(args[1],args[2],args[3],args[4], db);
        }else if (args[0].equals("find")){
                //busca o indivíduo
                searchIndividuo(args[1],args[2],args[3],args[4], db);
              } else if (args[0].equals("list")){
                        //Lista o indivíduo
                        retrieveAll(db);
                    } else System.out.println("parametros inválidos");

        db.close();
    }

    /**
     * Retorna todos os objetos do banco
     * @param db
     * @return
     */
    public static void retrieveAll(ObjectContainer db){
        ObjectSet result = db.queryByExample(Individuo.class);
        listResult(result);

    }

    /**
     * lista os objetos retornados
     * @param result
     */
    public static void listResult(ObjectSet result) {
        System.out.println(result.size());
        while(result.hasNext()) {
            System.out.println(result.next());
        }
    }

    /**
     * Busca um individuo com atributos iguais
     * @param name
     * @param nomeMae
     * @param sexo
     * @param data
     * @param db
     */
    public static void searchIndividuo(String name, String nomeMae, String sexo, String data, ObjectContainer db){
        Individuo individuo = new Individuo();
        individuo.getNome().setNomes(name);
        individuo.getDadoDemografico().setNomeMae(nomeMae);
        individuo.getDadoDemografico().setSexo(sexo);
        individuo.getDadoDemografico().getData().setData(data);
        ObjectSet result = db.queryByExample(individuo);
        listResult(result);
    }

    /**
     * Adiciona um indivíduo ao banco
     * @param name
     * @param nomeMae
     * @param sexo
     * @param data
     * @param db
     */
    public static void addToDb(String name, String nomeMae, String sexo, String data, ObjectContainer db){

        Individuo individuo = new Individuo();
        individuo.getNome().setNomes(name);

        individuo.getDadoDemografico().setNomeMae(nomeMae);
        individuo.getDadoDemografico().setSexo(sexo);
        individuo.getDadoDemografico().getData().setData(data);
        db.store(individuo);
        System.out.println("Individuo guardado com sucesso!");

    }

}




