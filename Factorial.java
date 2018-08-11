package solutions;

public class Factorial {
    public static void main(String[] args) {

        int i = 0;
        int factorial = 1;

        // A integer overflows after 13!
        // for(i = 1; i <= 20; i = i + 1)

        for (i = 1; i <= 10; i = i + 1) {
            factorial = factorial * i;
            System.out.println(i + "! = " + factorial);
        }
    }
}
