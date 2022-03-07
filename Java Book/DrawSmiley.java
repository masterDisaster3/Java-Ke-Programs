import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;;

public class DrawSmiley extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //The face
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        //The eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);


        g.drawPolygon(new int[] {100, 110, 120}, new int[] {180, 90, 150}, 3);


        //The mouth
        g.fillOval(50, 110, 120, 60);
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);



    }
}
