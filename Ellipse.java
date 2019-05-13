import processing.core.PApplet;

/**
 * Created by yuliav on 13/05/2019.
 */
public class Ellipse extends PApplet {
    int x;
    int y;

    public void setup() {
        x = 20;
        y = 30;
    }

    public void settings() {
        size(700, 700);
    }

    public void draw() {
        noStroke();
        fill(random(255), random(255), random(255), random(200));
        ellipse(random(700), random(700), random(10, 300), random(5, 400));
    }

    public static void main(String... args) {
        PApplet.main("Ellipse");
    }
}
