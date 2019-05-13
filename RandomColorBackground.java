import processing.core.PApplet;

/**
 * Created by yuliav on 01/04/2019.
 * Change the background color to a random color every time the mouse is pressed.
 */
public class RandomColorBackground extends PApplet {


    public void settings(){
        size(500, 500);

    }

    //runs one time
    public void setup() {
        frameRate(30);
        background(0, 0, 255);

    }

    //infinite loop - runs 60 times per second (we can change frame rate by using frameRate() method)
    public void draw(){

        fill(255,0,0);

        if (mousePressed) {
            background(color(random(255), random(255), random(255)));
        }
    }

    public void keyPressed() {
        background(0, 0, 255);
    }


    public static void main(String... args) {
        PApplet.main("RandomColorBackground");
    }
}

