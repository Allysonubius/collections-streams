package com.example.CollectionsStreams.Set;

import java.util.Iterator;

public class TreeSet {
    public static void main(String[]args){
        java.util.TreeSet treeCapitais = new java.util.TreeSet<> ();
        //Monta a arvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        //Impressão do metodo TreeSet
        System.out.println (treeCapitais);
        //Retorna a primeira capital no topo da arvore
        System.out.println (treeCapitais.first ());
        //Retorna a ultima capital no final da arvore
        System.out.println (treeCapitais.last ());
        //Retorna a primeira capital abaixo na arvore da capital parametrizado
        System.out.println (treeCapitais.lower ("Florianopolis"));
        //Retorna a primeira capital acima na arvore da capital parametrizado
        System.out.println (treeCapitais.higher ("Florianopolis"));
        //Exibe todas as capitais no console
        System.out.println (treeCapitais);
        //Retorna a primeira capital no topo da arvore, removendo do SET
        System.out.println (treeCapitais.pollFirst ());
        //Retorna a primeira capital no final da arvore, removendo do SET
        System.out.println (treeCapitais.pollLast ());
        //Exibe todas as capitais no console
        System.out.println (treeCapitais);
        //Navega em todos os items do iterator
        Iterator<String> iterator = treeCapitais.iterator ();
        //Metodo while
        while(iterator.hasNext ()){
            //Impressão com .next()
            System.out.println (iterator.next ());
        }

    }
}
