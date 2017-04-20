package salah.android.processing;

import processing.core.PApplet;

public class Sketch extends PApplet {
    public void settings() {
        fullScreen();
    }

    public void setup() { }

    public void draw() {
        background(0);
        if (mousePressed) {
            noStroke();
            fill(255);
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}