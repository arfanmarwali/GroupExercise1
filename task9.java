package GroupExercise1;

public class task9 {
    public static void main(String[] args) {
        int[] nums = { 5, 10, -3, 25, 0, -8, 15 };
        int max = nums[0];
        int secMax = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < max){
                secMax = max;
                max = nums[i];
            }
            else if(nums[i] > secMax && nums[i] != max){
                secMax = nums[i];
            }
        }
        System.out.println("Second largest value: " + secMax);
    }
}
