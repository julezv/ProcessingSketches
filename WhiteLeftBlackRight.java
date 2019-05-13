import processing.core.PApplet;

/**
 * Created by yuliav on 01/04/2019.
 * <p>
 * Write a program that changes the background color to white when the mouse is on the
 * left side of the screen, and to black when it is on the right side of the screen.
 * Next, write a program that gradually changes the background color as you move the mouse from left to right.
 */
public class WhiteLeftBlackRight extends PApplet {
    int r;
    int g;
    int b;


    public void settings() {
        size(500, 500);

    }

    //runs one time
    public void setup() {
        r = 0;
        g = 0;
        b = 0;
        frameRate(30);
        background(0, 0, 100);

    }

    //infinite loop - runs 60 times per second (we can change frame rate by using frameRate() method)
    public void draw() {
        if (mouseX < 5 && mouseX > 0) {

            background(255, 255, 255);
        }
        if (mouseX < 50 && mouseX > 5) {

            background(255 - 32, 255 - 32, 255 - 32);
        }
        if (mouseX < 100 && mouseX > 50) {

            background(255 - 64, 255 - 64, 255 - 64);
        }

        if (mouseX < 150 && mouseX > 100) {

            background(255 - 96, 255 - 96, 255 - 96);
        }
        if (mouseX < 200 && mouseX > 150) {

            background(96, 96, 96);
        }

        if (mouseX < 250 && mouseX > 200) {

            background(64, 64, 64);
        }

        if (mouseX < 270 && mouseX > 250) {

            background(32, 32, 32);
        }

        if (mouseX < 300 && mouseX > 270) {

            background(0, 0, 0);
        }
    }

    public void keyPressed() {
        background(0, 0, 100);
    }


    public static void main(String... args) {
        PApplet.main("WhiteLeftBlackRight");
    }
}
