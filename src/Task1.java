import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input numbers
        System.out.print("Enter first number: ");
        float firstNumberBielecki = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float secondNumberBielecki = scanner.nextFloat();

        // Perform calculations
        float sum = firstNumberBielecki + secondNumberBielecki;
        float difference = firstNumberBielecki - secondNumberBielecki;
        float product = firstNumberBielecki * secondNumberBielecki;
        float quotient = 0;
        if (secondNumberBielecki != 0) {
            quotient = firstNumberBielecki / secondNumberBielecki;
        } else {
            System.out.println("Division by zero is not allowed!");
        }

        // Display results formatted to two decimal places
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);
        if (secondNumberBielecki != 0) {
            System.out.printf("Quotient: %.2f%n", quotient);
        }

        scanner.close();
    }
}
