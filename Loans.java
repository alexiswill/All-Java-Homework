import java.util.Scanner;

public class Loans {


    public static void main(String[] args) {

        Scanner loans = new Scanner(System.in);

        System.out.println("What is your yearly salary?") ;
            int salary = loans.nextInt();

        System.out.println("How long have you been with the company?");
            int yearsEmployed = loans.nextInt();

            if (salary >= 80000 && yearsEmployed >=3) {
                System.out.println("Yay...You qualify");

            }else if (yearsEmployed < 3){
                    System.out.println("you do not qualify");


            } else {
                System.out.println("You do not qualify. you still need " + (80000 - salary));
            }

            }


    }

