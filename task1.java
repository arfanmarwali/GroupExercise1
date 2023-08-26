package GroupExercise1;

public class task1 {
    public static void main(String[] args) {
        int [] temps = {77, 80, 80, 90, 75, 101, 100};
        int high = temps[0];
        int low = temps[0];
        for(int i = 0; i < temps.length; i++){
            if( temps[i] > high){
                high = temps[i];
            }
            else if(temps[i] <= low){
                low = temps[i];
            }
        }
        System.out.println("Highest Temperature: " + high);
        System.out.println("Lowest Temperature: " + low);
    }
}
