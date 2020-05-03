public class LeapYear {
    public static void main(String[] args) {
        int year = 1912;

        if (year % 4 == 0 && year % 100 > 0 || year % 400 == 0) {
            System.out.println("Rok " + year + " jest rokiem przystępnym");

        } else {
            System.out.println("Rok " + year + " NIE jest rokiem przystępnym");
        }
    }
}