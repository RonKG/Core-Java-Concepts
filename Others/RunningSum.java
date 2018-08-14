package solutions;

public class RunningSum {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float sum = 0;
        float num = 0;

        System.out.println("\t\t\tEntered\tSum");

        while (true) {
            System.out.print("Enter a number: ");
            num = scanner.nextFloat();

            if (num == 0.0)
                break;

            sum = sum + num;

            System.out.println("\t\t\t" + num + "\t" + sum);
        }
        scanner.close();
    }
}
