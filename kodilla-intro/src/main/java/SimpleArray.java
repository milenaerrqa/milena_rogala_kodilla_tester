public class SimpleArray {
    public static void main(String [] args){
        String[] names = new String[] {"Jan", "Anna", "Malgorzata", "Ilona", "Marcin"};
        String name = names[3];
        int numberOfElements = names.length;

        System.out.println(name);
        System.out.println("Moja tablica zawiera: " + numberOfElements + " elementów");
    }
}
