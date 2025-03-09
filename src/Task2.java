import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        float weightBielecki = scanner.nextFloat();

        System.out.print("Enter height in meters: ");
        float heightBielecki = scanner.nextFloat();


        float bmi = (float)(weightBielecki / Math.pow(heightBielecki, 2));
        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi <= 16.0) {
            System.out.println("Category: starvation");
        } else if (bmi < 17.0) {
            System.out.println("Category: emaciation");
        } else if (bmi < 18.5) {
            System.out.println("Category: underweight");
        } else if (bmi < 23.0) {
            System.out.println("Category: normal, low range");
        } else if (bmi < 25.0) {
            System.out.println("Category: normal, high range");
        } else if (bmi < 27.5) {
            System.out.println("Category: overweight, low range");
        } else if (bmi < 30.0) {
            System.out.println("Category: overweight, high range");
        } else if (bmi < 35.0) {
            System.out.println("Category: 1st degree obesity");
        } else if (bmi < 40.0) {
            System.out.println("Category: 2nd degree obesity");
        } else {
            System.out.println("Category: 3rd degree obesity");
        }

        scanner.close();
    }
}
