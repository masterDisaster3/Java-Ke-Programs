import java.util.*;


public class pattern {

    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int n = s.nextInt();


    //upper half
    for(int i = 1 ; i <= n ; i++) {
        //first part
        for(int j = 1 ; j <=i ; j++) {
            System.out.print("*");
        }
        //spaces
        int spaces =2*(n-i);
        for (int j = 1 ; j <= spaces; j++ ) {
            System.out.print(" ");
        }
        //2nd part
        for(int j = 1 ; j<=i ; j++) {
            System.out.print("*");
        }
        System.out.println();

    }
    //lower half
        for(int i = n ; i >= 1 ; i--) {
            //first part
            for(int j = 1 ; j <=i ; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces =2*(n-i);
            for (int k = 1 ; k <= spaces; k++ ) {
                System.out.print(" ");
            }
            //2nd part
            for(int l = 1 ; l<=i ; l++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
