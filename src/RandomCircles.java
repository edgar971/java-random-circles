import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by edgar971 on 6/22/15.
 */
public class RandomCircles extends JPanel{
    //private variables
    private final int NUM_CIRCLES = 10, MAX_WIDTH = 400, MAX_RAD = 200;
    private Random generator;

    //constructor
    public RandomCircles() {

        generator = new Random();
        setBackground(Color.gray);
        setPreferredSize(new Dimension(MAX_WIDTH, MAX_WIDTH));

    }

    public void paintComponent(Graphics page) {
        int radius, diameter, x = 0, y = 0;
        super.paintComponent(page);
        page.setColor(Color.white);

        for (int counter = 0; counter < NUM_CIRCLES; counter++) {
            //generate random radius
            radius = generator.nextInt(MAX_RAD) + 1;
            //calculate diameter
            diameter = radius * 2;
            //set x and y to center circle
            x = MAX_WIDTH / 2 - radius;
            y = MAX_WIDTH / 2- radius;
            //change colors
            if(counter%2 == 0) {
                page.setColor(Color.blue);
            } else {
                page.setColor(Color.green);
            }

            //create oval
            page.fillOval(x,y, diameter, diameter);

        }
    }




}
