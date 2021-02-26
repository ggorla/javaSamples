public class StopableRunnable {

    public static class StoppableRunnable implements Runnable{

        private boolean stopRequested = false;

        public synchronized  void requestStop(){
            this.stopRequested=true;
        }
        public synchronized  boolean isStopRequested(){
            return this.stopRequested;
        }

        private void sleep(long mmills){
            try{
                Thread.sleep(mmills);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        @Override
        public void run() {

        }
    }
}
