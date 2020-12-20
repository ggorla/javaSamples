public class Palindrome {
    public static void main(String[] args) {
        System.out.println("is palindrom "+isPalindrome(12));
    }
    public static boolean isPalindrome(int n) {
        int reverse = 0;
        int placeholder = Math.abs(n);
        while (placeholder > 0) {
            int lastDigit = placeholder % 10;
            reverse *= 10;
            reverse += lastDigit;
            placeholder /= 10;
        }
    return reverse == Math.abs(n);
    }
}
