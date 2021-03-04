package BasicStrong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingLamda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(32);
        list.add(1);
        list.add(12);
        list.add(13);
        System.out.println(list);
        Collections.sort(list, new myComprator());
        System.out.println(list);

        //using lamda expression
        Collections.sort(list, (o1,o2)->{
            if(o1>o2){
                return -1;
            }else if(o1<o2){
                return 1;
            }else
                return 0;
        });
        System.out.println("here using lamda"+list);
    }
}
class myComprator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2){
            return -1;
        }else if(o1<o2){
            return 1;
        }else
            return 0;
    }
}
