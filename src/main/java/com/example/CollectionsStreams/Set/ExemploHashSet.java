package com.example.CollectionsStreams.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[]args){
        Set<Double> notasAlunos = new HashSet<> ();
        //Adicionando as notas no SET;
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add (6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        //Impressão de notas !
        System.out.println (notasAlunos);
        //Remove a nota do Set !
        notasAlunos.remove(3.8);
        //Impressão da nota removida com 3.8
        System.out.println (notasAlunos);
        //Retorna a quantidade de itens do SET
        System.out.println (notasAlunos.size ());
        //Navega em todos os items do iterator
        Iterator<Double> iterator = notasAlunos.iterator ();
        //Metodo while
        while(iterator.hasNext ()){
            System.out.println (iterator.next ());
        }
        // Metodo FOR
        for (Double nota: notasAlunos){
            System.out.println (nota);
        }
        // Limpando tudo com o metodo CLEAR
        notasAlunos.clear ();
        //Retornando se o SET esta vazio ou não com o metodo isEMPTY
        System.out.println (notasAlunos.isEmpty ());

    }
}
