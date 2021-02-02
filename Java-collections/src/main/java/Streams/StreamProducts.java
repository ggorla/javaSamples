package Streams;

import Collection03_map.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProducts {
    public static void main(String[] args) {
        Product door = new Product(1,"Wooden Door", 35);
        Product floorPanel = new Product(1,"Floor Panel", 25);
        Product window = new Product(1,"Glass Window", 10);

        List<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        products.add(floorPanel);
        products.add(window);
        //System.out.println(products);
        //namesofLightProductsSortedLoop(products);
        //namesofLightProductsSortedLoopStream(products);
        products.stream()
                .filter(product -> product.getWeight() < 29)
                .sorted(Comparator.comparingInt(Product::getWeight))
                .collect(Collectors.groupingBy(Product::getName));


       // System.out.println(lightProducts);
    }

    private static void namesofLightProductsSortedLoopStream(List<Product> products) {
        products
                .stream()
                .filter(product -> product.getWeight()<30)
                .sorted(Comparator.comparingInt(Product::getWeight))
                .map(Product::getName)
                .forEach(System.out::println);
    }

    private static void namesofLightProductsSortedLoop(List<Product> products) {
        List<Product> lightProducts = new ArrayList<>();
        for (Product product: products
             ) {
            if(product.getWeight()<30)
                lightProducts.add(product);
        }
        lightProducts.sort(Comparator.comparingInt(Product::getWeight));
        for(Product product: lightProducts)
            System.out.println(product.getName());
    }
}
