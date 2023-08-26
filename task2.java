package GroupExercise1;

public class task2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total = total + nums[i];
        }
        System.out.println(total);
    }
}
