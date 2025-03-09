import java.util.Random;
public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();

        int count = 1;
        int randomNumber = random.nextInt(100) + 1;
        int min = randomNumber;
        int max = randomNumber;
        System.out.println("Random number " + count + ": " + randomNumber);

        while (count < 10) {
            count++;
            randomNumber = random.nextInt(100) + 1;
            System.out.println("Random number " + count + ": " + randomNumber);

            if (randomNumber < min) {
                min = randomNumber;
            }
            if (randomNumber > max) {
                max = randomNumber;
            }
        }


        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
