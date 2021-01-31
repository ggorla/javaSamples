package Collection02_list;

import common.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Shipment  implements Iterable<Product> {

    private  static final int LIGHT_VAN_MAX_WEIGHT = 20;

    private final List<Product> products = new ArrayList<>();
    private  List<Product> lightVan ;
    private List<Product> heavyVan ;
    public  void add(Product product){

        products.add(product);
    }
    public  boolean replace(Product oldProduct, Product newProduct){
        int position =products.indexOf(oldProduct);

        if(position == -1)
            return false;
        else
            products.set(position,newProduct);

        return true;
    }

    public boolean replaceAll(Product oldElement, Product newProduct){
        Collections.replaceAll(products,oldElement,newProduct);
        return true;
    }

    public  void prepare(){

       products.sort(Product.BY_WEIGHT);
       int splitPoint = findSplitPoint();
       lightVan = products.subList(0,splitPoint);
       heavyVan = products.subList(splitPoint,products.size());

    }
    private int findSplitPoint(){
        int size = products.size();
        for(int i = 0; i<size;i++){
            Product product = products.get(i);
            if(product.getWeight()>LIGHT_VAN_MAX_WEIGHT)
                return i;
        }
        return 0;
    }

    public List<Product> getHeavyVanProducts(){

        return heavyVan;
    }
    public List<Product> getLightVanProducts(){

        return lightVan;
    }


    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
