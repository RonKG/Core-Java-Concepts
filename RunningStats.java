package solutions;

public class RunningStats {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float sum = 0;
        float num = 0;
        float avg = 0;
        float count = 0;
        float min = 0;
        float max = 0;

        System.out
                .println("\t\t\tCount\tEntered\tSum\tAverage\tMin\tMax");

        System.out.print("Enter a number: ");
        num = scanner.nextFloat();
        max = num;
        min = num;

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

            System.out.println("\t\t\t" + count + "\t" + num + "\t"
                    + sum + "\t" + avg + "\t" + min + "\t" + max);

            System.out.print("Enter a number: ");
            num = scanner.nextFloat();
        }
        scanner.close();
    }
}
