package com.step.assignments;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        if(width<0){
            this.width = 0;
        }
        if(length<0){
            this.length = 0;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return this.width * this.length;
    }
}
