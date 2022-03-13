import java.util.Scanner;

public class ScannerWala{
    public static void main(String[] args) {

        A a = new A();

        System.out.println("The number was " + a.takeInputti());
    }

}


class A{
    Scanner cin = new Scanner(System.in);
    int takeInputti(){
        System.out.print("Enter a fucking number: ");
        int num = cin.nextInt();
        return num;
    }

}