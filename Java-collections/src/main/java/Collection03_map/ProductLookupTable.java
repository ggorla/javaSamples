package Collection03_map;


public interface ProductLookupTable {
    Product lookupByID(int id);
    void addProduct(Product productToadd);
    void clear();
}
