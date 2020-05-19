package com.example.CollectionsStreams.Map;

import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[]args){
        TreeMap<String,String> treeCapitais = new TreeMap<> ();
        //Monta a árvore com as capitais
        treeCapitais.put ("RS","Porto Alegre");
        treeCapitais.put ("SC","Florianopolis");
        treeCapitais.put ("PR","Curitiba");
        treeCapitais.put ("SP","São Paulo");
        treeCapitais.put ("RJ","RIo de Janeiro");
        treeCapitais.put ("BH","Belo Horizonte");
        //Impressão da Lista
        System.out.println (treeCapitais);
        //Retorna a primeira capital no topo da arvore
        System.out.println (treeCapitais.firstKey ());
        //Retorna a ultima capital no fim da arvore
        System.out.println (treeCapitais.lastKey ());
        //Retorna a primeira capital abaixo da capital parametrizada
        System.out.println (treeCapitais.lowerKey ("SC"));
        //Retorna a primeira capital acima da capital parametrizada
        System.out.println (treeCapitais.higherKey ("SC"));
        //Exibe todas as capitais no console;
        System.out.println (treeCapitais);
        //Retorna a primeira capital no topo da arvore
        System.out.println (treeCapitais.firstEntry ().getKey ()+"-"+treeCapitais.firstEntry ().getValue ());
        //Retorna a ultima capital no final da arvore
        System.out.println (treeCapitais.lastEntry ().getKey ()+"-"+treeCapitais.lastEntry ().getValue ());

    }
}
