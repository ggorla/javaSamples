package Streams;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FactoryUnmodifiableMap {
    public static void main(String[] args) {
        Map<String, Integer> mutableCountryToPopulation = new HashMap<>();
        mutableCountryToPopulation.put("UK", 67);
        mutableCountryToPopulation.put("USA",328);

        Map<String, Integer> unmodifiableMapCountryToPop = Collections.unmodifiableMap(mutableCountryToPopulation);
        System.out.println("unmodifableCountrytoPop="+ unmodifiableMapCountryToPop);
        mutableCountryToPopulation.put("Germeny",83);
        System.out.println("unmodifableCountrytoPop="+ unmodifiableMapCountryToPop);
    }
}
