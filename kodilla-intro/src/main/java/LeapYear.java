public class LeapYear {
    public static void main(String[] args) {

        int lapYear = 800;

        System.out.println("Czy rok " + lapYear + " jest przestępny?");

        if (lapYear%4 == 0 && lapYear%100 !=0 || lapYear%400 == 0) {
            System.out.println("Rok " + lapYear + " jest przestępny");
        } else if (lapYear%4 !=0 && lapYear%100 ==0 || lapYear%400 !=0){
        System.out.println("Rok " + lapYear + " nie jest przestępny");
        }
    }
}
