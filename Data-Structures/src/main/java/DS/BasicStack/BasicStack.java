package DS.BasicStack;

public class BasicStack<X> {

    private X[] data;

    public BasicStack(X[] data) {
        this.data = (X[]) new Object[1000];
    }

    private  int stackpointer;
    public void push(X item){
         data[stackpointer++] = item;
    }
    public X pop(){
        if(stackpointer==0)
            throw new IllegalStateException("No more items on stack");
        return  data[stackpointer--];
    }
    public boolean contains(X item){
        boolean found = false;
        for(int i =0; i<stackpointer;i++){
            if(data[i].equals(item))
                found = true;
        }
        return found;
    }
    public  X access(X item){
        while (stackpointer>0){
            X temp = pop();
            if(item.equals(temp)){
                return temp;
            }
        }
        throw  new IllegalStateException("no items found");
    }

    public int  size(){
        return stackpointer;
    }
}

