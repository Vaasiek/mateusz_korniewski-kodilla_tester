import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        for (int i = names.length -1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


    }


}
