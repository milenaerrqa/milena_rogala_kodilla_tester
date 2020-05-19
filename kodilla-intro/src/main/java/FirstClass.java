public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(1600, 15000, 2020);
        System.out.println(notebook.weight + "g" + " " + notebook.price + "zl");
        notebook.checkPrice();
    }
}
