package com.example.salah.processingandroid;

/**
 * Created by salah on 20/04/17.
 */

import processing.core.PApplet;


public class Sketch extends PApplet {
    public void settings() {
        size(600, 600);
    }

    public void setup() {
        //
    }

    public void draw() {
        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}
