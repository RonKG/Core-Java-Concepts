package solutions;

public class Pow2 {
    public static void main(String[] args) {

        int i = 0;
        int pow = 1;

        for (i = 0; i <= 16; i = i + 1) {
            pow = pow * 2;
            System.out.println(i + ":\t" + 2 * i + "\t" + pow);
        }
    }
}
