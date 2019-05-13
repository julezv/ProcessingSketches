/**
 * Created by yuliav on 23/03/2019.
 */
import processing.core.PApplet;

public class ProcessingTest extends PApplet{
    int fading;
    int direction;

    public void settings(){
        size(500, 500);

    }

    //runs one time
    public void setup() {
        frameRate(30);
        fading = 0;
        direction = 1;
        //smooth();
        stroke(0,255,0);
        strokeWeight(3);
        background(0, 0, 255);
        rectMode(CENTER);
    }

    //infinite loop - runs 60 times per second (we can change frame rate by using frameRate() method)
    public void draw(){
        /*background(fading);
        fading += direction;
        if (fading == 255 || fading == 0) {
            direction *= -1;
        }*/
        //background(0,0,255);
        //ellipse(mouseX, mouseY, 20, 20);

        //(float) (Math.random() * 255); 0..255

        //background(random(255), random(255), random(255));
        fill(255,0,0);

        /*if (mousePressed) {
            ellipse(mouseX, mouseY, 20, 20);
        }*/
        rect(10, 10, 30, 60);



    }

    public void keyPressed() {
        background(0, 0, 255);
    }


    public static void main(String... args) {
        PApplet.main("ProcessingTest");
    }
}

