public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2019);
        System.out.println(notebook.weight + "g" + " " + notebook.price + "zł" + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.priceYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2008);
        System.out.println(heavyNotebook.weight +"g " + heavyNotebook.price + "zł " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.priceYear();

        Notebook oldNotebook = new Notebook(1200, 500, 2000);
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price + "zł " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.priceYear();

        Notebook niceNotebook = new Notebook(900, 2500, 2021);
        System.out.println(niceNotebook.weight + "g " + niceNotebook.price + "zł " + notebook.year);
        niceNotebook.checkPrice();
        niceNotebook.checkWeight();
        niceNotebook.priceYear();

    }
}
