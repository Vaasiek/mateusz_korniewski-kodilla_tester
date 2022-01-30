import java.util.Arrays;

public class SimpleArray {
    public static void main(String[] args) {

        String[] books = new String[5];
        books[0] = "Wiedźmin";
        books[1] = "Cykl inkwizytorski";
        books[2] = "Harry Potter";
        books[3] = "Przygody Jakuba Wędrowycza";
        books[4] = "Rok 1984";

        String book = books[3];
        System.out.println(book);

        int numberOfElements = books.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");

    }
}
