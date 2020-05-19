package com.example.CollectionsStreams.Set;

import java.util.Iterator;

public class LinkedHashSet {
    public static void main(String[]args) {
        java.util.LinkedHashSet<Integer> sequenciaNumerica = new java.util.LinkedHashSet<> ();
        //Adiconando os numeros no SET;
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(6);
        //Impressão da LinkedhashSet
        System.out.println (sequenciaNumerica);
        //Removendo o número do SET;
        sequenciaNumerica.remove(4);
        //Impressão após aplicado o .REMOVE no LinkedHashSet
        System.out.println (sequenciaNumerica);
        //Retorna a quantidade de items do LinkedHashSet, ou seja esta apresentando a quatidade de items !
        System.out.println (sequenciaNumerica.size ());
        //Navega em todos os items do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator ();
        //Metodo While
        while(iterator.hasNext ()){
            //Impressão do metodo While aplicado com .next
            System.out.println (iterator.next ());
        }
        //Metodo for
        for (Integer numero: sequenciaNumerica){
            //Impressão do metodo For
            System.out.println (numero);
        }
        //Retorna se o set esta vazio ou não
        System.out.println (sequenciaNumerica.isEmpty ());

    }
}
