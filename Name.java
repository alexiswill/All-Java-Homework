

import java.util.Scanner;

public class Name {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);




        boolean r = true;



        while (r) {
            System.out.println("What is your name?");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")){
                System.out.println("Welcome " + name);

                r = false;
            }


            }

        }


    }




