import processing.core.PApplet;

/**
 * Created by yuliav on 13/05/2019.
 */
public class Ellipse extends PApplet {
    int x;
    int y;
    int width;
    int height;
    boolean growth;

    public void setup() {
        x = 20;
        y = 30;
        growth = true;
    }

    public void settings() {
        size(700, 700);
    }

    public void draw() {
        noStroke();
        fill(random(255), random(255), random(255), random(250));
        x = mouseX;
        y = mouseY;
        if(growth){
            width += 10;
            height += 10;
            if (width > 150 || height >150){
                growth = false;
            }
        }else{
            width -= 10;
            height -= 10;
            if (width <= 0 || height <=0 ){
                growth = true;
            }
        }
        if(mousePressed) {
            rect(x, y, width, height);
        }else{
            background(0,0,150);
        }
    }

    public static void main(String... args) {
        PApplet.main("Ellipse");
    }
}
