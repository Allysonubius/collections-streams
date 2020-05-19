package com.example.CollectionsStreams.List;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*Exemplo 1 entendendo mais sobre Lists*/
public class Exemplo1 {
    public static void main(String[]args){
        List<String> nomes = new ArrayList<> ();
        /**
         * Metodo ADD = adiciona um nome a Lista.
         * */
            nomes.add("Carlos");
            nomes.add("Pedro");
            nomes.add("Juliana");
            nomes.add("Anderson");
            nomes.add("Maria");
            nomes.add("Joao");
            /*Impresão dos nomes*/
            System.out.println (nomes);
            /**
             * Ordem Alfabetica dos Nomes na Lista.
             * */
        Collections.sort (nomes);
        /**
         * Metodo SET = Altera o valor por outro.
         * */
        nomes.set(2,"Larissa");
        /*Impresão dos nomes*/
        System.out.println (nomes);
        /**
         * Metodo REMOVE = Remove o valor selecionado.
         * */
        nomes.remove (4);
        /*Impresão dos nomes*/
        System.out.println (nomes);
        /**
         * Metodo REMOVE = Remove o Objeto selecionado.
         * */
        nomes.remove ("Pedro");
        /*Impresão dos nomes*/
        System.out.println (nomes);
        /**
         * Metodo GET = Retorna o elemento dado indice.
         * */
        String nome = nomes.get (1);
        /*Impresão do metodo STRING ou seja, seu nome*/
        System.out.println (nome);
        /**
         * Metodo INT = Retorna o tamanho.
         * */
        int tamanho = nomes.size ();
        /*Impresão do metodo INT ou seja, seu TAMNANHO nome*/
        System.out.println (tamanho);
        /**
         * Metodo CONTAINS = Retorna verdadeiro ou falso se o elemento existir na Lista.
         * */
        boolean temAnderson = nomes.contains("Anderson");
        /*Impresão do metodo CONTAINS pergunta verdadeiro ou falso se há o objeto na Lista.*/
        System.out.println (temAnderson);
        /**
         * Metodo isEMPTY = Retorna verdadeiro ou falso se estiver vazia a LIsta.
         * */
        boolean listaEstaVazia = nomes.isEmpty();
        /*Impresão do metodo CONTAINS pergunta verdadeiro ou falso se estiver na lista.*/
        System.out.println (listaEstaVazia);
        /**
         * Metodo FOR =  Retorna o valor selecionado de forma interativa.
         * */
        for (String nomeDoItem : nomes){
            System.out.println ("--->" + nomeDoItem);
        }
        /**
         * MEdoto ITERATOR = Retorna o valor selecionado de forma interativa.
         * */
        Iterator<String> iterator = nomes.iterator ();
        //hasNext retorna um Booleano true ou falso;
        while (iterator.hasNext()){
            //Next retorna o elemento ou seja a String;
            System.out.println ("->" + iterator.next ());
        }
        /**
         * Metodo CLEAR =  Retorna a LISTA vazia apagando tudo.
         * */
        nomes.clear();
        System.out.println (nomes);
        /**
         * Metodo INDEXOF =  Retorna um inteiro nos trazendo o indice do valor selecionado.
         * */
        int posicao = nomes.indexOf ("Carlos");
        System.out.println (posicao);
        //Retornará -1 por não contér nada na lista.


    }
}
