import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random rand = new Random();

        int rand1 = rand.nextInt(10);


        System.out.println("Guess a number 1 through 10!");


        while (true) {
            int hey = num.nextInt();


            if (hey == rand1) {
                System.out.println("You Win");
                break;

            } else if (hey > rand1) {
                System.out.println("Too High");

            } else {
                System.out.println("Too low");
            }

        }



        }






    }

