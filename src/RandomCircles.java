import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by edgar971 on 6/22/15.
 */
public class RandomCircles extends JPanel{
    //private variables
    private final int NUM_CIRCLES = 10, MAX_X = 350, MAX_Y = 350, MAX_RAD = 50;
    private Random generator;

    //constructor
    public RandomCircles() {
        generator = new Random();

        setBackground(Color.gray);
        setPreferredSize(new Dimension(500, 500));

    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        int radious;

    }



}
