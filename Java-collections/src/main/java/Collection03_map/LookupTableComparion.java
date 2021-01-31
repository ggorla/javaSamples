package Collection03_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
//not working
public class LookupTableComparion {
    private static final int ITERATIONS= 5;
    private  static  final int NUMBER_OF_PRODUCTS = 20000;
    
    private static final List<Product> product = generateProducts();

    public static void main(String[] args) {
        runLookup(new MapProductLookupTable());
        runLookup(new NavieProductLookupTable());
    }
    private static List<Product> generateProducts() {
        final List<Product> products = new ArrayList<>();
        final Random weightGenerator = new Random();
        for(int i=0; i<NUMBER_OF_PRODUCTS;i++)
            products.add(new Product(i, "Product"+i,10+weightGenerator.nextInt()));

        Collections.shuffle(products);
        Collections.shuffle(products);
        Collections.shuffle(products);
        return  products;

    }

    private static void runLookup(final ProductLookupTable lookupTable){
        final List<Product> products = LookupTableComparion.product;
        System.out.println("Running lookups with " + lookupTable.getClass().getSimpleName());

        for (int i = 0; i < ITERATIONS; i++)
        {
            final long startTime = System.currentTimeMillis();

            for (Product product : products)
            {
                lookupTable.addProduct(product);
            }

            for (Product product : products)
            {
                final Product result = lookupTable.lookupByID(product.getId());
                if (result != product)
                {
                    throw new IllegalStateException("Lookup Table returned wrong result for " + product);
                }
            }

            lookupTable.clear();

            System.out.println(System.currentTimeMillis() - startTime + "ms");
        }
    }
}