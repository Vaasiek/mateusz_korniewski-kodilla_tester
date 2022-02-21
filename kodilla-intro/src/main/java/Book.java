public class Book {

    private String author;
    private String title;

    public static String of(String author, String title) {
        return author;
    }

    static String book = Book.of("Jacek Piekara", "Cykl Inkwizytorski");

    public static void main(String[] args) {
        System.out.println(book);
    }
}
