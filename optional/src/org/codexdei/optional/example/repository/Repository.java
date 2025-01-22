package org.codexdei.optional.example.repository;

import org.codexdei.optional.example.models.Computer;

import java.util.Optional;

public interface Repository<T> {

    Optional<Computer> filter(String name);
}
