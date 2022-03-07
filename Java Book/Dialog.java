import javax.swing.JOptionPane;

public class Dialog {
    public static void dialog1(String message){
        JOptionPane.showMessageDialog(null, message);
    }


    public static void nameDialog(){
        String name = JOptionPane.showInputDialog("Bhat iz your name?");

        String message = String.format("Welcome, %s. to Java Programming!", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
