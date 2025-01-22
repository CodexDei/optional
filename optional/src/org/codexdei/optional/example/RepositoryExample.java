package org.codexdei.optional.example;

import org.codexdei.optional.example.models.Computer;
import org.codexdei.optional.example.repository.ComputerRepository;
import org.codexdei.optional.example.repository.Repository;

public class RepositoryExample {

    public static void main(String[] args) {

        Repository<Computer> repo = new ComputerRepository();

        repo.filter("mac").ifPresentOrElse(System.out::println,
                                                 () -> System.out.println("Is not present"));
    }
}
