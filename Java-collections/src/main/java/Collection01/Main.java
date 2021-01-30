package Collection01;

import common.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product wiondow = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();

        products.add(door);
        products.add(floorPanel);
        products.add(wiondow);

        Collection<Product>  toRemove = new ArrayList<>();
        toRemove.add(door);
        toRemove.add(floorPanel);
        products.removeAll(toRemove);
        //single line printing
        //[Product{name='Wooden Door', weight=35}, Product{name='Floor Panel', weight=25}, Product{name='Glass Window', weight=10}]
        //System.out.println(products);

        // to modify the list we have to user iterator
        Iterator<Product> iterator = products.iterator();
        while( iterator.hasNext()){
            Product product = iterator.next();
            if(product.getWeight()>20){
                iterator.remove();
            }
        }
        /*
        for (Product product :
                products) {
            if(product.getWeight()>20){
                //trying to remove/adding while looping is probhited
                //ERROR: concurrent array list
                products.remove(product);
            }
            System.out.println(product);
        }
         */
    }
}
