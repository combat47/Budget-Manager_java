package budget;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        double total = 0.0;
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            double expense = Double.parseDouble(nextLine.substring(nextLine.lastIndexOf('$') + 1));
            total += expense;
            data.add(nextLine);
        }
        data.forEach(System.out::println);
        System.out.println("\nTotal: $" + total);
    }
}
