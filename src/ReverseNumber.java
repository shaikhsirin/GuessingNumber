public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123, reversed = 0;
        System.out.println("Number:" + num);
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse Number: " + reversed);
    }
}
