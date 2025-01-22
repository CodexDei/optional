package org.codexdei.optional.example.exercises;

import org.codexdei.optional.example.models.Product;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ProductOPtional {

    public static void main(String[] args) {

    /* Crea una clase Producto con atributos como id, nombre y precio.
       Implementa un método que reciba una lista de productos y un id,
       y devuelva el producto correspondiente usando Optional. Si no se
       encuentra el producto, devuelve un mensaje indicando que no existe.
    */
        int id = 5;

        List<Product> products = Arrays.asList(
        new Product(1, "Apple MacBook Air 15-inch M3", 5000000),
        new Product(2, "Lenovo ThinkBook Plus 6 Rollable", 6500000),
        new Product(3, "HP ZBook 14 Ultra G1a", 7000000),
        new Product(4, "Asus Zenbook 14 OLED Touch", 4500000),
        new Product(5, "Acer Aspire Vero 16", 3000000),
        new Product(6, "Samsung Galaxy Book5 Pro 16-inch", 4800000),
        new Product(7, "Lenovo Yoga Book 9i", 4600000),
        new Product(8, "Asus ROG Strix Scar G18", 12000000),
        new Product(9, "MSI Cyborg A17", 11000000),
        new Product(10, "Thinkpal T100 AI Learning Tablet", 4000000)
        );

        Optional<Product> productOpt = searchingProduct(products,id);

        productOpt.ifPresentOrElse(p ->
                System.out.println("product is:  " + p),
                () -> System.out.println("The product is not on the list"));

    }

    private static <T extends Product> Optional<T> searchingProduct(List<T> elements, int id) {

        return  elements.stream()
                .filter(element -> element.getId() == id)
                .findFirst()
                ;
    }
}
