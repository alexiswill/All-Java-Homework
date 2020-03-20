import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner payCheck = new Scanner(System.in);


        System.out.println("What is your salary");
        double salary = payCheck.nextDouble();

        System.out.println("How many hours have you worked?");
        int hours = payCheck.nextInt();




        if (hours >= 40 ){
            System.out.println("Your paycheck will be $" + (1.5 * salary) *hours );
        } else {
            System.out.println("Your paycheck will be $" + (hours * salary));
        }
    }
}
