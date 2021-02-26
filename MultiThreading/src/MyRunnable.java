public class MyRunnable  implements  Runnable{
    private int count = 0;
    // These would refrence same my Object on heap
    private  MyObject myObject = null;

    public MyRunnable(MyObject myObject) {
        this.myObject = myObject;
    }

    public MyRunnable() {
    }

    @Override
    public void run() {
      // This creates new Instance for each thread start
        //MyObject myObject = new MyObject();
        System.out.println(myObject);
        for(int i=0;i<1_000_000;i++){
            this.count++;
        }
        System.out.println(Thread.currentThread().getName()+":"+this.count);
    }
}
