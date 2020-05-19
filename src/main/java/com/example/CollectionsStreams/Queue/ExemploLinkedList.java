package com.example.CollectionsStreams.Queue;
//importado LinkedList
import java.util.Iterator;
import java.util.LinkedList;
//importado Queue
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[]args){
        //importado LinkedList
        Queue<String> filaBanco = new java.util.LinkedList<> ();
        //Adicionado pessoas a lista de espera do banco
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        //Impressão
        System.out.println (filaBanco);
        //O metodo poll chama a próxima pessoa e exclue o mesmo já atendido.
        String clienteSerAtendido = filaBanco.poll ();
        //Impressão
        System.out.println (clienteSerAtendido);
        //Fila do banco após adição do metodo POLL!
        System.out.println (filaBanco);
        //O metodo PEEK retorna o primeiro elemento da fila, caso esteja vazio retorna NULL por não haver ninguém na fila;
        String primeiroCliente = filaBanco.peek ();
        //Fila do banco após adição do metodo PEEK;
        System.out.println (primeiroCliente);
        //O metodo element retorna o primeiro elemento da fila e não remove, casos esteja vazio retorna um ERRO;
        String primeiroClienteOrErro = filaBanco.element ();
        //Fila do banco após adição do metodo ELEMENT;
        System.out.println (primeiroClienteOrErro);
        //Impressão da fila inicial ;
        System.out.println (filaBanco);
        //Metodo FOR
        for (String client: filaBanco){
            System.out.println (client);
        }
        //Metodo ITERATOR
        Iterator<String> iteratorFilaBanco = filaBanco.iterator ();
        //Metodo WHILE
        while (iteratorFilaBanco.hasNext ()){
            System.out.println (iteratorFilaBanco);
        }
    }
    // O elemento poll = ele retorna e remove o primeiro elemento da fila;
    // O elemento peel = ele retorna e não remove o primeiro elemento da fila;
    // O elemento element = ele retorna e não remove o primeiro elemento da fila, havendo execeção se houver vazio retorna vazio;
}
