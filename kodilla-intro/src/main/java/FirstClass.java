public class FirstClass {
    public static void main(String[] args) {

            Notebook heavyNotebook = new Notebook(3000, 10020, 1995);
            Notebook ultraNotebook = new Notebook(800, 1000, 2013);
            Notebook studentNotebook = new Notebook(2000, 100, 2001);
            Notebook [] objects = new Notebook[] {heavyNotebook, ultraNotebook, studentNotebook};

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].weight + "g" + " " + objects[i].price + "zl");
            objects[i].checkWeight();
            objects[i].checkPrice();
            System.out.println();
        }
    }
}
