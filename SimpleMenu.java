package examples;

public class SimpleMenu {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int resp = 0;
        float num1 = 0.0F, num2 = 0.0F;

        while (true) {
            System.out.println("               Arithmetic Menu");
            System.out.println("               _______________");
            System.out.println("       Option Description");
            System.out.println("       ______ ____________________");
            System.out.println("          0   Exit");
            System.out.println("          1   Add two numbers");
            System.out.println("          2   Subtract two numbers");
            System.out.println("          3   Multiply two numbers");
            System.out.println("          4   Divide two numbers\n");

            System.out.print("       Please choose an option: ");
            resp = scanner.nextInt();

            if (resp == 0)
                break;

            switch (resp) {
            case 1:
                System.out.println("Adding two numbers ...");
                System.out.print("Enter the first number: ");
                num1 = scanner.nextFloat();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextFloat();
                System.out.println(num1 + " + " + num2 + " = "
                        + (num1 + num2));
                break; // only breaks out of the switch

            case 2:
                System.out.println("Subtracting two numbers ..");
                System.out.print("Enter the first number: ");
                num1 = scanner.nextFloat();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextFloat();
                System.out.println(num1 + " - " + num2 + " = "
                        + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplying two numbers ...");
                System.out.print("Enter the first number: ");
                num1 = scanner.nextFloat();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextFloat();
                System.out.println(num1 + " * " + num2 + " = "
                        + (num1 * num2));
                break;
            case 4:
                System.out.println("Dividing two numbers ...");
                System.out.print("Enter the first number: ");
                num1 = scanner.nextFloat();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextFloat();
                System.out.println(num1 + " / " + num2 + " = "
                        + (num1 / num2));
                break;
            default:
                System.err.println("Invalid response. ");
                break;
            }
            System.out.print("Type a c to continue: ");
        }
        scanner.close();
    }
}
