import java.util.Scanner;

public class SimpleBankingApplication {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bankAccount.deposit();
                    break;
                case 2:
                    bankAccount.withdraw();
                    break;
                case 3:
                    bankAccount.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }
}
