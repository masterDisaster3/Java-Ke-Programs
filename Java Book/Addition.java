import java.util.Scanner;

public class Addition {

    static void add(){
        try (Scanner input = new Scanner(System.in)) {
                int num1;
                int num2;
                int sum;

                System.out.print("Enter the first number: ");
                num1 = input.nextInt();

                System.out.print("Enter the second number: ");
                num2 = input.nextInt();

                sum = num1 + num2;

            System.out.println("The sum is : " + sum);
        }
    }
}
