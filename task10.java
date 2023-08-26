package GroupExercise1;

public class task10 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "apple", "orange", "banana", "grape", "apple"};
        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i] != null && fruits[i].equals(fruits[j])) {
                    System.out.println(fruits[i]);
                    fruits[j] = null;
                }
            }
        }
    }
}
