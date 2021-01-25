package Abstract;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        //String stringData ="Darwin Brisbane Perth Melbourne Canberra adelaide sydney";
        String stringData  = "5 6 3 7 9 1";
        String[] data = stringData.split(" ");
        for(String s: data){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());

        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());
    }
}
