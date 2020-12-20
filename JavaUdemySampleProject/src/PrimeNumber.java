public class PrimeNumber {
    public static void main(String[] args) {
        boolean prime = false;
        prime = isPrime(21);
        System.out.println("number is prime"+ prime);
    }
    public  static boolean isPrime(int n){
        if(n ==1){
            return false;
        }
        /*for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }*/

        for(int i=2; i<=(long) Math.sqrt(n);i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }


}
