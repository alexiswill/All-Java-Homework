import java.util.Random;

public class Grades {

    public static void main(String[] args) {

        Random random = new Random();

            int grade = random.nextInt(100);
        System.out.println(grade);



            if (grade >= 90) {
                System.out.println("You get an A");
            }else if (grade <= 89 && grade >= 80) {
                System.out.println("You get a B");
            }  else if (grade <= 79 && grade >= 70) {
                System.out.println("You get a C");
            }else if (grade <= 69 && grade >= 60) {
                System.out.println("You get a D");
            }else{
                System.out.println("You failed");






        }


    }

}