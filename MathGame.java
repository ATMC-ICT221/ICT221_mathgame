import java.util.Random;
import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        int i = 0;

        int count;
        for(count = 0; i < 10; ++i) {
            System.out.println("What is 4 + " + i + " ?");
        }

        Random rand = new Random();

        for(int j = 0; j <= 10; ++j) {
            int rand_int1 = rand.nextInt(12);
            int rand_int2 = rand.nextInt(12);
            int R;
            Scanner myObj;
            Question q1 = new Question();
            q1.showQuestion();

            int result;
            if (rand_int1 < rand_int2) {
                System.out.println("What is " + rand_int1 + "+" + rand_int2 + " ?");
                R = rand_int1 + rand_int2;
                myObj = new Scanner(System.in);
                System.out.println("Enter result");
                result = myObj.nextInt();
                if (result == R) {
                    System.out.println("congradulations");
                    ++count;
                } else {
                    System.out.println("sorry, wrong answer");
                    --count;
                }
            } else {
                System.out.println("What is " + rand_int1 + "-" + rand_int2 + " ?");
                R = rand_int1 - rand_int2;
                myObj = new Scanner(System.in);
                System.out.println("Enter result");
                result = myObj.nextInt();
                if (result == R) {
                    System.out.println("congradulations");
                    ++count;
                } else {
                    System.out.println("sorry, wrong answer");
                    --count;
                }
            }
        }

        System.out.println("The correct answer is" + count + "out of 10");
    }
}