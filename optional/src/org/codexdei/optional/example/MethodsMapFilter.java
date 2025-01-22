package org.codexdei.optional.example;

import org.codexdei.optional.example.models.Computer;
import org.codexdei.optional.example.models.Manufacturer;
import org.codexdei.optional.example.models.Processor;
import org.codexdei.optional.example.repository.ComputerRepository;
import org.codexdei.optional.example.repository.Repository;

public class MethodsMapFilter {

    public static void main(String[] args) {

        Repository<Computer> repo = new ComputerRepository();

        String mf = repo.filter("Mac")
                .map(Computer::getProcessor)
                .map(Processor::getManufacturer)
                .filter(f -> "intel".equalsIgnoreCase(f.getName()))
                .map(Manufacturer::getName)
                .orElse("unknown");

        System.out.println(mf);
    }

}
