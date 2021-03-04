import java.util.Random;

public class MainMessages {

    public static void main(String[] args) {
    Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

class  Message{
    private String message;
    private boolean empty = true;

    public synchronized  String read(){
        while (empty){
            try {
                System.out.println("reader");
                wait();
            }
            catch ( InterruptedException e){

            }

        }
        empty = true;
        notifyAll();
        return message;
    }
    public synchronized void write(String message){
        while (!empty){
            try {
                System.out.println("writer");
                wait();
            }
            catch ( InterruptedException e){

            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}
class Writer implements Runnable{
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }
    public void run(){
        String messages[] = {
                "humpty dumpty sat on wal",
                "humpty dumpty had a great fall",
                "all the kings horses and all the kings men",
                "couldnt put hupty together again"
        };
        Random random = new Random();
        for(int i=0;i<messages.length;i++){
            message.write(messages[i]);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        message.write("Finished");
    }
}

class Reader implements Runnable{
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }
    public void run(){
        Random random = new Random();
        for(String latestmessage = message.read(); !latestmessage.equals("Finished"); latestmessage = message.read()){
            System.out.println(latestmessage);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}

