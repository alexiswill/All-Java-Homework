
import java.util.Scanner;

public class There {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean areWeThere = true;

        while (areWeThere) {
            System.out.println("Are we there yet?");
            String input =  scanner.nextLine();


            if (input.equals ("Yes...")) {
                System.out.println("Yes");
                areWeThere = false;

            }else if (input.equals("No...")) {
                    System.out.println("No");
                    areWeThere = false;


                }

            }
        }
    }
