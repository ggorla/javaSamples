public class SumDigits {
    public static void main(String[] args) {
        System.out.println("sum of 125"+sum(125));
    }
    public static  void sumDigits(int number){
    }

    public  static int sum(int n){
        if(n<10)
            return -1;
        int sum =0;
        while(n >0){
            int digit = n %10;
            sum +=digit;
            n /=10;
        }
        return sum;
    }
}
