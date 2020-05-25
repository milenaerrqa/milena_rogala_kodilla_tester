import java.text.DecimalFormat;

public class User {

    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        double sum = 0;
        double avg = 0;
        User jan = new User("Jan", 3);
        User milena = new User("Milena", 30);
        User bogdan = new User("Bogdan", 19);
        User katarzyna = new User("Katarzyna", 58);
        User dawid = new User("Dawid", 10);
        User anna = new User("Anna", 71);
        User[] users = {jan, milena, bogdan, katarzyna, dawid, anna};

        for (int i = 0; i < users.length; i++) {
            users[i].getAge();
            sum = sum + users[i].getAge();
        }
        avg = sum / users.length;

        DecimalFormat df = new DecimalFormat("##.##");  //zaokraglenie (w gore) do 2 miejsc po przecinku
        System.out.println("Avgerage age: " + df.format(avg));

        for (int i = 0; i < users.length; i++) {
            String user = users[i].getName();
            int age = users[i].getAge();

            if (age < avg) {
                System.out.println(user + " is below average age");
            }
        }
    }
}
