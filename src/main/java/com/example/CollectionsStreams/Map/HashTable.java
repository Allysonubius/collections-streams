package com.example.CollectionsStreams.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[]args){
        Hashtable<String,Integer> Estudantes = new Hashtable<> ();
        //Entrada do metodo PUT
        Estudantes.put("Carlos",21);
        Estudantes.put("Mariana",33);
        Estudantes.put("Rafaela",18);
        Estudantes.put("Pedro",44);
        //Impressão da lista
        System.out.println (Estudantes);
        //Alteração do valor
        Estudantes.put("Pedro",55);
        //Impressão da lista
        System.out.println (Estudantes);
        //Remove um estudante do indice
        Estudantes.remove("Pedro");
        //Impressão da lista
        System.out.println (Estudantes);
        //Recupera um estudante do indice selecionado
        int idadeEstudantes = Estudantes.get("Mariana");
        //Impressão do INT idadeEstudantes
        System.out.println (idadeEstudantes);
        //Impressão da lista
        System.out.println (Estudantes);
        //Navega nos registros do mapa
        for (Map.Entry<String, Integer>entry: Estudantes.entrySet ()){
            //Impressão do metodo getKey e getValue
            System.out.println (entry.getKey ()+"-"+entry.getValue ());
        }
        //Navega nos registros do mapa
        for(String key: Estudantes.keySet ()){
            //Impressão da Key com get(key)
            System.out.println (key+"-"+ Estudantes.get(key));
        }
    }
}
