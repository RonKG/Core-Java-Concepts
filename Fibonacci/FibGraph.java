package solutions;

public class FibGraph {
    public static void main(String[] args) {
        int num = 0;
        int f0 = 0;
        int f1 = 1;
        int fib = 0;
        int k = 0;

        System.out.println("0:\t");
        System.out.println("1:\t*");

        // // If you go to 15, the graph goes off the right side of the screen.
        // for (num = 2; num <= 15; num = num + 1) {

        // // If you go to 20, it gets ridiculous...
        // for (num = 2; num <= 20; num = num + 1) {

        for (num = 2; num <= 10; num = num + 1) {
            fib = f0 + f1;
            f0 = f1;
            f1 = fib;
            System.out.print(num + ":\t");

            for (k = 0; k < fib; k = k + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
