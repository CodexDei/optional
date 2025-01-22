package org.codexdei.optional.example.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GreaterNumber {

    public static void main(String[] args) {

        /* Escribe un programa que reciba una lista de números enteros y devuelva el mayor número
           de la lista utilizando Optional. Si la lista está vacía, devuelve un mensaje indicando
           que no hay elementos. */
        System.out.println("how many numbers");

        List<Integer> numberList = Arrays.asList(3,5,15,20,30,45,7,100,59,77);

        Optional<Integer> number = numberList.stream()
                .max(Integer::compareTo)
               //otra opcion en vez de max es reduce:
               // .reduce(Integer::max)
                ;
        number.ifPresentOrElse(n ->
                System.out.println("The greater number is:" + n),
                () -> System.out.println("Empty list"));

    }
}
