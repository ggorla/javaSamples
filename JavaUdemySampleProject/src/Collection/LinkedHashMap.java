package Collection;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<Integer,String> hm = new java.util.LinkedHashMap<Integer,String>();
        hm.put(100, "Amit");
        hm.put(102, "Amit");
        hm.put(101, "Amit");

        hm.put(99, "test");

        HashMap hm1 = new HashMap();

        for(Map.Entry<Integer, String> mapElement: hm.entrySet()){

            hm1.put(mapElement.getKey(), mapElement.getValue());
        }



    }
}
