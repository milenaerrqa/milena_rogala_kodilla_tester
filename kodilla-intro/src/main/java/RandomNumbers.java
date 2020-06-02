import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    private int size;
    private int number;
    private int numbers[];

    public RandomNumbers() {
        this.numbers = new int[5000];
        this.size = 0;
    }


    public void addToArray(int number) {
        this.numbers[this.size] = number;
        this.size++;

        System.out.println(this.size + " " + number);
    }

    public int addRandomNumbers() {
        Random r = new Random();
        RandomNumbers randomNumbers = new RandomNumbers();
        int loop = 0;
        int sum = 0;

        do {
            int number = r.nextInt(30) + 1;
            sum = sum + number;
            loop++;
            addToArray(number);
        }
        while (sum <= 5000);
        return loop;
    }

    public int findMinValue() {
        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return  minValue;
    }

    public int findMaxValue() {
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        int size = randomNumbers.addRandomNumbers();

        System.out.println("Ilość wylosowanych liczb: " + size);
        System.out.println("Najmniejsza: " + randomNumbers.findMinValue());
        System.out.println("Najwieksza: " + randomNumbers.findMaxValue());
    }
}

