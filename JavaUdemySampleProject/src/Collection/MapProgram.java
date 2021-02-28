package Collection;

import java.util.HashMap;

public class MapProgram {
    public static void main(String[] args) {
        java.util.Map<String, String> languages = new HashMap<>();
        languages.put("Java","a Compiled high level");
        languages.put("Python","and interptied object-oriented");
        languages.put("go","The language");

        for(String key: languages.keySet()){
            System.out.println(key+":"+ languages.get(key));
        }
        if(languages.remove("Algo","A family of alghrorthmic languages")){
            System.out.println("Algo removed");
        }
        else
            System.out.println("Algo was not removed");

    }
}
