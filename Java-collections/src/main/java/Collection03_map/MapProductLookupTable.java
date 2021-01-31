package Collection03_map;

import java.util.HashMap;
import java.util.Map;

public class MapProductLookupTable implements ProductLookupTable{
    private Map<Integer, Product> idToProduct = new HashMap<>();

    @Override
    public Product lookupByID(int id) {
            return idToProduct.get(id);
    }

    @Override
    public void addProduct(Product productToadd) {
        int id  = productToadd.getId();
        if(idToProduct.containsKey(id)){
            throw new IllegalArgumentException(
                    "Unable to add product deplicate id for"+ productToadd);

        }
    }

    @Override
    public void clear() {
        idToProduct.clear();
    }
}
