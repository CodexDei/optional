package org.codexdei.optional.example.exercises;

import java.sql.SQLOutput;
import java.util.Optional;
import java.util.Scanner;

public class NumberOptional {

    public static void main(String[] args) {

    /* Crea un método que reciba un número entero y devuelva un Optional<Double> que contenga su raíz cuadrada
      si el número es positivo. Si el número es negativo, el Optional debe estar vacío */
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive or negative integer to find it's square root:");
        int number = sc.nextInt();

        Optional<Double> numberOpt = numberOpt(number);

        numberOpt.ifPresentOrElse(sqr ->
                System.out.println("The square root of " + number + " is: " + sqr),
                () -> System.out.println("There is no square root of a negative number")
                );
    }
    private static Optional<Double> numberOpt(int number){
        
        return (number >= 0) ? Optional.of(Math.sqrt(number)) : Optional.empty();
    }
}
