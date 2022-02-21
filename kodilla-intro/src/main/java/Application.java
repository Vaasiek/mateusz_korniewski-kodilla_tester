import javax.xml.namespace.QName;

public class Application {

    String imie;
    double wiek;
    double wzrost;

    public Application(String imie, double wiek, double wzrost) {
        this.imie = imie;
        this.wiek = wiek;
        this.wzrost = wzrost;

    }
    public static void main(String[] args) {
        //String name = "Adam";
        //double age = 40.5;
        //double height = 178;

        Application adam = new Application("Adam", 40.5, 178);

        Application[] candidate = {adam};

        if (candidate[0] != null) {
            Application a = candidate[0];
            if (a.getAge() > 30 && a.getHeight() > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter");
            }
        }
    }

    private double getHeight() {
        return wzrost;
    }

    private double getAge() {
        return wiek;
    }
}
