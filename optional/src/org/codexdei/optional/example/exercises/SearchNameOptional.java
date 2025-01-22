package org.codexdei.optional.example.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SearchNameOptional {

    public static void main(String[] args) {

/* Escribe un programa que reciba una lista de nombres y utilice Optional
   para buscar un nombre específico en la lista. Si el nombre existe, imprímelo
   en mayúsculas; de lo contrario, imprime un mensaje indicando que no se encontró el nombre. */

        List<String> namesList = Arrays.asList("Pepe","Jazmin", "Andrea", "Juana", "Mateo");

        String searchName = "Jorge";

        Optional<String> name = namesList.stream()
                .filter(n -> n.equalsIgnoreCase(searchName))
                .findFirst();

        System.out.println("Status:" + name);

        name.ifPresentOrElse(value ->
                                System.out.println("value = " + value.toUpperCase()),
                                () -> System.out.println("No se encuentra el nombre '" + searchName + "'"));
    }
}
