// 22. Basic ATM system (compatible version)
import java.util.Scanner;

public class ATM {
    static double balance = 1000.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₦" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposited ₦" + deposit);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn ₦" + withdraw);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you. Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }
