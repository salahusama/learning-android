package salah.android.processing;

import processing.core.PApplet;

public class Sketch extends PApplet {
    Ship myShip;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        myShip = new Ship(width / 2, height / 2);
    }

    public void draw() {
        background(0);
        if (mousePressed) {
            noStroke();
            fill(255);
            ellipse(mouseX, mouseY, 50, 50);
        }
        myShip.display();

    }

    public class Ship{
        float x;
        float y;

        public Ship(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public void display() {
            ellipse(x, y, 50f, 50f);
        }
    }
}