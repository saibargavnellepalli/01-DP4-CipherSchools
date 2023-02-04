package Week2;

public class fiboDp {
    public static void main(String[] args) {
        int ans = fib(5);
    }

    private static int fib(int n) {
       if(n<=1) return n;

        int one = fib(n-1);
        int two = fib(n-2);

        return one+two;
    }
}
