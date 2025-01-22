package org.codexdei.optional.example.models;

public class Processor {

    private String name;
    private Manufacturer manufacturer;

    public Processor(String name, Manufacturer manufacturer){

        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName(){

        return this.name;
    }

    public void setName(){

        this.name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString(){

        return "Processor: " + name;
    }
}
