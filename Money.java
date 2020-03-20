import java.util.Scanner;

public class Money {

    public static void main(String[] args) {

        Scanner coins = new Scanner(System.in);



        System.out.println("How many pennies would you like?");
        int pennies = coins.nextInt();

        System.out.println("How many nickels would you like?");
        int nickels = coins.nextInt();

        System.out.println("How many dimes would you like?");
        int dimes = coins.nextInt();

        System.out.println("How many quarters would ");
        int quarters = coins.nextInt();
            double total =((pennies * .01) + (nickels * .05) + (dimes * .1) + (quarters * .25));
        if (total == 1.00) {
            System.out.println("You win");
        } else if (total > 1.00){
            System.out.println("You went over a dollar by " + (total - 1.00));
        } else if (total < 1.00){
            System.out.println("You went under by " + (1.00 - total ));
        }


    }
}
