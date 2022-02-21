import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random liczba = new Random(); // tworzenie obiektu klasy random

        int sum = 0;

        while (sum <= 5000) {
            sum+= liczba.nextInt(31);
            System.out.println(sum);
        }

    }
}
