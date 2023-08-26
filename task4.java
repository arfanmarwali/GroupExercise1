package GroupExercise1;

public class task4 {
    public static void main(String[] args) {
        int [][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int total = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                total = total + nums[i][j];
            }
        }
        System.out.println(total);
    }
}
