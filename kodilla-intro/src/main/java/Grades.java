import java.util.Random;

public class Grades {
    private int[] grades;
    private int size;
    private double sum = 0;
    private double avg = 0;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {
        return this.grades[size-1];
    }

    public double countAverageOfGrades() {
        for (int i = 0; i < size; i++) {
            sum = grades[i] + sum;
        }
        return avg = sum / size;
    }

    public static void main(String[] args) {
        Grades grade = new Grades();
        Random r = new Random();
        for (int i = 0; i < grade.grades.length; i++) {
            int randomGrade = r.nextInt(6) + 1; //generowanie losowych ocen w przedziale od 1-6
            grade.add(randomGrade);
        }
        for (int i = 0; i < grade.grades.length; i++) {
            System.out.println(i+1 + " ocena wynosi: " + grade.grades[i]); //dla testu; wyświetl wszystkie elementy tablicy
        }

        System.out.println("Last grade: " + grade.getLastGrade());
        System.out.println("Avg: " + grade.countAverageOfGrades());
    }
}
