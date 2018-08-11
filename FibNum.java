package solutions;

public class FibNum {
    public static void main(String[] args) {
        int num = 0;
        int f0 = 0;
        int f1 = 1;
        int fib = 0;

        System.out.println("0:\t" + f0);
        System.out.println("1:\t" + f1);

        for (num = 2; num <= 20; num = num + 1) {
            fib = f0 + f1;
            f0 = f1;
            f1 = fib;
            System.out.println(num + ":\t" + fib);
        }
    }
}
