package org.codexdei.optional.example.exercises;

import org.codexdei.optional.example.models.Email;
import org.codexdei.optional.example.models.User;

import java.util.Optional;

public class EmailOptional {

    public static void main(String[] args) {

        /* Crea un sistema de gestión de usuarios donde cada usuario tiene
        un Optional<Email>. Escribe un método que reciba un Optional<Usuario>
        y devuelva el dominio del correo electrónico del usuario si existe.
        Maneja correctamente los casos en los que el usuario o el email
        estén ausentes. */

        User user = new User("Pepe", Optional.of(new Email("pepe@correo.com")));

        Optional<String> emailConfirm = Optional.of(String.valueOf(user));

        emailConfirm.ifPresentOrElse(u ->
                confirmEmail(user),
                () -> System.out.println("The user can not empty"));

        emailConfirm.ifPresentOrElse(email ->
                System.out.println("The email domain is: " + email),
                () -> System.out.println("The user not email"));

    }

    private static <T extends User> Optional<String> confirmEmail(T obj) {

        Optional<String> userOpt = obj.getEmail()
                .flatMap(Email::getEmail)
                .map()
                ;
        return userOpt;
    }
}
