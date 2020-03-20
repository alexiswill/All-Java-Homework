

import java.util.Scanner;

public class YouShallNotPass {

    public static void main(String[] args) {

        Scanner help = new Scanner(System.in);

        System.out.println("Password");


        int counter;

        counter = 0;
        counter++;

        while (true) {
            String passWord = help.nextLine();

            if (passWord.equals("Batman1")) {
                System.out.println("You are logged in");
                break;

            }else if(!passWord.equals("Batman1") && counter < 4){
                System.out.println("Password incorrect " + counter++);


            } else {
                System.out.println("You have been locked out of your account!!!");



            }


        }
    }
}
