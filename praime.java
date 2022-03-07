
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This Program will print prime numbers from 0 upto 10,000");
        System.out.println("2\n3\n5\n7");

        for(int i = 2 ; i <= 100 ; i++)
        {
           if(i%2==0 || i%3==0 || i%5==0 || i%7 == 0)
           {
               continue;
           }
           else
               System.out.println(i);
        }
    }
}