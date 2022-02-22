public class AdvCalculator {
    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        switch (userSelected) {
            case "ADD": return a + b;
            case "SUB": return a - b;
            case "DIV": return a / b;
            case "MUL": return a * b;
            default: return 0;
        }
    }

    public String colour() {
        String userColour = UserDialogs.getColorLetter();
        switch (userColour) {
            case "B": return "Black";
            case "G": return "Green";
            case "O": return "Orange";
            case "P": return "Purple";
            case "R": return "Red";
            case "W": return "White";
            case "Y": return "Yellow";
            default:
                return "Wrong letter. Try again.";
        }
    }
}
