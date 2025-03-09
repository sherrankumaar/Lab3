import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a (should not be 0): ");
        float a = scanner.nextFloat();
        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero for a quadratic equation.");
            scanner.close();
            return;
        }

        System.out.print("Enter coefficient b: ");
        float b = scanner.nextFloat();

        System.out.print("Enter coefficient c: ");
        float c = scanner.nextFloat();

        double delta = b * b - 4 * a * c;
        int numberOfRoots;
        if (delta > 0) {
            numberOfRoots = 2;
        } else if (delta == 0) {
            numberOfRoots = 1;
        } else {
            numberOfRoots = 0;
        }

        System.out.printf("Coefficients: a = %.2f, b = %.2f, c = %.2f%n", a, b, c);


        switch (numberOfRoots) {
            case 2:
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);
                System.out.printf("Two roots: x1 = %.2f, x2 = %.2f%n", x1, x2);
                break;
            case 1:
                double x = -b / (2 * a);
                System.out.printf("One root: x = %.2f%n", x);
                break;
            case 0:
                System.out.println("No real roots.");
                break;
            default:
                System.out.println("Unexpected case.");
        }

        scanner.close();
    }
}

