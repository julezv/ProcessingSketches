import processing.core.PApplet;

/**
 * Created by yuliav on 13/05/2019.
 */
public class ChangingRainbow extends PApplet {
    int r;
    int g;
    int b;


    public void settings() {
        size(494, 500);

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
        if (mouseX < 38 && mouseX > 0) {

            background(255, 0, 0);
        }
        if (mouseX < 76 && mouseX > 38) {

            background(255 , 128, 0);
        }
        if (mouseX < 114 && mouseX > 76) {

            background(255, 255, 0);
        }

        if (mouseX < 152 && mouseX > 114) {

            background(128, 255, 0);
        }
        if (mouseX < 190 && mouseX > 152) {

            background(0, 255, 0);
        }

        if (mouseX < 228 && mouseX > 190) {

            background(0, 255, 128);
        }

        if (mouseX < 266 && mouseX > 228) {

            background(0, 255, 255);
        }

        if (mouseX < 304 && mouseX > 266) {

            background(0, 128, 255);
        }
        if (mouseX < 342 && mouseX > 304) {

            background(0, 0 , 255);
        }
        if (mouseX < 380 && mouseX > 342) {

            background(128, 0, 255);
        }
        if (mouseX < 418 && mouseX > 380) {

            background(255, 0, 255);
        }

        if (mouseX < 456 && mouseX > 418) {

            background(255, 0, 128);
        }
        if (mouseX < 494 && mouseX > 456) {

            background(128, 128, 128);
        }


    }

    public void keyPressed() {
        background(0, 0, 100);
    }


    public static void main(String... args) {
        PApplet.main("ChangingRainbow");
    }
}
