import java.util.Scanner;

public class FavoriteColour {
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter first letter your favourite colour: ");
            String letter = scanner.nextLine().trim().toUpperCase();
            switch(letter) {
                case "R" : return "R";
                case "O" : return "O";
                case "Y" : return "Y";
                case "G" : return "G";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
}
