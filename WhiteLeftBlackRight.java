import processing.core.PApplet;

/**
 * Created by yuliav on 01/04/2019.
 *
 * Write a program that changes the background color to white when the mouse is on the
 * left side of the screen, and to black when it is on the right side of the screen.
 * Next, write a program that gradually changes the background color as you move the mouse from left to right.
 */
public class WhiteLeftBlackRight extends PApplet{
    int r;
    int g;
    int b;


    public void settings(){
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
    public void draw(){
        if(mouseX < 150){
            background(255,255,255);
        }else{

            background(0,0,0);
        }


    }

    public void keyPressed() {
        background(0, 0, 100);
    }


    public static void main(String... args) {
        PApplet.main("WhiteLeftBlackRight");
    }
}
