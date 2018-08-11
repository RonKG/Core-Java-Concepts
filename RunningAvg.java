package solutions;

public class RunningAvg {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float sum = 0;
        float num = 0;
        float avg = 0;
        float count = 0;
        float min = 0;
        float max = 0;
        float avg2 = 0;

        System.out.println("\t\t\tCount\tEntered\tSum\tAverage\tMin\tMax\tAvg");

        System.out.print("Enter a number: ");
        num = scanner.nextFloat();
        max = num;
        min = num;
        avg2 = num;

        while (true) {
            if (num == 0.0)
                break;

            count = count + 1;
            sum = sum + num;
            avg = sum / count;
            if (num > max)
                max = num;
            if (num < min)
                min = num;

            // Note that this average doesn't require calculating the sum.
            // when averaging any very large numbers, the sum could become
            // too large to represent in the computer. We can still correctly
            // calculate this average, though.
            avg2 = avg2 + (num - avg2) / count;

            System.out.println("\t\t\t" + count + "\t" + num + "\t"
                    + sum + "\t" + avg + "\t" + min + "\t" + max
                    + "\t" + avg2);

            System.out.print("Enter a number: ");
            num = scanner.nextFloat();

        }
        scanner.close();
    }
}
