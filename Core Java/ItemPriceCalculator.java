import java.io.*;
import java.util.Scanner;

public class ItemPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit)");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    insertNewPrice(scanner);
                    break;
                case 2:
                    viewPurchaseTotal();
                    break;
                case 3:
                    continueProgram = false;
                    System.out.println("Exit program...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }

        scanner.close();
    }

    private static void insertNewPrice(Scanner scanner) {
        try {
            FileWriter writer = new FileWriter("prices.txt", true);
            boolean enterMoreItems = true;

            while (enterMoreItems) {
                System.out.print("Insert price: ");
                double price = scanner.nextDouble();
                scanner.nextLine(); 

                writer.write(Double.toString(price) + "\n");
                System.out.println("Price has been saved to the file.");

                System.out.print("Do you want to enter price for more items? (Yes/No): ");
                String response = scanner.nextLine().toLowerCase();

                if (!response.equals("yes")) {
                    enterMoreItems = false;
                }
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void viewPurchaseTotal() {
        try {
            FileReader reader = new FileReader("prices.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            double total = 0;
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                double price = Double.parseDouble(line);
                total += price;
            }

            bufferedReader.close();
            reader.close();

            System.out.println("Total Price of all items is: " + total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
