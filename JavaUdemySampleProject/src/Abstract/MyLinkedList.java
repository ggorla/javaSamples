package Abstract;

public class MyLinkedList implements NodeList {
    private  Listitem root=null;

    public MyLinkedList(Listitem root) {

        this.root = root;
    }

    @Override
    public Listitem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(Listitem newItem) {
        if(this.root == null) {
            this.root = newItem;
            return true;
        }
        Listitem currentItem = this.root;
        while(currentItem != null){
            int comprision = (currentItem.compareTo(newItem));
            if(comprision<0){
                //newItem is greater move right if  possible
                if(currentItem.next()!=null){
                    currentItem =  currentItem.next();
                }else{
                    //there is no next so insert at the end
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return  true;
                }
            }
            else if (comprision>0){
                //newItem is less Inser before
                if(currentItem.previous()!= null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);

                }else{
                    //the Node with previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root= newItem;
                }
                return  true;
            }
            else{
                System.out.println(newItem.getValue()+"is already present");
                return false;
            }
        }
        return false;

    }

    @Override
    public boolean removeItem(Listitem newItem) {
       if(newItem != null){
           System.out.println("Deleting" +newItem.getValue());
       }
       Listitem currentItem = this.root;
       while (currentItem!=null){
           int comparision = currentItem.compareTo(newItem);
           if(comparision ==0){
               if(currentItem == this.root){
                   this.root = currentItem.next();
               } else{
                   currentItem.previous().setNext(currentItem.next());
                   if(currentItem.next()!= null){
                       currentItem.next().setPrevious(currentItem.previous());
                   }
               }
               return  true;
           }else if(comparision<0){
               currentItem = currentItem.next();
           }else{
               //we are at an item grater than the one to be deleted
               return false;
           }
       }
       return false;
    }

    @Override
    public void traverse(Listitem root) {
        if (root == null) {
            System.out.println("the list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
