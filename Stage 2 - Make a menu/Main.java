package budget;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        double totalSum = 0.0;
        Map<String, Double> list = new LinkedHashMap<>();

        while (true) {

            System.out.println("""
                    Choose your action:
                    1) Add income
                    2) Add purchase
                    3) Show list of purchases
                    4) Balance
                    0) Exit
                    """);
            int selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 1 -> {
                    System.out.println();
                    System.out.println("Enter income:");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    balance += amount;
                    System.out.println("Income was added!");
                    System.out.println();
                }
                case 2 -> {
                    System.out.println();
                    System.out.println("Enter purchase name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter its price:");
                    double price = scanner.nextDouble();
                    totalSum += price;
                    balance -= price;
                    list.put(name, price);
                    System.out.println("Purchase was added!");
                    System.out.println();
                }
                case 3 -> {
                    System.out.println();
                    if (list.isEmpty()) {
                        System.out.println("The purchase list is empty");
                    } else {
                        for (var entry :
                                list.entrySet()) {
                            System.out.printf("%s $%.2f\n", entry.getKey(), entry.getValue());
                        }
                        System.out.printf("Total sum: $%.2f\n", balance);
                    }
                    System.out.println();
                }
                case 4 -> {
                    System.out.println();
                    System.out.printf("Balance: $%.2f\n", balance);
                    System.out.println();
                }
                case 0 -> {
                    System.out.println();
                    System.out.println("Bye!");
                    return;
                }
            }
        }
    }
}
