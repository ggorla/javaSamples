package Collection03_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewOverMaps {
    public static void main(String[] args) {
        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1,ProductFixtures.door );
        idToProduct.put(2,ProductFixtures.floorPanel );
        idToProduct.put(3,ProductFixtures.window );

        Set<Integer> ids = idToProduct.keySet();

        /*for (Product products:idToProduct.values()
             ) {

            System.out.println(products.getName());
            System.out.println(products.getId());

        }

         */
        Collection<Product> products = idToProduct.values();
        //System.out.println(ids);
        //System.out.println(idToProduct);
        //removing methods
        //products.remove(ProductFixtures.window);
        //idToProduct.keySet().remove(1);
        
        System.out.println(ids);
        System.out.println(idToProduct);

        Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();
        for(Map.Entry<Integer,Product> entry: entries){
            entry.setValue(ProductFixtures.window);
        }
        System.out.println(ids);
        System.out.println(idToProduct);
        Map.Entry<Integer, Product> entry = Map.entry(4,ProductFixtures.floorPanel);
        entries.add(entry);
    }
}
