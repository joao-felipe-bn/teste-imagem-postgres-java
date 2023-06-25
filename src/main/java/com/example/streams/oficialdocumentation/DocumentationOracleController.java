package com.example.streams.oficialdocumentation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DocumentationOracleController {

    public static void filterExample(){
        System.out.println("filterExample");

        List<Pessoa> pessoas = new Pessoa().populaPessoas();
        pessoas.stream()
                .filter(pessoa -> "Brasil".equals(pessoa.getNacionalidade()))
                .forEach(pessoa -> System.out.println("nome "+pessoa.getNome()));
     }

    public static void mapExample(){
        List<Pessoa> pessoas = new Pessoa().populaPessoas();
        Stream<Integer> stream = pessoas.stream().filter(pessoa -> "Brasil".equals(pessoa.getNacionalidade()))
                .map(Pessoa::getIdade);

        List<Integer> result = stream.collect(Collectors.toList());
        System.out.println("mapExample result: "+result);
    }

}
