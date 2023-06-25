package com.example.streams.lista_impares;

import java.util.ArrayList;
import java.util.List;

public class ListaImparesController {


    public static void retornarListaImpar() {

        List<Integer> lista = loadList();

        System.out.println("Lista full: "+lista);

        lista.stream().filter(e -> e % 2 != 0).forEach(System.out::println);
    }

    private static List<Integer> loadList(){
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        return lista;
    }

}
