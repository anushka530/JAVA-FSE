 import java.util.Scanner;
public class MyUnsupportedException {
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            if (num2 == 0) {
                throw new UnsupportedOperationException("Division by zero is not allowed.");
            }

            double result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


