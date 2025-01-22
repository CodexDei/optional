package org.codexdei.optional.example.repository;

import org.codexdei.optional.example.models.Computer;
import org.codexdei.optional.example.models.Manufacturer;
import org.codexdei.optional.example.models.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputerRepository implements Repository<Computer>{

    List<Computer> dataSource;

    public ComputerRepository(){

        dataSource = new ArrayList<>();

        Computer asus = new Computer("Asus","Zenbook S16 OLED");
        Processor i9 = new Processor("i9-14900KS", new Manufacturer("Intel"));
        asus.setProcessor(i9);

        Computer mac = new Computer("Mac","MacBook Pro 16");
        Processor rizen9 = new Processor("Ryzen 9",new Manufacturer("AMD"));
        mac.setProcessor(rizen9);

        dataSource.add(asus);
        dataSource.add(mac);
    }

    @Override
    public Optional<Computer> filter(String name) {

        return dataSource.stream()
                .filter(computer -> computer.getName().toLowerCase().contains(name.toLowerCase()))
                .findFirst();
//        for (Computer c : dataSource){
//
//            if (c.getName().equalsIgnoreCase(name)){
//                return Optional.of(c);
//            }
//        }
//        return Optional.empty();
    }
}
