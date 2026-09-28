import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the hardware type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        System.out.print("Enter the choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String consoleType;

        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        System.out.print("Enter the store: ");
        String store = scanner.nextLine();

        System.out.print("Enter the total sales of " + consoleType
                + " consoles for " + store + ": ");
        int totalSales = scanner.nextInt();

        ConsoleSales consoleSales =
                new ConsoleSales(consoleType, store, totalSales);

        consoleSales.printReport();

        scanner.close();
    }
}
