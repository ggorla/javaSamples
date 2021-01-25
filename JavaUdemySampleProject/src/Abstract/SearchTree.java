package Abstract;

import AbstractBasic.Parrot;

import java.sql.ClientInfoStatus;
import java.util.List;

public class SearchTree implements  NodeList{
    private Listitem root = null;

    public SearchTree(Listitem root) {
        this.root = root;
    }

    @Override
    public Listitem getRoot() {
        return null;
    }

    @Override
    public boolean addItem(Listitem newItem) {
        if(this.root == null){
            this.root = newItem;
            return  true;
        }
        Listitem currentItem = this.root;
        while(currentItem!= null){
            int comparion = (currentItem.compareTo(newItem));
            if(comparion<0){
                if(currentItem.next()!= null){
                    currentItem= currentItem.next();
                }
            }
            else if (comparion>0){
                if(currentItem.previous()!= null)
                {
                    currentItem = currentItem.previous();
                }else{
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }else{
                System.out.println(newItem.getValue()+"is already present");
                return false;
            }
        }
        return false;

    }

    @Override
    public boolean removeItem(Listitem item) {
      if(item!=null){
          System.out.println("Deleting item"+item.getValue());
      }
      Listitem currentItem = this.root;
      Listitem parentItem = currentItem;
      while(currentItem!= null){
          int comparison = (currentItem.compareTo(item));
          if (comparison < 0) {

              parentItem = currentItem;
              currentItem =currentItem.next();
          }
          else if(comparison>0){
              parentItem = currentItem;
              currentItem = currentItem.previous();
          }
          else{
              performRemoval(currentItem, parentItem);
              return  true;
          }
      }
        return false;
    }

    private  void performRemoval(Listitem item, Listitem parent){
        if(item.next()== null){
            if(parent.next()== item){
                parent.setNext(item.previous());
            }else if (parent.previous()== item){
                parent.setPrevious((item.previous()));
            }else {
                this.root = item.previous();
            }
        }
        else if(item.previous()==null){
            if(parent.next()==item){
                parent.setNext(item.next());
            }
            else if (parent.previous()==item)
                parent.setPrevious((item.next()));
            else
                this.root = item.next();
        }
        else{
            Listitem current = item.next();
            Listitem leftmostParent  = item;
            while(current.previous()!=null){
                leftmostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if(leftmostParent== item) {
                item.setNext(current.next());
            }else
                leftmostParent.setPrevious(current.next());
        }
    }

    @Override
    public void traverse(Listitem root) {

        if(root!=null){
            traverse((root.previous()));
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
