package solutions;

public class LoopCalc {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float num1 = 0.0F;
        float num2 = 0.0F;
        String oper1 = "";

        System.out.print("Please enter a number: ");
        num1 = scanner.nextFloat();

        System.out.print("Please enter an operator: ");
        oper1 = scanner.next();

        System.out.print("Please enter another number: ");
        num2 = scanner.nextFloat();

        while (num1 != 0 || num2 != 0) {
            System.out.print("The result of " + num1 + " " + oper1
                    + " " + num2);

            switch (oper1) {
            case "+":
                System.out.println(" is " + (num1 + num2));
                break;
            case "-":
                System.out.println(" is " + (num1 - num2));
                break;
            case "*":
                System.out.println(" is " + (num1 * num2));
                break;
            case "/":
                System.out.println(" is " + (num1 + num2));
                break;
            default:
                System.err.println(" does not compute: " + oper1
                        + " is an invalid operator.");
                break;
            }
            
            System.out.print("Please enter a number: ");
            num1 = scanner.nextFloat();

            System.out.print("Please enter an operator: ");
            oper1 = scanner.next();

            System.out.print("Please enter another number: ");
            num2 = scanner.nextFloat();
        }
        scanner.close();
    }
}
