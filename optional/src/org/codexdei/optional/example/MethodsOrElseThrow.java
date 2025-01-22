package org.codexdei.optional.example;

import org.codexdei.optional.example.models.Computer;
import org.codexdei.optional.example.repository.ComputerRepository;
import org.codexdei.optional.example.repository.Repository;

import java.util.Optional;

public class MethodsOrElseThrow {

    public static void main(String[] args) {

        Repository<Computer> repo = new ComputerRepository();

        Computer computer = repo.filter("Mac").orElseThrow(IllegalStateException::new);
        System.out.println(computer);

        //Ejemplo con manejo de extensiones
        String file = "document.pdf";
        String extension = Optional.ofNullable(file)
                .filter(doc -> doc.contains("."))
                .map(doc -> doc.substring(file.lastIndexOf(".")+1))
                .orElseThrow();
        System.out.println(extension);


    }
}
