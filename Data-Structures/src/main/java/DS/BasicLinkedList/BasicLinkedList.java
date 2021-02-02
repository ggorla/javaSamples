package DS.BasicLinkedList;

public class BasicLinkedList <X>{

    private Node first;
    private Node last;
    private int nodeCount;
    public BasicLinkedList() {
        first = null;
        last = null;
        nodeCount = 0;
    }

    public int size(){
        return nodeCount;
    }
    public void add(X item){
        if(first == null){
            first = new Node(item);
            last = first;
        }
        else{
            Node newLastNode = new Node(item);
            last.setNextNode(newLastNode);
            last = newLastNode;
        }
        nodeCount++;
    }
    public void insert(X item, int position){
        if(size()<position)
            throw new IllegalStateException(" smaller thatn the postion");
        Node currentNode = first;
        for(int i = 1; i<position && currentNode!= null;i++){
            currentNode = currentNode.getNextNode();
        }
        Node newNode = new Node(item);
        Node nextNode = currentNode.getNextNode();
        currentNode.setNextNode(nextNode);
        newNode.setNextNode(nextNode);
        nodeCount++;
    }
    public X removeAt(int postion){
        if(first==null)
            throw new IllegalStateException("empty");
        Node currentNode = first;
        Node prevNode = first;
        for(int i =1; i<postion && currentNode!=null;i++ ){
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        X nodeItem = currentNode.getNodeItem();
        prevNode.setNextNode(currentNode.getNextNode());
        nodeCount--;
        return  nodeItem;
    }
    public X get(int postion){
        if(first==null){
            throw  new IllegalStateException("empty");
        }
        Node current = first;
        for (int i=1;i<size() && current!= null;i++){
            if(i==postion)
                return current.getNodeItem();
            current = current.getNextNode();
        }
        return null;
    }

    public int find(X item){
        if( first==null)
            throw new IllegalStateException("empty");
        Node currentNode = first;
        for(int i = 1; i<size()&& currentNode!=null;i++){
            if(currentNode.getNodeItem().equals(item))
                return i;
            currentNode = currentNode.getNextNode();
        }
        return -1;

    }
    public  X remove(){
        if(first== null){
            throw new IllegalStateException("The LinkedList is empty and there are no items");
        }
        X nodeItem = first.getNodeItem();;
        first= first.getNextNode();
        nodeCount--;
        return nodeItem;
    }
    private class Node{
        private  Node nextNode;
        private X nodeItem;

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public X getNodeItem() {
            return nodeItem;
        }

        public void setNodeItem(X nodeItem) {
            this.nodeItem = nodeItem;
        }

        public Node(X nodeItem) {
            this.nextNode = null;
            this.nodeItem = nodeItem;
        }
    }

}
