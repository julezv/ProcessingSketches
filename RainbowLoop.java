/**
 * Created by yuliav on 01/04/2019.
 */
/**
 * Created by yuliav on 23/03/2019.
 */
import processing.core.PApplet;

public class RainbowLoop extends PApplet{
    int r;
    int g;
    int b;
    int direction0;
    int direction1;
    int direction2;

    int counter = 0;


    public void settings(){
        size(500, 500);

    }

    //runs one time
    public void setup() {
        frameRate(100);
        r = 0;
        g = 0;
        b = 0;


        direction0 = 1;
        direction1 = 1;
        direction2 = 1;
        //smooth();
        stroke(0,255,0);
        strokeWeight(3);
        //background(0, 0, 255);
        rectMode(CENTER);
        noCursor();
    }

    //infinite loop - runs 60 times per second (we can change frame rate by using frameRate() method)
    public void draw() {
        counter++;
        //if(counter % 10 == 0) {
            background(r, g, b);
            if (r < 255 & g == 0 & b == 0) {
                r += direction0;
            }
            if (r == 255 && b == 0) {
                g += direction1;
            }
            if (b == 255 && r == 0) {
                g -= direction1;
            }
            if (g == 255 && r == 0) {
                b += direction2;
            }
            if (r == 255 && g == 0) {
                b -= direction2;
            }
            if (g == 0 && b == 255) {
                r += direction0;
            }
            if (g == 255 && b == 0) {
                r -= direction0;
            }

      //  }
        System.out.println(r);

        System.out.println(g);

        System.out.println(b);

    }
    public void keyPressed() {
        background(0, 0, 255);
    }


    public static void main(String... args) {
        PApplet.main("RainbowLoop");
    }
}

