package Abstract;

public class Node  extends  Listitem{
    public Node(Object value){
        super(value);
    }

    @Override
    Listitem next() {
        return this.rightLink;
    }

    @Override
    Listitem setNext(Listitem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    Listitem previous() {
        return this.LeftLink;
    }

    @Override
    Listitem setPrevious(Listitem item) {
        this.LeftLink = item;
        return  this.LeftLink;
    }

    @Override
    int compareTo(Listitem item) {
        if(item != null){
            return(( String) super.getValue()).compareTo((String) item.getValue());
        }else
            return -1;
    }
}
