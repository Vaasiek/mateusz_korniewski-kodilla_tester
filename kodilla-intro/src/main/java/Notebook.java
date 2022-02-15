public class Notebook {
        int weight;
        int price;
        int year;

        public Notebook(int weight, int price, int year) {
            this.weight = weight;
            this.price = price;
            this.year = year;
        }

        public void checkPrice() {
            if (this.price < 600) {
                System.out.println("This notebook is very cheap.");
            }
            else if (600 < this.price && this.price <= 1000) {
                System.out.println("The price is good.");
            }
            else {
                System.out.println("This notebook is expensive.");
            }
        }

        public void checkWeight() {
            if (this.weight <= 1000) {
                System.out.println("This notebook is light.");
            }
            else if (1000 < this.weight && this.weight < 2000) {
                System.out.println("This notebook is not very heavy.");
            }
            else {
                System.out.println("This notebook is heavy.");
            }
        }

        public void priceYear() {
            if (1000 >= this.price && 2015 < this.year) {
                System.out.println("This notebook is new and cheap.");
            }
            else if (1500 >= this.price && this.year <= 2015) {
                System.out.println("This notebook is quite old and very expensive.");
            }
            else if (this.price <= 600 && this.year < 2015) {
                System.out.println("This notebook is cheap, but very old.");
            }
            else {
                System.out.println("This notebook is new and expensive");
            }
        }
}
