package org.codexdei.optional.example.exercises;

import org.codexdei.optional.example.models.Email;
import org.codexdei.optional.example.models.User;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Optional;

public class EmailOptional {

    public static void main(String[] args) {

        /* Crea un sistema de gestión de usuarios donde cada usuario tiene
        un Optional<Email>. Escribe un método que reciba un Optional<Usuario>
        y devuelva el dominio del correo electrónico del usuario si existe.
        Maneja correctamente los casos en los que el usuario o el email
        estén ausentes. */

        User userWithEmail = new User("Pepe", Optional.of(new Email("pepe@correo.com")));
        User userWithoutEmail = new User("Jazmin", Optional.empty());

        confirmEmail(Optional.of(userWithEmail));
        confirmEmail(Optional.of(userWithoutEmail));
        confirmEmail(Optional.empty());

    }

    private static void confirmEmail(Optional<User> optionalUser) {

        String emailDomain = optionalUser
                .map(user -> user.getEmail()
                    .map(Email::getEmail)//obtener email
                    .filter(email -> email.contains("@"))
                    .map(e -> e.substring(e.indexOf("@")+1))
                    .orElse("The user does not Email for the user: " + user.getName()))
                .orElse("The user does not exist")
                ;
        System.out.println(emailDomain);
    }
}
