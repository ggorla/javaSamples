package DS.Queue;

public class BasicQueue<X>{


    private X[] data;
    private int front;
    private int end;
    public BasicQueue() {
    }
    public BasicQueue(int size){
        this.front = -1;
        this.end =-1;
        data = (X[]) new Object[size];
    }

    public int size(){
        if(front ==1 && end == -1){
            return 0;
        }
        else{
            return end-front+1;
        }
    }
    public void enQueue(X item)
    {
        if((end+1)% data.length==front){
            throw new IllegalStateException("The Queue is full");
        }
        else if (size()== 0){
            front++;
            end++;
            data[end] = item;
        }
        else{
            end++;
            data[end] = item;
        }

    }
    public  X deQueue(){
        X item = null;
        if(size()==0){
            throw  new IllegalStateException("cant deQueue because queue is empty");
        }
        if(front == end)
        {
            item = data[front];
        }
        else {
            item = data[front];
            data[front]= null;
            front++;
        }
        return item;
    }
    public boolean contain( X item){
        boolean found = false;
        if(size()==0){
            return found;
        }
        for(int i= 0; i<size();i++){
            if(data[i].equals(item)){
                found = true;
                break;
            }
        }
        return  found;
    }

    public X access(int position){
        if(size()==0 || position>size())
            throw new IllegalStateException("No item in Queue");
        int trueindex = 0;
        for(int i = front; i<end; i++){
            if(trueindex==position)
                return data[i];
            trueindex++;
        }
        throw new IllegalStateException("position couldt not found");
    }

}
