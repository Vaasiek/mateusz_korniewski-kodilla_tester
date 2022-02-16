public class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        User mateusz = new User("Mateusz", 30);
        User klaudia = new User("Klaudia", 27);
        User weronika = new User("Weronika", 20);
        User pawel = new User("Paweł", 30);
        User basia = new User("Barbara", 30);
        User klemens = new User("Klemens", 3);

        User[] users = {mateusz, klaudia, weronika, pawel, basia, klemens};

        int result = 0;
        for (int i = 0; i < users.length; i++); {
            result = result + users[this.age];
        }

        int average = result / users.length;

        for
    }
}
