import java.util.*;	

public class helloworld{

	public static void printMyName(String name){
		System.out.println("My name is " + name);
	}


	public static int factorial(int num){
		int fact = 1;

		for(int i = num; i >= 1; i--){
			fact *= i;
		}

		return fact;
	}




	public static void main(String[] args){
		System.out.println("Hello World");

		Scanner cin = new Scanner(System.in);
		String name = cin.next();

		// for taking int as input
		// int number = cin.nextInt();

		printMyName(name);

		System.out.println(factorial(5));

		uns

	}

}