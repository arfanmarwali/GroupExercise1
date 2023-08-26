package GroupExercise1;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        boolean prime = true;
        int num = input.nextInt();
        if(num <= 1){
            prime = false;
        }
        else if(num <= 3){
            prime = true;
        }
        else if(num % 2 == 0 || num % 3 == 0){
            prime = false;
        }

        for(int i = 5; i * i <= num; i +=6){
            if(num % i == 0 || num % (i + 2) == 0){
                prime = false;
            }
        }

        if (prime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
