public class Book {

    private String author;
    private String title;

    public static String of(String author, String title) {
        //this.author = author;
        //this.title = title;
        return author + ", " + title;
    }

    static String book = Book.of("Jacek Piekara", "Cykl Inkwizytorski");
    static String book1 = Book.of("Andrzej Sapkowski", "Wiedźmin");

    public static void main(String[] args) {
        System.out.println(book);
        System.out.println((book1));

    }
}
