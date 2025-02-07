package org.codexdei.optional.example.models;

import java.util.Optional;

public class User {

    private String name;
    private Optional<Email> email;

    public User(String name, Optional<Email> email) {
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Optional<Email> getEmail() {
        return email;
    }
    public void setEmail(Optional<Email> email) {
        this.email = email;
    }

    @Override
    public String toString(){

        return "Name:" + name + " , " + "Email:" + email;
    }

}
