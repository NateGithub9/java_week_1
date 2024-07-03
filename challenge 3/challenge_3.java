import java.util.Random;

public class challenge_3 {
    public static void main(String[] args) {
        int maxSize = 100; // capacité de l'array pour charger les integers
        int[] randomNumbers = new int[maxSize]; // random
        Random random = new Random();
        for (int i = 0; i < maxSize; i++) {
            randomNumbers[i] = random.nextInt(100); // Random integers between 0 and 99
        }

        System.out.println("Numbers smaller than 10:"); //loop
        for (int i = 0; i < maxSize; i++) {
            if (randomNumbers[i] < 10) {
                System.out.println(randomNumbers[i]);
            }
        }
    }
}

