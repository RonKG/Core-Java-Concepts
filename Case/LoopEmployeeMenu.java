package solutions;

public class LoopEmployeeMenu {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int option = 0;

        while (true) {

            System.out.println("                   Employee File");
            System.out.println("                   -------------");
            System.out.println("         Option  Description");
            System.out.println("         ------  -------------------------");
            System.out.println("            0    Exit");
            System.out.println("            1    Enter a new employee");
            System.out.println("            2    View an existing employee");
            System.out.println("            3    Delete an ex-employee");
            System.out.println("            4    List all employees");
            System.out.println();
            System.out.print("          Please choose an option:");

            option = scanner.nextInt();

            switch (option) {
            case 0:
                scanner.close();
                return;
            case 1:
                System.out.print("You entered option number " + option);
                System.out.println(" to enter a new employee.");
                break;
            case 2:
                System.out.print("You entered option number " + option);
                System.out.println(" to view an existing employee.");
                break;
            case 3:
                System.out.print("You entered option number " + option);
                System.out.println(" to delete an ex-employee.");
                break;
            case 4:
                System.out.print("You entered option number " + option);
                System.out.println(" to list all employees.");
                break;
            }
        }
    }
}
