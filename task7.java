package GroupExercise1;

public class task7 {
    public static void main(String[] args) {
    int n = 10;
    int first = 1;
    int second = 2;
    System.out.println("First " + n + " Fibonacci numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
