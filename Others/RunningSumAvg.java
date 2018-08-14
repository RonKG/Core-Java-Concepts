package solutions;

public class RunningSumAvg {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float sum = 0;
        float num = 0;
        float avg = 0;
        float count = 0;

        System.out.println("\t\t\tCount\tEntered\tSum\tAverage");

        while (true) {
            System.out.print("Enter a number: ");
            num = scanner.nextFloat();

            if (num == 0.0)
                break;

            count = count + 1;
            sum = sum + num;
            avg = sum / count;

            System.out.println("\t\t\t" + count + "\t" + num + "\t"
                    + sum + "\t" + avg);
        }
        scanner.close();
    }
}
