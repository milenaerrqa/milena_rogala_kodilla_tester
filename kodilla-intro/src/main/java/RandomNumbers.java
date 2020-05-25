import java.util.Random;

public class RandomNumbers {
    private int size;
    private int numbers[];


    public int addRandomNumbers() {
        Random r = new Random();
        int result = 0;
        int sum = 0;

        do {
            int number = r.nextInt(30);
            sum = sum + number;
            result++;
        }
        while (sum <= 5000);
        return result;
    }


    public void addToArray(int number, int size) {
        this.numbers[this.size] = number;
        this.size++;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        int size = randomNumbers.addRandomNumbers();
        System.out.println(size);
    }

}

