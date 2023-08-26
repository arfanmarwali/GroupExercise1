package GroupExercise1;

public class task8 {
    public static void main(String[] args) {
        int[] nums = { 5, 10, -3, 25, 0, -8, 15 };
        int max = nums[0];
        int min = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            else if(nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
