/**
 * Created by edgar971 on 6/22/15.
 */
import javax.swing.JFrame;

public class DrawRandomCircles {

   public static void main(String[] args) {
       JFrame frame = new JFrame("Random Circles");
       RandomCircles panel = new RandomCircles();

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       frame.getContentPane().add(panel);
       frame.pack();
       frame.setVisible(true);
   }


}
