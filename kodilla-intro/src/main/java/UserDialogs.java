import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A": return "ADD";
                case "S": return "SUB";
                case "D": return "DIV";
                case "M": return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static String getColorLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write first letter of your colour: ");
            String letter = scanner.nextLine().trim().toUpperCase();
            switch (letter) {
                case "B": return "B";
                case "G": return "G";
                case "O": return "O";
                case "P": return "P";
                case "R": return "R";
                case "W": return "W";
                case "Y": return "Y";
                default:
                    System.out.println("Wrong letter. Try again");
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }
}
