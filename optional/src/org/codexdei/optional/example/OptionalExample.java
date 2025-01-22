package org.codexdei.optional.example;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String name = "Angel";
        //Solo usar 'of' si estamos seguros que no lanza un null
        //sino estamos seguros es mejor usar ofNullable
        Optional<String> opt = Optional.of(name);

        System.out.println(opt.isPresent());
        System.out.println("opt = " + opt);
        System.out.println(opt.isEmpty());

        opt.ifPresent(value -> System.out.println(value));
        
        name = "George";
        opt = Optional.ofNullable(name);
        System.out.println("opt = " + opt);
        System.out.println(opt.isEmpty());
        System.out.println(opt.isPresent());

        opt.ifPresentOrElse( value -> System.out.println("Hello " + value),
                                      () -> System.out.println("Is not present"));
    }
}
