package GroupExercise1;

public class task5 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original array:");
        for(int i : nums){
            System.out.print(i + " ");
        }
        System.out.println();

        nums[1] = nums[1] + nums[3];
        nums[3] = nums[1] - nums[3];
        nums[1] = nums[1] - nums[3];

        System.out.println("Array after swapping:");
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
}
