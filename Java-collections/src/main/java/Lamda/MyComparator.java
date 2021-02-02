package Lamda;

public class MyComparator implements java.util.Comparator<myClass> {

    @Override
    public int compare(myClass o1, myClass o2) {
        return o1.getVersion().compareToIgnoreCase(o2.getVersion());
    }
}
