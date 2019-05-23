import processing.core.PApplet;

/**
 * Created by yuliav on 13/05/2019.
 */
public class ChangingRainbow extends PApplet {
    int r;
    int g;
    int b;


    //runs one time
    public void setup() {
        size(494, 500);
        r = 1;
        g = 1;
        b = 1;
        frameRate(30);
        background(0, 0, 100);
    }

    //RED - (255, 0 , 0)
    //ORANGE - ()

    //infinite loop - runs 60 times per second (we can change frame rate by using frameRate() method)
    public void draw() {
        if (mouseX < 1.0 * width / 3) {
            background(255 * (1 - mouseX * 3.0f / width), 255 * (mouseX * 3.0f / width), 0); //(255, 0, 0) -> (128, 128, 0) ->(0, 255, 0)
        }
        else if (mouseX  < 2.0 * width / 3) { //
            background(0, 255 * (2 - mouseX * 3.0f / width), 255 * (mouseX * 3.0f / width - 1)); //(0, 255, 0) -> (0, 128, 128) -> (0, 0, 255)
        }
        else {
            background(128 * (mouseX * 3.0f / width - 2),0,128 * (3 - mouseX * 3.0f / width)); //(0, 0, 255) -> (128, 0, 128)
        }



       // background((int)(255 * (1 - r * 3* mouseX * 1.0 / width)), (int)());



//        if (mouseX < 38 && mouseX > 0) {
//
//            background(255, 0, 0);
//        }
//        if (mouseX < 76 && mouseX > 38) {
//
//            background(255, 128, 0);
//        }
//        if (mouseX < 114 && mouseX > 76) {
//
//            background(255, 255, 0);
//        }
//
//        if (mouseX < 152 && mouseX > 114) {
//
//            background(128, 255, 0);
//        }
//        if (mouseX < 190 && mouseX > 152) {
//
//            background(0, 255, 0);
//        }
//
//        if (mouseX < 228 && mouseX > 190) {
//
//            background(0, 255, 128);
//        }
//
//        if (mouseX < 266 && mouseX > 228) {
//
//            background(0, 255, 255);
//        }
//
//        if (mouseX < 304 && mouseX > 266) {
//
//            background(0, 128, 255);
//        }
//        if (mouseX < 342 && mouseX > 304) {
//
//            background(0, 0, 255);
//        }
//        if (mouseX < 380 && mouseX > 342) {
//
//            background(128, 0, 255);
//        }
//        if (mouseX < 418 && mouseX > 380) {
//
//            background(255, 0, 255);
//        }
//
//        if (mouseX < 456 && mouseX > 418) {
//
//            background(255, 0, 128);
//        }
//        if (mouseX < 494 && mouseX > 456) {
//
//            background(128, 128, 128);
//        }


    }

    public void keyPressed() {
        background(0, 0, 100);
    }


//
}
