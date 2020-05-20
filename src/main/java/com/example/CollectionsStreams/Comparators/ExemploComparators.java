package com.example.CollectionsStreams.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploComparators {
    public static void main(String[]args){
        List<Estudante> estudantes = new ArrayList<> ();
        //Adicionando novos elementos
        estudantes.add(new Estudante ("Pedro",19));
        estudantes.add(new Estudante ("Carlos",23));
        estudantes.add(new Estudante ("Mariana",21));
        estudantes.add(new Estudante ("João",18));
        estudantes.add(new Estudante ("Thiago",20));
        estudantes.add(new Estudante ("George",22));
        estudantes.add(new Estudante ("Larissa",21));
        System.out.println ("Ordem de insercaoo");
        //Impressão
        System.out.println (estudantes);
        estudantes.sort ((first,second)-> first.getIdade ()- second.getIdade ());
        System.out.println ("--- Ordem nautal dos números - idade ---");
        System.out.println (estudantes);
        estudantes.sort((firts,second)-> second.getIdade () - firts.getIdade ());
        System.out.println ("--- Ordem reversa dos números - idade ---");
        System.out.println (estudantes);
        estudantes.sort((Comparator.comparingInt (Estudante::getIdade)));
        System.out.println ("---Ordem natural dos números - idade (method references) ---");
        System.out.println (estudantes);
        estudantes.sort((Comparator.comparingInt (Estudante::getIdade).reversed ()));
        System.out.println ("--- Ordem reversa dos números - idade (Method reference) ---");
        System.out.println (estudantes);
        Collections.sort(estudantes);
        System.out.println ("--- Ordem nautural dos numeros - idade (Interface Comparable) ---");
        System.out.println (estudantes);
        Collections.sort(estudantes, new EstudanteOrdemReversa ());
        System.out.println ("--- Ordem Reversa dos numeros - idade (Interface Comparator ---");
        System.out.println (estudantes);

    }
}
