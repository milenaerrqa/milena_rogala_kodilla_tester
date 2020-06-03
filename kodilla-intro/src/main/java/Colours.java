public class Colours {

    public static void main(String[] args) {
        String userSelected = FavoriteColour.getUserSelection();
        switch(userSelected) {
            case "R":
                System.out.println("Red is your favorite colour");
                break;
            case "O":
                System.out.println("Orange is your favorite colour");
                break;
            case "Y":
                System.out.println("Yellow is your favorite colour");
                break;
            case "G":
                System.out.println("Green is your favorite colour");
                break;
        }
    }
}
