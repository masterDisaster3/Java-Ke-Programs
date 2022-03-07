import javax.swing.JFrame;

public class Welcome{

    public static void main(String args[]){

        System.out.println("Welcome to Java!!");

        //Addition.add();

        //Dialog.dialog1("Hello this is message from Welcome Program!");

        //Dialog.nameDialog();

        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);

        //Numbers.evenNumbers(20);

        //Numbers.primeNumbers(8);

        //Numbers.factorial(7);





    }
}