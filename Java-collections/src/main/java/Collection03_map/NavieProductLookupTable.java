package Collection03_map;


import java.util.ArrayList;
import java.util.List;

public class NavieProductLookupTable implements ProductLookupTable{
    private final List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product productToadd) {
        int id = productToadd.getId();
        products.contains(productToadd);
        for (Product product: products
             ) {
            if(product.getId()== id){
                throw new IllegalArgumentException(
                        "unable to add product duplicate Id for"+ product);

            }

        }
        products.add(productToadd);
    }

    @Override
    public Product lookupByID(int id) {
        for (Product product: products) {
            if(product.getId()== id)
                return product;
        }
        return null;
    }



    @Override
    public void clear() {

        products.clear();
    }
}
