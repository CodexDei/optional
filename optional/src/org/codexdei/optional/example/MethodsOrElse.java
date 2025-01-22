package org.codexdei.optional.example;

import org.codexdei.optional.example.models.Computer;
import org.codexdei.optional.example.repository.ComputerRepository;
import org.codexdei.optional.example.repository.Repository;

public class MethodsOrElse {

    public static void main(String[] args) {

        Repository<Computer> repo = new ComputerRepository();
        //El siguiente ejemplo demuestra que orElseGet es mejor
        //Ya que no ejecuta nada del metodo 'defect()' cuando
        //encuentra el valor, lo cual es lo correcto, porque hacerlo
        //genera mas gastos de recursos, lo cual hace orElse, que
        //aunque no comete el error de mostrar el valor por defecto siendo
        //que existe el objeto, si alcanza a ejecutar la linea de codigo que imprime
        //lo cual no hace OrElseGet y es lo correcto pues no genera mas gasto de recursos
        Computer computer = repo.filter("Mac").orElse(defect());
        System.out.println(computer);

        computer = repo.filter("Asus").orElseGet(MethodsOrElse::defect);
        System.out.println(computer);
    }

    private static Computer defect() {

        System.out.println("Obtener valor por defecto!!");

        return new Computer("HP","Pavilion Aero 13-bg0002la");
    }
}
