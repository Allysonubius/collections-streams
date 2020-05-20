package com.example.CollectionsStreams.Optional;

import java.util.Optional;

public class OptionalEstado {
    public static void main(String[]args){
        Optional<String>optionalString = Optional.of("Valor presente");

        System.out.println ("Valor opcional que está presente");
        optionalString.ifPresentOrElse (System.out::println, () -> System.out.println ("não esta presente"));

        Optional<String>optionalNull = Optional.ofNullable (null);

        System.out.println ("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse (System.out::println,()-> System.out.println ("null = não está presente"));

        Optional<String>emptyOptional = Optional.empty ();

        System.out.println ("Valor opcional que não estrá presente");
        emptyOptional.ifPresentOrElse (System.out::println,() -> System.out.println ("Empty = não está presente"));

        Optional<String>optionalNullErro = Optional.of(null);

        System.out.println ("Valor opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse (System.out::println,()->System.out.println ("Erro = não esta presente"));
    }
}
